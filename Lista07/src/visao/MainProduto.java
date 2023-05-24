package visao;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto(); // Para Instanciar
		
		p.setNome("Pao");
		p.setCodbarras(123485412121l);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);
		for(Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}
		p.setNome("Arroz");
		dao.alterar(p);
		for(Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}
		dao.excluir(p);
		for(Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}
	}

}
