package br.com.db1.type;

import org.junit.Test;

public class EstadosDoBrasilTest {
		
		
	
		System.out.println(EstadosDoBrasil.PARANA);
		
		@Test
		public void testarNomeDosEstados() {
		assertEquals("Paran�", EstadosDoBrasil.PARANA.getNomeEstado());
		}
		
		@Test
		public void estadosdoSulTest() {
			assertTrue(EstadosDoBrasil.getEstadosDoSul());
		}
	
}
