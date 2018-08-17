package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioDeColecao {

	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
		exercicio8();
		exercicio14();
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
		Collections.sort(cores);
		return cores;
	}
	
	public static List<String> exercicio6(){
		List<String> cores = new ArrayList<String>();
		cores = exercicio1();
		cores.remove("Laranja");
		return cores;
	}
	
	public static List<String> exercicio7(){
		List<String> parentes = new ArrayList<String>();
		parentes = exercicio3();
		Collections.sort(parentes);
		Collections.reverse(parentes);
		return parentes;
	}
	
	public static List<Integer> exercicio8(){
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		for(Integer posicao = 1; posicao <=20; posicao++ ) {
			if(posicao % 2 == 0) {
				pares.add(posicao);
			}
			if(posicao % 2 != 0) {
				impares.add(posicao);
			}
		}
		total.addAll(pares);
		total.addAll(impares);
		return total;
	}
	
	public static Set<String> exercicio14(){
		Set<String> nomes = new TreeSet<String>();
		nomes.add("ANA");
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO");
		nomes.add("VAGNER");
		nomes.add("JOSÉ");
		nomes.add("JOALDO");
		nomes.add("CLECIO");
		nomes.add("JOSÉ");
		nomes.add("MARIA");
		nomes.add("MARCOS");
		System.out.println(nomes);
		return nomes;	
	}	
}
