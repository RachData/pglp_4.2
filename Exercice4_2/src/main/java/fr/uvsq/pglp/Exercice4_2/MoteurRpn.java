package fr.uvsq.pglp.Exercice4_2;

import java.util.EmptyStackException;
import java.util.Stack;

public class MoteurRpn {
	
	/**
	 * La Pile qui va stocke les operandes
	 */
    private Stack <Double> pile =new Stack<>();
    public Stack <Double> history =new Stack<>();
	
    /**
     * les commandes specifiques pour les operations
     */
	private Specific specificProg=new Specific();
	private SpecificCommands calculplus = new Plus(specificProg,this);
	private SpecificCommands calculmoins = new Moins(specificProg,this);
	private SpecificCommands calculmult = new Mult(specificProg,this);
	private SpecificCommands calculdiv = new Div(specificProg,this);
	
	/**
	 * les commandes generiques
	 */
	private Generic genericProg= new Generic();
	private genericCommand commandquit= new Quit(genericProg);
	private genericCommand commandundo= new Undo(genericProg,this.history, this);
	
	/**
	 * l'interpreteur de commande
	 */
	private Interpreteur interpre = new Interpreteur();
	
	
	/**
	 * Initialisation de l'interpretateur
	 */
	public void initMoteurRpn() {
		
		interpre.register("+", calculplus);
		interpre.register("-", calculmoins);
		interpre.register("*", calculmult);
		interpre.register("/", calculdiv);
		
		interpre.register("quit", commandquit);
		interpre.register("undo", commandundo);

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
    	
    		if(this.pile.isEmpty()) {
   	    		throw new EmptyStackException() ;
    		}
    		else
    		{
    			this.history.push(pile.peek());
    			return pile.pop();
    		}
		
    }
    
    /**
     * Methode qui execute la commande correspond passer
     * @param commande
     */
    public void apply  (String commande)
     {
        	interpre.execute(commande);
     }
    
    /**
     * Methode d'affichage de l'expression courante 
     */
    public void affiche() {
    	System.out.print("L'expression courante est:\t");
    	if(!this.pile.isEmpty()) {
    		for(int i=0;i< this.pile.size();i++){
    			System.out.print(this.pile.elementAt(i)+"\t");
    		}	
    	}
    	System.out.println("");
    }

}
