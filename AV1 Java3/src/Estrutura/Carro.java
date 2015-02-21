package Estrutura;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Carro implements Serializable {

	private String chassi;
	private String montadora;
	private String modelo;
	private String cor;
	private String tipo;
	private float motorizacao;
	private String cambio;
	private float preco;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cambio == null) ? 0 : cambio.hashCode());
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result
				+ ((montadora == null) ? 0 : montadora.hashCode());
		result = prime * result + Float.floatToIntBits(motorizacao);
		result = prime * result + Float.floatToIntBits(preco);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Carro))
			return false;
		Carro other = (Carro) obj;
		if (cambio == null) {
			if (other.cambio != null)
				return false;
		} else if (!cambio.equals(other.cambio))
			return false;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
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
		if (Float.floatToIntBits(motorizacao) != Float
				.floatToIntBits(other.motorizacao))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

}

