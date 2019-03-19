package dk.cphbusiness.pets.presentation;

import dk.cphbusiness.pets.logic.PetManager;
import javax.servlet.http.HttpServletRequest;

public interface Command {
  String execute(HttpServletRequest request, PetManager manager);
  }
