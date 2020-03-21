package fr.uvsq.pglp.Exercice4_2;

import java.util.Stack;

public class MoteurRpn {
	
	/**
	 * La Pile qui va stocke les operandes
	 */
    public Stack <Double> pile =new Stack<>();
	
    /**
     * les comme
     */
	private Specific specificProg=new Specific();
	private SpecificCommands calculplus = new Plus(specificProg,this);
	private SpecificCommands calculmoins = new Moins(specificProg,this);
	
	private Interpreteur interpre = new Interpreteur();
	
	
	public MoteurRpn() {
		
	}
	
	public void initMoteurRpn() {
		interpre.register("+", calculplus);
		interpre.register("-", calculmoins);
	}
	
    
    /**
     * Methode d'enregistrement des operandes
     * @param operande
     */
	public void enregistrer (double operande)
    {
        this.pile.push(operande);
    }
	
	/**
     * Methode retour des operandes
     * @param operande
     */
    public double depiler(){

		return pile.pop();

}
    
	/**
	 * Methode charger d'effectuer les calcules en fontion de l'operateur recu
	 * @param symbole : operateur saisie par l'utilisateur
	 * @return Renvoie le Resultat de l'operation
	 * @throws ClasseException : Exception qui g�re la division par zero
	 * @throws PilevideException : Exception qui g�re si la pile est vide
	 * @throws ManqueOperandeException : Exception qui g�re le manque d'operande 
	 * pour effectuer l'operation
	 */
    public void apply  (char symbole)
     {
    	
			switch(symbole)
			 {
			    case '+': 
			        interpre.execute("+");
			        break;
		         //return 0;
			         
			    case '-':
			    	//this.enregistrer(Operation.MULT.eval(b, a));
			    	interpre.execute("-");
			    	

			 
			 }
     }

}
