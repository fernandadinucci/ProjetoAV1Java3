package Estrutura;

import java.io.EOFException;
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
	private Carro[] estoqueDeCarros = new Carro[10];
	private Motocicleta[] estoqueDeMotos = new Motocicleta[10];
	
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
		for(int i = 0; i < estoqueDeCarros.length; i++)
		{
			if(estoqueDeCarros[i] != null)
			{
				if(estoqueDeCarros[i].equals(carro))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean estaCadastrado(Motocicleta moto)
	{
		for(int i = 0; i < estoqueDeMotos.length; i++)
		{
			if(estoqueDeMotos[i] != null)
			{
				if(estoqueDeMotos[i].equals(moto))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public void adicionarCarro(String chassi, String montadora, String modelo, String cor, String tipo, float motorizacao, String cambio, float preco, int index)
	{
		
		try
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
				estoqueDeCarros[index] = new Carro();
				estoqueDeCarros[index].setChassi(chassi);
				estoqueDeCarros[index].setMontadora(montadora);
				estoqueDeCarros[index].setModelo(modelo);
				estoqueDeCarros[index].setCor(cor);
				estoqueDeCarros[index].setTipo(tipo);
				estoqueDeCarros[index].setMotorizacao(motorizacao);
				estoqueDeCarros[index].setCambio(cambio);
				estoqueDeCarros[index].setPreco(preco);
				System.out.println("Carro cadastrado com sucesso!");				
			}
		}
		catch(NullPointerException nl)
		{
			System.out.println("Erro: "+nl);
		}
		
	}
	
 	public void adicionarMoto(String chassi, String montadora, String modelo, String cor, int cilindrada, int capacidadeDoTanque, float preco, int index)
	{
		try
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
				estoqueDeMotos[index] = new Motocicleta();
				estoqueDeMotos[index].setChassi(chassi);
				estoqueDeMotos[index].setMontadora(montadora);
				estoqueDeMotos[index].setModelo(modelo);
				estoqueDeMotos[index].setCor(cor);
				estoqueDeMotos[index].setCilindrada(cilindrada);
				estoqueDeMotos[index].setCapacidadeDoTanque(capacidadeDoTanque);
				estoqueDeMotos[index].setPreco(preco);
				System.out.println("Motocicleta cadastrada com sucesso!");
			}
		}
		catch(NullPointerException nl)
		{
			System.out.println("Erro: "+nl);
		}
		
		
	}
 	
 	public void pesquisarCarro(String chassi, String montadora, String modelo, String cor, String tipo, float motorizacao, String cambio, float preco)
 	{
 		
 		try
 		{
 			int aux = 0;
 	 		
 	 		for (int i = 0; i < estoqueDeCarros.length; i++)
 	 		{
 	 			if(estoqueDeCarros[i] != null)
 	 			{
 	 				if((estoqueDeCarros[i].getChassi()==chassi)||(chassi == null))
 	 				{
 	 					if((estoqueDeCarros[i].getMontadora()==montadora)||(montadora == null))
 	 					{
 	 						if((estoqueDeCarros[i].getModelo()==modelo)||(modelo == null))
 	 						{
 	 							if((estoqueDeCarros[i].getCor()==cor)||(cor == null))
 	 							{
 	 								if((estoqueDeCarros[i].getTipo()==tipo)||(tipo == null))
 	 								{
 	 									if((estoqueDeCarros[i].getMotorizacao()==motorizacao)||(motorizacao == 0))
 	 									{
 	 										if((estoqueDeCarros[i].getCambio()==cambio)||(cambio == null))
 	 										{
 	 											if((estoqueDeCarros[i].getPreco() == preco)||(preco == 0))
 	 											{
 	 												aux += 1;
 	 												System.out.println("Chassi: "+estoqueDeCarros[i].getChassi()+" | Montadora: "+estoqueDeCarros[i].getMontadora()+" | Modelo: "+
 	 												estoqueDeCarros[i].getModelo()+" | Cor: "+estoqueDeCarros[i].getCor()+" | Tipo: "+	estoqueDeCarros[i].getTipo()+
 	 												" | Motorização: "+estoqueDeCarros[i].getMotorizacao()+" | Cambio: "+ estoqueDeCarros[i].getCambio()+
 	 												" | Preço: "+estoqueDeCarros[i].getPreco());
 	 											}
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
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
 		
 	}
 	
 	public void pesquisarMoto(String chassi, String montadora, String modelo, String cor, int cilindrada, int capacidadeDoTanque, float preco)
 	{
 		
 		try
 		{
 	 		int aux = 0;
 	 		
 	 		for (int i = 0; i < estoqueDeMotos.length; i++)
 	 		{
 	 			if(estoqueDeMotos[i] != null)
 	 			{
 	 				if((estoqueDeMotos[i].getChassi()==chassi)||(chassi == null))
 	 				{
 	 					if((estoqueDeMotos[i].getMontadora()==montadora)||(montadora == null))
 	 					{
 	 						if((estoqueDeMotos[i].getModelo()==modelo)||(modelo == null))
 	 						{
 	 							if((estoqueDeMotos[i].getCor()==cor)||(cor == null))
 	 							{
 	 								if((estoqueDeMotos[i].getCilindrada()==cilindrada)||(cilindrada == 0))
 	 								{
 	 									if((estoqueDeMotos[i].getCapacidadeDoTanque()==capacidadeDoTanque)||(capacidadeDoTanque == 0))
 	 									{
 	 										if((estoqueDeMotos[i].getPreco() == preco)||(preco == 0))
 	 										{
 	 											aux += 1;
 	 											System.out.println("Chassi: "+estoqueDeMotos[i].getChassi()+" | Montadora: "+estoqueDeMotos[i].getMontadora()+" | Modelo: "+
 	 											estoqueDeMotos[i].getModelo()+" | Cor: "+estoqueDeMotos[i].getCor()+" | Cilindrada: "+	estoqueDeMotos[i].getCilindrada()+
 	 											" | Capacidade do Tanque: "+estoqueDeMotos[i].getCapacidadeDoTanque()+" | Preço: "+estoqueDeMotos[i].getPreco());
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
 		 		System.out.println("Motocicleta não encontrada!");
 		 	}
 		}
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
			
 	}
 	
 	public void pesquisarCarro(String chassi)
 	{
 		try
 		{
 	 		int aux = 0;
 	 		
 	 		for (int i = 0; i < estoqueDeCarros.length; i++) 
 	 		{
 				if(estoqueDeCarros[i] != null)
 				{
 					if(estoqueDeCarros[i].getChassi()==chassi)
 					{
 						aux += 1;
 						System.out.println("Chassi: "+estoqueDeCarros[i].getChassi()+" | Montadora: "+estoqueDeCarros[i].getMontadora()+" | Modelo: "+
 						estoqueDeCarros[i].getModelo()+" | Cor: "+estoqueDeCarros[i].getCor()+" | Tipo: "+	estoqueDeCarros[i].getTipo()+
 						" | Motorização: "+estoqueDeCarros[i].getMotorizacao()+" | Cambio: "+ estoqueDeCarros[i].getCambio()+
 						" | Preço: "+estoqueDeCarros[i].getPreco());
 					}
 				}
 	 		}
			if(aux == 0)
			{
				System.out.println("Carro não encontrado!");
			}
 		}
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
 	}
 	
 	public void pesquisarMoto(String chassi)
 	{
 		try
 		{
 	 		int aux = 0;
 			for(int i = 0; i < estoqueDeMotos.length; i++)
 			{
 				if(estoqueDeMotos[i] != null)
 				{
 					if(estoqueDeMotos[i].getChassi()==chassi)
 					{
 						aux += 1;
 						System.out.println("Chassi: "+estoqueDeMotos[i].getChassi()+" | Montadora: "+estoqueDeMotos[i].getMontadora()+" | Modelo: "+
						estoqueDeMotos[i].getModelo()+" | Cor: "+estoqueDeMotos[i].getCor()+" | Cilindrada: "+	estoqueDeMotos[i].getCilindrada()+
						" | Capacidade do Tanque: "+estoqueDeMotos[i].getCapacidadeDoTanque()+" | Preço: "+estoqueDeMotos[i].getPreco());
 					}
 					
 				}
 			}
 			if(aux == 0)
			{
				System.out.println("Motocicleta não encontrada!");
			}
 		}
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
 	}
 	
 	public void listarEstoquedeCarros()
 	{
 		
 		try
 		{
 	 		System.out.println("Listando carros cadastrados...\n");
 	 		for( int i = 0; i < estoqueDeCarros.length; i++)
 	 		{
 	 			if(estoqueDeCarros[i] == null)
 	 	 		{
 	 	 			System.out.println("Vaga disponível!");
 	 	 		}
 	 	 		else
 	 	 		{
 	 	 	 		System.out.println("Chassi: "+estoqueDeCarros[i].getChassi()+" | Montadora: "+estoqueDeCarros[i].getMontadora()+" | Modelo: "+estoqueDeCarros[i].getModelo()+
 	 	 	 		" | Cor: "+estoqueDeCarros[i].getCor()+" | Tipo: "+	estoqueDeCarros[i].getTipo()+" | Motorização: "+estoqueDeCarros[i].getMotorizacao()+" | Cambio: "+
 	 	 	 		estoqueDeCarros[i].getCambio()+" | Preço: "+estoqueDeCarros[i].getPreco());
 	 	 		}
 	 		}
 		}
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
 		System.out.println("");
 		
 	}
	
 	public void listarEstoquedeMotos()
 	{
 		
 		try
 		{
 	 		System.out.println("Listando motocicletas cadastradas...\n");
 	 		for( int i = 0; i < estoqueDeMotos.length; i++)
 	 		{
 	 			if(estoqueDeMotos[i] == null)
 	 	 		{
 	 	 			System.out.println("Vaga disponível!");
 	 	 		}
 	 	 		else
 	 	 		{
 	 	 	 		System.out.println("Chassi: "+estoqueDeMotos[i].getChassi()+" | Montadora: "+estoqueDeMotos[i].getMontadora()+" | Modelo: "+estoqueDeMotos[i].getModelo()+
 	 	 	 		" | Cor: "+estoqueDeMotos[i].getCor()+" | Cilindrada: "+	estoqueDeMotos[i].getCilindrada()+" | Capacidade do Tanque: "+
 	 	 	 		estoqueDeMotos[i].getCapacidadeDoTanque()+" | Preço: "+estoqueDeMotos[i].getPreco());
 	 	 		}
 	 		}
 		}
 		catch(NullPointerException nl)
 		{
 			System.out.println("Erro: "+nl);
 		}
 		System.out.println("");
 	}
 	
 	public void limparEstoque()
 	{
 		for(int i = 0; i < estoqueDeCarros.length; i++)
 		{
 	 		estoqueDeCarros[i] = null;
 		}
	 	System.out.println("Estoque de carros vazio!");
 		for(int i = 0; i < estoqueDeMotos.length; i++)
 		{
 	 		estoqueDeMotos[i] = null;
 		}
 		System.out.println("Estoque de motocicletas vazio!");
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
 	
	public void recuperarEstoque()
 	{
 
 		try
	 	{
	 		FileInputStream fileIn = new FileInputStream("estoqueDeCarros.txt");
	 		ObjectInputStream in = new ObjectInputStream(fileIn);
	 		int i = 0;
	 		while((fileIn != null)&&(i < estoqueDeCarros.length))
	 		{
	 			Carro carro = (Carro) in.readObject();
				if(carro != null)
				{
					estoqueDeCarros[i] =  new Carro();
					estoqueDeCarros[i].setChassi(carro.getChassi());
					estoqueDeCarros[i].setMontadora(carro.getMontadora());
					estoqueDeCarros[i].setModelo(carro.getModelo());
					estoqueDeCarros[i].setCor(carro.getCor());
					estoqueDeCarros[i].setTipo(carro.getTipo());
					estoqueDeCarros[i].setMotorizacao(carro.getMotorizacao());
					estoqueDeCarros[i].setCambio(carro.getCambio());
					estoqueDeCarros[i].setPreco(carro.getPreco());
				}
				i += 1;
	 		}
	 		System.out.println("Estoque de carros recuperado com sucesso!");
	 		in.close();
	 		fileIn.close();
	 	}
		catch(IOException | ClassNotFoundException | NullPointerException io)
		{
			System.out.println("Erro: "+io);
		}

 		try
	 	{
	 		FileInputStream fileIn = new FileInputStream("estoqueDeMotos.txt");
	 		ObjectInputStream in = new ObjectInputStream(fileIn);
	 		int i = 0;
	 		while((fileIn != null)&&(i < estoqueDeMotos.length))
	 		{
	 			Motocicleta moto = (Motocicleta) in.readObject();
	 			if(moto != null)
	 			{
		 			estoqueDeMotos[i] = new Motocicleta();
		 			estoqueDeMotos[i].setChassi(moto.getChassi());
		 			estoqueDeMotos[i].setMontadora(moto.getMontadora());
		 			estoqueDeMotos[i].setModelo(moto.getModelo());
		 			estoqueDeMotos[i].setCor(moto.getCor());
		 			estoqueDeMotos[i].setCilindrada(moto.getCilindrada());
		 			estoqueDeMotos[i].setCapacidadeDoTanque(moto.getCapacidadeDoTanque());
		 			estoqueDeMotos[i].setPreco(moto.getPreco());
	 			}
				i += 1;
	 		}
	 		System.out.println("Estoque de motocicletas recuperado com sucesso!");
	 		in.close();
	 		fileIn.close();
	 	}
		catch(IOException | ClassNotFoundException | NullPointerException io)
		{
			System.out.println("Erro: "+io);
		}
 		
 	}
 	
}