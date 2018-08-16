package br.com.db1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExercicioDeColecaoTest {

	@Test
	public void exercicio1Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio1().get(0).equals("Azul"));
		assertTrue(ex.exercicio1().get(1).equals("Laranja"));
	}
	
	@Test
	public void exercicio2Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio2() == 2);
	}
	
	@Test
	public void exercicio3Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio3().get(0) != "Pai");
		assertTrue(ex.exercicio3().get(1) != "Mãe");
	}
	
	@Test
	public void exercicio4Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio4().get(1) != "Nova Andradina");
	}
	
	@Test
	public void exercicio5Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();

	}
}
