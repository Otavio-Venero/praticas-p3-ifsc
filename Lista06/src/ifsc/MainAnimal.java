package ifsc;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();

		dog.setNome("Gerson");
		dog.setRaca("Pastor Alemão");
		dog.setCor("Marrom com manchas brancas e pretas");
		dog.setComprimento(1.76f);
		dog.setNpatas(3);
		dog.setEcossistema("Guarda Roupas");

		dog.caminha();
		dog.late();
		
		System.out.println(dog.getNome());
		System.out.println(dog.getRaca());
		System.out.println(dog.getCor());
		System.out.println(dog.getComprimento());
		System.out.println(dog.getNpatas());
		System.out.println(dog.getEcossistema());
		System.out.println(" ");
		
		Gato cat = new Gato();

		cat.setNome("Alfonso");
		cat.setRaca("Persian");
		cat.setCor("Laranja");
		cat.setComprimento(1.45f);
		cat.setNpatas(4);
		cat.setEcossistema("Meu Quarto");

		cat.caminha();
		cat.mia();

		System.out.println(cat.getNome());
		System.out.println(cat.getRaca());
		System.out.println(cat.getCor());
		System.out.println(cat.getComprimento());
		System.out.println(cat.getNpatas());
		System.out.println(cat.getEcossistema());
		System.out.println(" ");

	}

}
