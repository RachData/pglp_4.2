package fr.uvsq.pglp.Exercice4_2;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
	
	private int a,b;
	
	private Stack <Double> pile =new Stack<>();
	
	private final HashMap<String, Commands> commandMap = new HashMap<>();
	 
	public void register(String commandName, Commands command) {
	        commandMap.put(commandName, command);
	    }
	    
	public void execute(String commandName) {
	        Commands command = commandMap.get(commandName);
	        if (command == null) {
	            throw new IllegalStateException("no command registered for " + commandName);
	        }
	        if (commandName.contentEquals("undo"))
	        command.apply();
	}

}
