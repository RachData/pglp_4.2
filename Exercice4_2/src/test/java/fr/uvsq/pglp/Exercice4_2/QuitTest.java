package fr.uvsq.pglp.Exercice4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuitTest {

	@Test
	public void test() {
		
		Generic genericProg=new Generic();
		
		genericCommand quitprog = new Quit(genericProg);
		
		Interpreteur interprete = new Interpreteur();
		interprete.register("quit", quitprog);
		
		interprete.execute("quit");
		
		
	}

}
