package exercicio_01_CollectionArrayList;

import java.util.ArrayList;

public class Exercicio_01_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		String cor = String.valueOf("Azul");

		cores.add(cor);
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Laranja");

		System.out.println("\nListar todas as cores: " + cores);
		
		
		cores.sort(null);

		System.out.println("\nOrdenar as cores: ");

		for (String cor0 : cores) {
			System.out.println(cor0);

		}
	}

}
