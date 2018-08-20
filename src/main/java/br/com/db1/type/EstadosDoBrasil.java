package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	
	AMAPA("Paran�", "PR"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	RIO_GRANDE_DO_SUL("Rio grande do Sul", "RS"),
	SAO_PAULO("S�o Paulo", "SP"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	BAHIA("Bahia", "BH"), 
	PARANA("Paran�", "PR"), 
	GOIAS("Goi�s", "GO"), 
	DISTRITO_FEDERAL("Distrito Federal", "DF"), 
	PERNAMBUCO("Pernambuco", "PE"),
	AMAZONAS("Amazonas", "AM"), 
	PARA("Par�", "PA"), 
	CEARA("Cear�", "CE"), 
	EPIRITO_SANTO("Esp�rito Santo", "ES"), 
	MARANHAO("Maranh�o", "MA"), 
	MATO_GROSSO("Mato Grosso", "MT"), 
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"), 
	PARAIBA("Para�ba", "PB"),
	ALAGOAS("Alagoas", "AL"), 
	PIAUI("Piau�", "PI"), 
	ACRE("Acre", "AC"), 
	TOCANTINS("Tocantins", "TO"), 
	RONDONIA("Rond�nia", "RO"), 
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
