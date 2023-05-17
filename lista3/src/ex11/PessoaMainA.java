package ex11;

public class PessoaMainA {

	public static void main(String[] args) {
		/*Crie uma classe “Pessoa” sem método main. Você deve definir três atributos públicos: 
		  nome (String), cpf (Long) e data de nascimento (String). Crie uma outra classe 
		  “PessoaMainA” que tenha método main e instancie três objetos de “Pessoa” sem usar 
		  um for array. Preencha valores para estes três objetos no próprio código (hardcoding) 
		  sem usar Scanner. Ao final você deve exibir os dados usando a classe System porém sem 
		  usar for array.*/
		Pessoa p = new Pessoa();
		
		p.nome = "Otávio";
		p.ddnascimento = "13/01/2006";
		p.cpf = 12345678956l;
		System.out.println("A pessoa " + p.nome + " que possui o cpf n° " + p.cpf + " faz aniversario no dia " + p.ddnascimento);
		p.nome = "Vitória";
		p.ddnascimento = "13/01/2006";
		p.cpf = 18624514551l;
		System.out.println("A pessoa " + p.nome + " que possui o cpf n° " + p.cpf + " faz aniversario no dia " + p.ddnascimento);
		p.nome = "Pedro";
		p.ddnascimento = "27/12/2011";
		p.cpf = 43415545214l;
		System.out.println("A pessoa " + p.nome + " que possui o cpf n° " + p.cpf + " faz aniversario no dia " + p.ddnascimento);
	}

}
