package fr.uvsq.pglp.Exercice4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UndoTest {

	@Test
	public void test() {
		Generic genericProg=new Generic();
		
		genericCommand undoprog = new Undo(genericProg);
		
		Interpreteur commanGenrric = new Interpreteur();
		commanGenrric.register("undo", undoprog);
		
		commanGenrric.execute("undo");
	}

}
