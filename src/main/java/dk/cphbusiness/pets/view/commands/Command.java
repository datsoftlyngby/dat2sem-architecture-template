package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.control.PetManager;
import javax.servlet.http.HttpServletRequest;

public interface Command {
  String execute(
      HttpServletRequest request,
      PetManager manager
      ) throws CommandException;
  }
