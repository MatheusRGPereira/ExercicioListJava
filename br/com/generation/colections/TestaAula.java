package br.com.generation.colections;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula ("Arraylist", 90);
		Aula a2 = new Aula ("list", 72);
		Aula a3 = new Aula ("Colectio", 120);

		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		for(Aula l: aulas) {
		System.out.println(l);
		}
	}

}
