package fr.uvsq.pglp.Exercice4_2;

public class Moins implements SpecificCommands{
	
	private final Specific calcul; 
	private final MoteurRpn moteur;
	
	public Moins(Specific calcul,MoteurRpn moteur) {
		this.calcul=calcul;
		this.moteur=moteur;
	}

	@Override
	public void apply() {
		double a=0,b = 0;
		a= moteur.depiler();
    	b= moteur.depiler();
		moteur.enregistrer(this.operation(a, b));
		
	}

	@Override
	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return calcul.moins(a, b);
	}


}
