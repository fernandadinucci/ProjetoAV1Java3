package Estrutura;

public class Loja {
	private String endereço;
	private String nome; 
	private Carro[] estoqueDeCarros; 
	private Motocicleta[] estoqueDeMotocicletas;
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
