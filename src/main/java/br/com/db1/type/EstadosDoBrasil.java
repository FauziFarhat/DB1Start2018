package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	
	AMAPA("Paraná", "PR"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	RIO_GRANDE_DO_SUL("Rio grande do Sul", "RS"),
	SAO_PAULO("São Paulo", "SP"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	BAHIA("Bahia", "BH"), 
	PARANA("Paraná", "PR"), 
	GOIAS("Goiás", "GO"), 
	DISTRITO_FEDERAL("Distrito Federal", "DF"), 
	PERNAMBUCO("Pernambuco", "PE"),
	AMAZONAS("Amazonas", "AM"), 
	PARA("Pará", "PA"), 
	CEARA("Ceará", "CE"), 
	EPIRITO_SANTO("Espírito Santo", "ES"), 
	MARANHAO("Maranhão", "MA"), 
	MATO_GROSSO("Mato Grosso", "MT"), 
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"), 
	PARAIBA("Paraíba", "PB"),
	ALAGOAS("Alagoas", "AL"), 
	PIAUI("Piauí", "PI"), 
	ACRE("Acre", "AC"), 
	TOCANTINS("Tocantins", "TO"), 
	RONDONIA("Rondônia", "RO"), 
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"), 
	SERGIPE("Sergipe", "SE"), 
	RORAIMA("Roraima", "RR");
	
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
