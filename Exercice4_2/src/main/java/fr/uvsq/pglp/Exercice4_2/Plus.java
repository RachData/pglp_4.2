package fr.uvsq.pglp.Exercice4_2;

import java.util.EmptyStackException;
import java.util.Stack;

public class Plus implements SpecificCommands {
	private final Specific calcul; 
	private final MoteurRpn moteur;
	
	public Plus(Specific calcul,MoteurRpn moteur) {
		this.calcul=calcul;
		this.moteur=moteur;
	}

	@Override
	public void apply() {
		double a=0,b = 0;
		int vide=0;//variable permettant de verifier si la pile est vide ou contient plus d'un element
		try {
			a= moteur.depiler();
			vide++;
	    	b= moteur.depiler();
			moteur.enregistrer(this.operation(b, a));
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Ajoutez une operande ...");
			if(vide==1)
				moteur.enregistrer(a);
		}
		
	}

	@Override
	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return calcul.plus(a, b);
	}


}
