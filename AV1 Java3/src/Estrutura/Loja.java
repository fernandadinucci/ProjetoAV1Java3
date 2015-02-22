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
	
	//Todos os Getters and Setters prontos!
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
	
	/*Os métodos "estaCadastrado" para carro e moto, funcionam como um mecanismo de busca dentro do array primitivo.
	 * Após "entrar" no array, ele utiliza o "equals" para comparar os dois elementos.
	 * Como um método boolean, ele retorna verdadeiro se for igual, e falso caso contrário.*/
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
	
	/*Os métodos "adicionarCarro" e "adicionarMoto" recebem por parâmetro os atributos das classes em questão.
	 * Além desses atributos eles também recebem o "index" que seria a posição dentro do array.
	 * Primeiro um objeto carro recebe todos os parâmetros, para depois verificarmos se já existe dentro do array
	 * um carro igual. Caso já exista, ele retorna uma mensagem de carro já cadastrado e não inseri o mesmo.
	 * Caso seja um carro diferente, ele insere dentro do array na posição index os dados desse carro.
	 * Nesses dois métodos foi necessário tratar o "NullPointerException".*/
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
 	
 	/*Os métodos "pesquisarCarro" e "pesquisarMoto" recebem atributos das classes por parâmetro.
 	 * Nesses métodos elaborei uma árvore de "if" para verificar atributo por atributo até retornar se encontrou ou não.
 	 * Necessário tratar o "NullPointerException".*/
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
 	 												System.out.println("Chassi: "+estoqueDeCarros[i].getChassi()+" | Montadora: "+estoqueDeCarros[i].getMontadora()+
 	 												" | Modelo: "+estoqueDeCarros[i].getModelo()+" | Cor: "+estoqueDeCarros[i].getCor()+" | Tipo: "+estoqueDeCarros[i].getTipo()+
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
 	
 	/*Os métodos de pesquisa por chassi, recebem apenas o chassi por parâmetro.
 	 * Necessário tratar o "NullPointerException"*/
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
 	
 	/*Nos métodos de "listarEstoque" foi implementado um for para percorrer todo o array.
 	 * Caso a posição do array seja igual a null, ele imprime que a vaga está disponivel.
 	 * Se estiver ocupada, ele imprime o veículo em questão.
 	 * Necessário tratar "NullPointerException".*/
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
 	
 	/*No método "limparEstoque", foi utilizado um for para percorrer todo o array e atribuir null a todas as posições.
 	 * Assim, o Array se torna "vazio".*/
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
 	
 	/* Em "gravarEstoque" foram utilizados "FileOutputStream" e "ObjectOutputStream" para permitir a saída para um arquivo externo.
 	 * Utilizado o "writeObject" para "escrever" no arquivo de texto.
 	 * Depois só precisou "fechar" o arquivo.
 	 * Necessário tratar IOException.*/
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
 	
 	/* Em "recuperarEstoque" foi necessário utilizar "FileInputStream" e "ObjectInputStream" para permitir a entrada de um arquivo externo.
 	 * Enquanto o arquivo não chegar ao final e "i" for menor que o tamanho do array, um objeto carro ou moto estará recebendo o objeto do arquivo txt.
 	 * Após receber o arquivo o "if" vai verificar se esse veículo é null. Caso não seja, ele atribui ao array os atributos desse veículo e parti para o próximo laço.
 	 * Necessário tratar IOException, NullPointerException e ClassNotFoundException.*/
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