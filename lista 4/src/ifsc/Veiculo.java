package ifsc;

public class Veiculo {
//string nome,int ano,int nrodas,string fabrcante,string cor
	private String Nome;
	private Integer Ano;
	private Integer Nrodas;
	private String Fabricante;
	private String Cor;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getAno() {
		return Ano;
	}
	public void setAno(Integer ano) {
		Ano = ano;
	}
	public Integer getNrodas() {
		return Nrodas;
	}
	public void setNrodas(Integer nrodas) {
		Nrodas = nrodas;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	
}
