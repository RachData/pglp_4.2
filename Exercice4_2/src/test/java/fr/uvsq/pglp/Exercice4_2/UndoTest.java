package fr.uvsq.pglp.Exercice4_2;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class UndoTest {

	@Test
	public void test() {
		MoteurRpn moteur = new MoteurRpn();
		moteur.initMoteurRpn();
		moteur.enregistrer(5);
		moteur.enregistrer(5);		
		moteur.apply("undo");

	}

}
