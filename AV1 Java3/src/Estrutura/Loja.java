package Estrutura;

public class Loja {
	private String endere�o;
	private String nome; 
	private Carro[] estoqueDeCarros; 
	private Motocicleta[] estoqueDeMotocicletas;
	
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
