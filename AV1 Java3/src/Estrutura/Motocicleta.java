package Estrutura;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Motocicleta implements Serializable
{
	//Serializable: para dizer que os membros desta classe são "seriáveis".
	
	//Nessa classe retirei o atributo "tipo" por não achar necessário.
	private String chassi;
	private String montadora;
	private String modelo;
	private String cor;
	private int cilindrada;
	private int capacidadeDoTanque;
	private float preco;
	//Private: para maior segurança dos dados.
	
	//Todos os Getters and Setters prontos!
	public String getChassi() 
	{
		return chassi;
	}
	public void setChassi(String chassi) 
	{
		this.chassi = chassi;
	}
	public String getMontadora() 
	{
		return montadora;
	}
	public void setMontadora(String montadora) 
	{
		this.montadora = montadora;
	}
	public String getModelo() 
	{
		return modelo;
	}
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	public String getCor() 
	{
		return cor;
	}
	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	public int getCilindrada() 
	{
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) 
	{
		this.cilindrada = cilindrada;
	}
	public int getCapacidadeDoTanque() 
	{
		return capacidadeDoTanque;
	}
	public void setCapacidadeDoTanque(int capacidadeDoTanque) 
	{
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	public float getPreco() 
	{
		return preco;
	}
	public void setPreco(float preco) 
	{
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadeDoTanque;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result + cilindrada;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result
				+ ((montadora == null) ? 0 : montadora.hashCode());
		result = prime * result + Float.floatToIntBits(preco);
		return result;
	}
	
	//Sobrescrevendo o método equals.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Motocicleta))
			return false;
		Motocicleta other = (Motocicleta) obj;
		if (capacidadeDoTanque != other.capacidadeDoTanque)
			return false;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		if (cilindrada != other.cilindrada)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (montadora == null) {
			if (other.montadora != null)
				return false;
		} else if (!montadora.equals(other.montadora))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		return true;
	}
	
}
