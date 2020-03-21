package fr.uvsq.pglp.Exercice4_2;

import java.util.Stack;

public class Undo implements genericCommand {
	
	private final Generic undo; 
	private final MoteurRpn moteur;
	public Undo(Generic undo,MoteurRpn moteur) {
		this.undo=undo;
		this.moteur=moteur;
		
	}

	@Override//command
	public void apply() {
		// TODO Auto-generated method stub
		undo.undo(this.moteur);
		
		
	}
	
	

}
