package fr.uvsq.pglp.Exercice4_2;

public class Generic {
	
	public void quit() {
		System.out.println("Commande \"quit\" executer");
		System.exit(0);
	}
	
	public void undo(MoteurRpn moteur) {
		moteur.depiler();
	}

}
