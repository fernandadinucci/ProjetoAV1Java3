package Estrutura;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Loja 
{
	
	private String endereco;
	private String nome;
	private ArrayList<Carro> estoqueDeCarros = new ArrayList<Carro>();
	private ArrayList<Motocicleta> estoqueDeMotos = new ArrayList<Motocicleta>();
	
	public String getEndereco() 
	{
		return endereco;
	}
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public boolean estaCadastrado(Carro carro)
	{
		if(estoqueDeCarros.contains(carro))
			return true;
		return false;
	}
	
	public boolean estaCadastrado(Motocicleta moto)
	{
		if(estoqueDeMotos.contains(moto))
			return true;
		return false;
	}
	
	public void adicionarCarro(String chassi, String montadora, String modelo, String cor, String tipo, float motorizacao, String cambio, float preco )
	{
		
		Carro c = new Carro();
		
		c.setChassi(chassi);
		c.setMontadora(montadora);
		c.setModelo(modelo);
		c.setCor(cor);
		c.setTipo(tipo);
		c.setMotorizacao(motorizacao);
		c.setCambio(cambio);
		c.setPreco(preco);
		
		if(estaCadastrado(c))
		{
			System.out.println("Erro: Carro já cadastrado!");
		}
		else
		{
			estoqueDeCarros.add(c);
			System.out.println("Carro cadastrado com sucesso!");
		}
		
	}
	
 	public void adicionarMoto(String chassi, String montadora, String modelo, String cor, int cilindrada, int capacidadeDoTanque, float preco)
	{
		
		Motocicleta m = new Motocicleta();
		
		m.setChassi(chassi);
		m.setMontadora(montadora);
		m.setModelo(modelo);
		m.setCor(cor);
		m.setCilindrada(cilindrada);
		m.setCapacidadeDoTanque(capacidadeDoTanque);
		m.setPreco(preco);
		
		if(estaCadastrado(m))
		{
			System.out.println("Erro: Motocicleta já cadastrada!");
		}
		else
		{
			estoqueDeMotos.add(m);
			System.out.println("Motocicleta cadastrada com sucesso!");
		}
		
	}
 	
 	public void pesquisarCarro(String chassi, String montadora, String modelo, String cor, String tipo, float motorizacao, String cambio, float preco)
 	{
 		
 		int aux = 0;
 		
 		for (Carro carro : estoqueDeCarros) {
			if((carro.getChassi()==chassi)||(chassi == null))
			{
				if((carro.getMontadora()==montadora)||(montadora == null))
				{
					if((carro.getModelo()==modelo)||(modelo == null))
					{
						if((carro.getCor()==cor)||(cor == null))
						{
							if((carro.getTipo()==tipo)||(tipo == null))
							{
								if((carro.getMotorizacao()==motorizacao)||(motorizacao == 0))
								{
									if((carro.getCambio()==cambio)||(cambio == null))
									{
										if((carro.getPreco() == preco)||(preco == 0))
										{
											aux += 1;
											System.out.println("Chassi: "+carro.getChassi()+" | Montadora: "+carro.getMontadora()+" | Modelo: "+carro.getModelo()+" | Cor: "+carro.getCor()+" | Tipo: "+
											carro.getTipo()+" | Motorização: "+carro.getMotorizacao()+" | Cambio: "+carro.getCambio()+" | Preço: "+carro.getPreco());
										}
									}
								}
							}
						}
					}
				}
			}
		}
 		if(aux == 0)
 		{
 			System.out.println("Carro não encontrado!");
 		}
 	}
 	
 	public void pesquisarMoto(String chassi, String montadora, String modelo, String cor, int cilindrada, int capacidadeDoTanque, float preco)
 	{
 		
 		int aux = 0;
 		
 		for (Motocicleta moto : estoqueDeMotos) {
			if((moto.getChassi()==chassi)||(chassi == null))
			{
				if((moto.getMontadora()==montadora)||(montadora == null))
				{
					if((moto.getModelo()==modelo)||(modelo == null))
					{
						if((moto.getCor()==cor)||(cor == null))
						{
							if((moto.getCilindrada()==cilindrada)||(cilindrada == 0))
							{
								if((moto.getCapacidadeDoTanque()==capacidadeDoTanque)||(capacidadeDoTanque == 0))
								{
									if((moto.getPreco() == preco)||(preco == 0))
									{
										aux += 1;
										System.out.println("Chassi: "+moto.getChassi()+" | Montadora: "+moto.getMontadora()+" | Modelo: "+moto.getModelo()+" | Cor: "+moto.getCor()+
										" | Cilindrada: "+moto.getCilindrada()+" | Capacidade do Tanque de Combustível: "+moto.getCapacidadeDoTanque()+" | Preço: "+moto.getPreco());
									}
								}
							}
						}
					}
				}
			}
		}
 		if(aux == 0)
 		{
 			System.out.println("Moto não encontrada!");
 		}
 	}
 	
 	public void pesquisarCarro(String chassi)
 	{
 		int aux = 0;
 		
 		for (Carro carro : estoqueDeCarros) {
			if(carro.getChassi()==chassi)
			{
				aux += 1;
				System.out.println("Chassi: "+carro.getChassi()+" | Montadora: "+carro.getMontadora()+" | Modelo: "+carro.getModelo()+" | Cor: "+carro.getCor()+" | Tipo: "+
				carro.getTipo()+" | Motorização: "+carro.getMotorizacao()+" | Cambio: "+carro.getCambio()+" | Preço: "+carro.getPreco());
			}
		}
 		if(aux == 0)
 		{
 			System.out.println("Carro não encontrado!");
 		}
 		
 	}
 	
 	public void pesquisarMoto(String chassi)
 	{
 		int aux = 0;
 		
 		for (Motocicleta moto : estoqueDeMotos) {
			if(moto.getChassi()==chassi)
			{
				aux += 1;
				System.out.println("Chassi: "+moto.getChassi()+" | Montadora: "+moto.getMontadora()+" | Modelo: "+moto.getModelo()+" | Cor: "+moto.getCor()+
				" | Cilindrada: "+moto.getCilindrada()+" | Capacidade do Tanque de Combustível: "+moto.getCapacidadeDoTanque()+" | Preço: "+moto.getPreco());
			}
		}
 		if(aux == 0)
 		{
 			System.out.println("Moto não encontrada!");
 		}
 	}
 	
 	public void listarEstoquedeCarros()
 	{
 		
 		System.out.println("Listando carros cadastrados...\n");
 		if(estoqueDeCarros.isEmpty())
 		{
 			System.out.println("Estoque vazio!");
 		}
 		else
 		{
 	 		for (Carro carro : estoqueDeCarros) {
 				System.out.println("Chassi: "+carro.getChassi()+" | Montadora: "+carro.getMontadora()+" | Modelo: "+carro.getModelo()+" | Cor: "+carro.getCor()+" | Tipo: "+
 				carro.getTipo()+" | Motorização: "+carro.getMotorizacao()+" | Cambio: "+carro.getCambio()+" | Preço: "+carro.getPreco());
 			}
 		}
 		System.out.println("");
 		
 	}
	
 	public void listarEstoquedeMotos()
 	{
 		
 		System.out.println("Listando motos cadastradas...\n");
 		if(estoqueDeMotos.isEmpty())
 		{
 			System.out.println("Estoque vazio!");
 		}
 		else
 		{
 			for (Motocicleta moto : estoqueDeMotos) {
 				System.out.println("Chassi: "+moto.getChassi()+" | Montadora: "+moto.getMontadora()+" | Modelo: "+moto.getModelo()+" | Cor: "+moto.getCor()+" | Cilindrada: "
 				+moto.getCilindrada()+" | Capacidade do Tanque de Combustível: "+moto.getCapacidadeDoTanque()+" | Preço: "+moto.getPreco());
 			}
 		}
 		System.out.println("");
 	}
 	
 	public void limparEstoque()
 	{
 		estoqueDeCarros.clear();
 		estoqueDeMotos.clear();
 	}
 	
 	public void gravarEstoque()
 	{
 	
 		try
 		{
 			FileOutputStream fileOutCarros = new FileOutputStream("estoqueDeCarros.txt");
 			ObjectOutputStream outCarros = new ObjectOutputStream(fileOutCarros);
 	 		for (Carro carro : estoqueDeCarros)
 	 		{
 	 			outCarros.writeObject(carro);
 	 		}
 	 		outCarros.close();
 		 	fileOutCarros.close();
 	 		System.out.println("Estoque de carros salvo com sucesso!");
 		}
 		catch(IOException io)
 		{
 			System.out.println("Erro: "+io);
 		}
 		try
 		{
 			FileOutputStream fileOutMotos = new FileOutputStream("estoqueDeMotos.txt");
 			ObjectOutputStream outMotos = new ObjectOutputStream(fileOutMotos);
 	 		for (Motocicleta moto : estoqueDeMotos) 
 	 		{
 	 			outMotos.writeObject(moto);
 			}
 	 		outMotos.close();
 	 		fileOutMotos.close();
 		}
 		catch(IOException io)
 		{
 			System.out.println("Erro: "+io);
 		}
 		
 		System.out.println("Estoque de motos salvo com sucesso!");
 		
 	}
 	
 	@SuppressWarnings("null")
	public void recuperarEstoque()
 	{
 
 		try
	 	{
	 		FileInputStream fileIn = new FileInputStream("estoqueDeCarros.txt");
	 		ObjectInputStream in = new ObjectInputStream(fileIn);
	 		while(fileIn != null)
	 		{
	 			Carro carro = (Carro) in.readObject();
	 			estoqueDeCarros.add(carro);
	 		}
	 		in.close();
	 		fileIn.close();
	 	}
		catch(IOException | ClassNotFoundException io)
		{
		}
 		
 		try
	 	{
	 		FileInputStream fileIn = new FileInputStream("estoqueDeMotos.txt");
	 		ObjectInputStream in = new ObjectInputStream(fileIn);
	 		while(fileIn != null)
	 		{
	 			Motocicleta moto = (Motocicleta) in.readObject();
	 			estoqueDeMotos.add(moto);
	 		}
	 		in.close();
	 		fileIn.close();
	 	}
		catch(IOException | ClassNotFoundException io)
		{
		}
 		
 	}
 	
}