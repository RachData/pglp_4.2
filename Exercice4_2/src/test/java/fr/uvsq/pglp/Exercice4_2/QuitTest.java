package fr.uvsq.pglp.Exercice4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuitTest {

	@Test
	public void test() {
		
		Generic genericProg=new Generic();
		
		genericCommand quitprog = new Quit(genericProg);
		
		Interpreteur commanGenrric = new Interpreteur();
		commanGenrric.register("quit", quitprog);
		
		commanGenrric.execute("quit");;
		
	}

}
