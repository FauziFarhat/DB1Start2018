package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDeColecao {

	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
	}
	
	public static ArrayList<String> exercicio1(){
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Laranja");
		cores.add("Azul");
		return cores;
	}
	
	public static Integer exercicio2() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Fauzi");
		nomes.add("Fauzao");
		return nomes.size();
	}
	
	public static List<String> exercicio3(){
		List<String> parentes = new ArrayList<String>();
		parentes.add("Pai");
		parentes.add("Mãe");
		parentes.add("Irmão");
		parentes.add("Irmã");
		parentes.add("Tio");
		parentes.add("Tia");
		parentes.add("Primo");
		parentes.remove("Pai");
		parentes.remove("Mãe");
		return parentes;
	}
	
	public static List<String> exercicio4(){
		List<String> cidades = new ArrayList<String>();
		cidades.add("Campo Grande");
		cidades.add("Nova Andradina");
		cidades.add("Batayporã");
		cidades.remove(1);
		return cidades;
	}
	
	public static List<String> exercicio5(){
		List<String> cores = new ArrayList<String>();
		cores = exercicio1();
		System.out.println(cores);
		Collections.sort(cores);
		System.out.println(cores);
		return cores	;
	}
	
	
}
