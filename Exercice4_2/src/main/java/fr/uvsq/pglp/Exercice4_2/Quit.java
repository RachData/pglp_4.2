package fr.uvsq.pglp.Exercice4_2;

public class Quit implements genericCommand {
	
	private final Generic quit; 
	
	public Quit(Generic quit) {
		this.quit=quit;
		
	}

	@Override//command
	public void apply() {
		// TODO Auto-generated method stub
		quit.quit();
		
	}

}
