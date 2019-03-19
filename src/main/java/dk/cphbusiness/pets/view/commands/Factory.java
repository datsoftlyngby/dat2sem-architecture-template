package dk.cphbusiness.pets.view.commands;

import java.util.HashMap;
import java.util.Map;

public class Factory {
  private static Factory instance = null;
  private final Map<String, Command> commands = new HashMap();
  
  private Factory() {
    
    }
  
  
  
  }
