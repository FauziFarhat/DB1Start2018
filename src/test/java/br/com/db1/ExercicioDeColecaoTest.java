package br.com.db1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExercicioDeColecaoTest {

	@Test
	public void exercicio1Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio1().get(0).equals("Laranja"));
		assertTrue(ex.exercicio1().get(1).equals("Azul"));
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
		assertTrue(ex.exercicio5().get(0) == "Azul");
	}
	
	@Test
	public void exercicio6Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio6().get(0) == "Azul");
	}
	
	@Test
	public void exercicio7Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio7().get(0) == "Tio");
	}
	
	@Test
	public void exercicio8Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio8().get(0) == 2);
	}
	
	@Test
	public void exercicio14Test() {
		ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(ex.exercicio14().contains("ANA"));
	}
}
