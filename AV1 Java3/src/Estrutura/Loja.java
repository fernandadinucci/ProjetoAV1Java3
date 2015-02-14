package Estrutura;

public class Loja {
	private String enderešo;
	private String nome; 
	private Carro[] estoqueDeCarros; 
	private Motocicleta[] estoqueDeMotocicletas;
	
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Carro[] getEstoqueDeCarros() {
		return estoqueDeCarros;
	}
	public void setEstoqueDeCarros(Carro[] estoqueDeCarros) {
		this.estoqueDeCarros = estoqueDeCarros;
	}
	public Motocicleta[] getEstoqueDeMotocicletas() {
		return estoqueDeMotocicletas;
	}
	public void setEstoqueDeMotocicletas(Motocicleta[] estoqueDeMotocicletas) {
		this.estoqueDeMotocicletas = estoqueDeMotocicletas;
	} 
}
