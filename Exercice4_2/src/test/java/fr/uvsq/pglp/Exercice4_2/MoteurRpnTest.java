package fr.uvsq.pglp.Exercice4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRpnTest {

	@Test
	public void test() {
		MoteurRpn moteur = new MoteurRpn();
		moteur.initMoteurRpn();
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("+");
		assertTrue(moteur.depiler()==10);
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("-");
		assertTrue(moteur.depiler()==0);
		
	}

}
