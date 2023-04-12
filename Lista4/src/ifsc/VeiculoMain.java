package ifsc;

import java.util.ArrayList;

public class VeiculoMain {

	// DE 1 ATÉ A 3!!!!
	
	public static void main(String[] args) {
		Veiculo vruum = new Veiculo();
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		vruum.setNome("Celta");
		//String nome = vruum.getNome();
		//System.out.println("Nome do carro: " + nome);
		vruum.setAno(2006);
		//Integer ano = vruum.getAno();
		//System.out.println("Ano do carro: " + ano);
		vruum.setNrodas(4);
		//Integer rodas = vruum.getNrodas();
		//System.out.println("Número de rodas: " + rodas);
		vruum.setFabricante("Chevrolet");
		//String fabricant = vruum.getFabricante();
		//System.out.println("A fabricante do carro é: " + fabricant);
		vruum.setCor("Verde");
		//String cor = vruum.getCor();
		//System.out.println("A cor do carro é: " + cor);
		
		System.out.println(" ");
		Veiculo katchau = new Veiculo();
		
		katchau.setNome("Kombi");
		//String nome2 = katchau.getNome();
		//System.out.println("Nome do carro: " + nome2);
		katchau.setAno(1972);
		//Integer ano2 = katchau.getAno();
		//System.out.println("Ano do carro: " + ano2);
		katchau.setNrodas(4);
		//Integer rodas2 = katchau.getNrodas();
		//System.out.println("Número de rodas: " + rodas2);
		katchau.setFabricante("Volkswagen");
		//String fabricant2 = katchau.getFabricante();
		//System.out.println("A fabricante do carro é: " + fabricant2);
		katchau.setCor("Amarelo e Branco");
		//String cor2 = katchau.getCor();
		//System.out.println("A cor do carro é: " + cor2);
		
		System.out.println(" ");
		Veiculo carrinhoblaublau = new Veiculo();
		
		carrinhoblaublau.setNome("Maverick v8");
		//String nome3 = carrinhoblaublau.getNome();
		//System.out.println("Nome do carro: " + nome3);
		carrinhoblaublau.setAno(1975);
		//Integer ano3 = carrinhoblaublau.getAno();
		//System.out.println("Ano do carro: " + ano3);
		carrinhoblaublau.setNrodas(4);
		//Integer rodas3 = carrinhoblaublau.getNrodas();
		//System.out.println("Número de rodas: " + rodas3);
		carrinhoblaublau.setFabricante("Ford");
		//String fabricant3 = carrinhoblaublau.getFabricante();
		//System.out.println("A fabricante do carro é: " + fabricant3);
		carrinhoblaublau.setCor("Vermelho");
		//String cor3 = carrinhoblaublau.getCor();
		//System.out.println("A cor do carro é: " + cor3);
		
		
		veiculos.add(vruum);
		veiculos.add(katchau);
		veiculos.add(carrinhoblaublau);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNrodas());
		}
	}

}
