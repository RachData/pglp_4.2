package fr.uvsq.pglp.Exercice4_2;

public class Undo implements genericCommand {

	private final Generic undo; 
	
	public Undo(Generic undo) {
		this.undo=undo;
		
	}

	@Override//command
	public void apply() {
		// TODO Auto-generated method stub
		undo.undo();;
		
	}

}
