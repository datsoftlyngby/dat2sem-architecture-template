package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.control.PetManager;
import dk.cphbusiness.pets.model.Pet;
import javax.servlet.http.HttpServletRequest;

class SaveCommand implements Command {
  private final String target;
  private final String source;
  
  SaveCommand(String target, String source) { 
    this.target = target;
    this.source = source;
    }

  private int parse(String text, String message) throws CommandException {
    try {
      return Integer.parseInt(text);
      }
    catch (NumberFormatException nfe) {
      throw new CommandException(message+": "+text, source);
      }
    }
  
  @Override
  public String execute(
      HttpServletRequest request,
      PetManager manager
      ) throws CommandException {
    int id = parse(request.getParameter("id"), "Invalid id");
    String name = request.getParameter("name");
    int age = parse(request.getParameter("age"), "Invalid age");
    Pet pet = new Pet(id, name, age);
    pet = manager.save(pet);
    request.setAttribute("pet", pet);
    return target;
    }
  
  }
