package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	
	AMAPA("Paraná", "PR"),
	SANTA_CATARINA("Santa Catarina"),
	RIO_GRANDE_DO_SUL("Rio grande do Sul"),
	SAO_PAULO("São Paulo"),
	RIO_DE_JANEIRO("Rio de Janeiro"),
	MINAS_GERAIS("Minas Gerais"),
	ESPIRITO_SANTO("Espírito Santo");
	/*BAHIA, PARANA, GOIAS, DISTRITO_FEDERAL, PERNAMBUCO,
	AMAZONAS, PARA, CEARA, EPIRITO_SANTO, MARANHAO, MATO_GROSSO, MATO_GROSSO_DO_SUL, PARAIBA,
	ALAGOAS, PIAUI, ACRE, TOCANTINS, RONDONIA, RIO_GRANDE_DO_NORTE, SERGIPE, RORAIMA;*/
	
	private String nomeDoEstado;
	private String uf;
	
	
	public String getNomeEstado() {
		return nomeDoEstado;
	}
	
	private EstadosDoBrasil(String nome, String uf) {
		this.nomeDoEstado = nome;
	}
	
	public static List<EstadosDoBrasil> getEstadosDoSul(){
		List<EstadosDoBrasil> uf = new ArrayList<EstadosDoBrasil>();
		uf.add(EstadosDoBrasil.PARANA);
		
	}
	
	
}
