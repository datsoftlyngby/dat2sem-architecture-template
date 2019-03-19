package dk.cphbusiness.pets.view.commands;

public class CommandException extends Exception {
  private final String target;
  
  CommandException(String message, String target) {
    super(message);
    this.target = target;
    }
  
  CommandException(String message) {
    this(message, "error.jsp");
    }
  
  public final String getTarget() { return target; }
  
  }
