package ifsc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		pessoa[] pessoas = new pessoa[3];
		for (int i = 0; i < pessoas.length; i++) {
			pessoa p = new pessoa();
			System.out.println("informe o cpf: ");
		p.cpf = leitura.nextLine();
			System.out.println("informe o dono do cpf");
		p.nome = leitura.nextLine();
		pessoas[i] = p; //armazena no vetor
		}
		//Instanciar um objeto da classe Pessoa
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("A pessoa " + pessoas[i].nome + " tem o cpf n° " + pessoas[i].cpf);
		}
		

	}

}
