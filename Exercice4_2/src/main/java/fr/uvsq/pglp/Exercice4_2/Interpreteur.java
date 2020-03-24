package fr.uvsq.pglp.Exercice4_2;

import java.util.HashMap;

public class Interpreteur {
	
	private final HashMap<String, Commands> commandMap = new HashMap<>();
	 
	public void register(String commandName, Commands command) {
	        commandMap.put(commandName, command);
	    }
	    
	public void execute(String commandName) {
	        Commands command = commandMap.get(commandName);
	        try {
	        	if (command == null) {
		        	System.out.println("erreur de commande ...");
		            throw new IllegalStateException("no command registered for " + commandName);
		        }
	        command.apply();
	        
	        } catch (IllegalStateException e) {
	        	
	        }
	}

}
