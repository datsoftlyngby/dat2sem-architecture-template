package dk.cphbusiness.pets.view.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
  private static CommandFactory instance = null;
  private final Map<String, Command> commands = new HashMap();
  
  private CommandFactory() {
    Command backToMain = new TargetCommand("main.jsp");
    commands.put("list", new ListCommand("list.jsp"));
    commands.put("back", backToMain);
    commands.put("cancel", backToMain);
    commands.put("create", new CreateCommand("edit.jsp"));
    commands.put("edit", new EditCommand("edit.jsp"));
    commands.put("save", new SaveCommand("main.jsp", "edit.jsp"));
    commands.put("null", new TargetCommand("error.jsp"));
    }
  
  public static synchronized Command commandFrom(String key) {
    if (key == null) key = "back";
    if (instance == null) instance = new CommandFactory();
    return instance.commands.get(key);
    }
  
  }
