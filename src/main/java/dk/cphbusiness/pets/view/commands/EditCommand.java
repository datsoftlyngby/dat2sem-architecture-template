package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.control.PetManager;
import dk.cphbusiness.pets.model.Pet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

class EditCommand implements Command {
  private final String target;
  
  EditCommand(String target) { this.target = target; }
  
  @Override
  public String execute(
      HttpServletRequest request,
      PetManager manager
      ) throws CommandException {
    String idText = request.getParameter("id");
    try {
      int id = Integer.parseInt(idText);
      Pet pet = manager.find(id); 
      if (pet == null) throw new CommandException("Unknown pet id: "+id);
      HttpSession session = request.getSession();
      session.setAttribute("pet", pet);
      return target;
      }
    catch (NumberFormatException nfe) {
      throw new CommandException("Pet id ["+idText+"] is not an integer");
      }
    }
  
  }
