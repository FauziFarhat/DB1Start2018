package br.com.db1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExercicioDeColecaoTest {

	@Test
	public void exercicio2Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio2() == 2);
	}
}
