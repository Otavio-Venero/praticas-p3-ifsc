package ifsc;

import java.util.ArrayList;

public class ProdutoMain {

	public static void main(String[] args) {

		ArrayList<Produto> Compras = new ArrayList<>();

		Produto cafe = new Produto();
		cafe.setNome("Cafe");
		cafe.setCodBarras(45899647512l);
		cafe.setFornecedor("Três Corações");
		cafe.setPreco(5.25);
		Compras.add(cafe);
		Produto leite = new Produto();
		leite.setNome("Leite");
		leite.setCodBarras(7456328642l);
		leite.setFornecedor("Tirol");
		leite.setPreco(2.99);
		Compras.add(leite);
		Produto pao = new Produto();
		pao.setNome("Pao");
		pao.setCodBarras(8745215781l);
		pao.setFornecedor("Panificadora Presente");
		pao.setPreco(0.50);
		Compras.add(pao);
		
		for (Produto produto : Compras) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getPreco());
			System.out.println(" ");
		}
	}
}
