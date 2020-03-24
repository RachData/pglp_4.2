package fr.uvsq.pglp.Exercice4_2;

import java.util.Stack;

public class Undo implements genericCommand {
	
	private final Generic undo; 
	private final Stack <Double> history;
	private final MoteurRpn moteur;
	public Undo(Generic undo,Stack <Double> history,MoteurRpn moteur) {
		this.moteur = moteur;
		this.undo=undo;
		this.history=history;
		
	}

	@Override//command
	public void apply() {
		// TODO Auto-generated method stub
		undo.undo(this.history,this.moteur);
		
		
	}
	
	

}
