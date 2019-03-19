package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.control.PetManager;
import javax.servlet.http.HttpServletRequest;

class TargetCommand implements Command {
  private final String target;

  TargetCommand(String target) {
    this.target = target;
    }
  
  @Override
  public String execute(HttpServletRequest request, PetManager manager) {
    return target;
    }
  
  }
