package fr.uvsq.pglp.Exercice4_2;

import java.util.Stack;

public class Undo implements genericCommand {
	
	//private Stack <Double> pile =new Stack<>();
	private final Generic undo; 
	
	public Undo(Generic undo) {
		this.undo=undo;

		
	}

	@Override//command
	public void apply() {
		// TODO Auto-generated method stub
		undo.undo();
		
	}

}
