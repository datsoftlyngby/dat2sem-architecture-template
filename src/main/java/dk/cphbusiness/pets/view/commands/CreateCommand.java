package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.control.PetManager;
import dk.cphbusiness.pets.model.Pet;
import javax.servlet.http.HttpServletRequest;

class CreateCommand implements Command {
  private final String target;
  
  CreateCommand(String target) { this.target = target; }

  @Override
  public String execute(HttpServletRequest request, PetManager manager) {
    Pet pet = new Pet(0, "", 0);
    request.setAttribute("pet", pet);
    return target;
    }
  
  }
