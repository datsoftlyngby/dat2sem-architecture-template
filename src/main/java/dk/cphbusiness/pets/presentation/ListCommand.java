package dk.cphbusiness.pets.presentation;

import dk.cphbusiness.pets.data.Pet;
import dk.cphbusiness.pets.logic.PetManager;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

public class ListCommand implements Command {
  private String target;
  
  public ListCommand(String target) {
    this.target = target;
    }

  @Override
  public String execute(HttpServletRequest request, PetManager manager) {
    Collection<Pet> pets = manager.list();
    request.setAttribute("pets", pets);
    return target;
    
    }
  
  
  
  }
