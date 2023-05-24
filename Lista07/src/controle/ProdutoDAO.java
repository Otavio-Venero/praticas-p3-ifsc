package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> lista;
	public ProdutoDAO() {
		lista = new ArrayList<>();
	}
	public boolean inserir(Produto p) {
		lista.add(p);
		return true;
	}
	public boolean alterar (Produto p) {
		for (Produto produto : lista) {
			if(produto.getCodbarras() == p.getCodbarras()) {
				produto.setCodbarras(p.getCodbarras());
				produto.setNome(p.getNome()); // perguntar para prof se deixa isso aqui
			}
		}
		return false;
	}
	public boolean excluir(Produto produtoExcluir) {
		for (Produto produto : lista) {
			if(produto.getNome() == produtoExcluir.getNome()) {
				lista.remove(produto);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Produto> listar() {
		return this.lista;
	}
	
	
	
	
}
