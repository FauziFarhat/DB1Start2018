package br.com.db1.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest() {
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("Pc", TipoLogradouro.PRACA.getSiglaLogradouro());
		assertEquals("Fz", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals("Av", TipoLogradouro.AVENIDA.getSiglaLogradouro());
	}
	
	@Test
	public void descricaoLogradouroTest() {
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Pra�a", TipoLogradouro.PRACA.getDescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLogradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLogradouro());
	}
}
