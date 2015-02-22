package Estrutura;

public class Executavel {

	public static void main(String[] args) 
	{
	
		Loja lj = new Loja();
		
		System.out.println("                    ...::: Consecionária DINUPES :::...\n");
		
		System.out.println("Cadastrando carros...\n");
		lj.adicionarCarro("1001", "Ford", "Novo Fiesta", "Branco", "Sedan", 1.6f ,"Automatico", 60000.00f, 0);
		lj.adicionarCarro("1001", "Ford", "Novo Fiesta", "Branco", "Sedan", 1.6f ,"Automatico", 60000.00f, 0);
		lj.adicionarCarro("1002", "Chevrolet", "Celta", "Verde", "Hatch", 1.0f ,"Manual", 10000.00f, 1);
		lj.adicionarCarro("1003", "Fiat", "Palio", "Prata", "Hatch", 1.4f ,"Manual", 18000.00f, 2);
		lj.adicionarCarro("1003", "Fiat", "Palio", "Prata", "Hatch", 1.4f ,"Manual", 18000.00f, 2);
		lj.adicionarCarro("1004", "Ford", "Novo Fiesta", "Vermelho", "Sedan", 1.6f ,"Automatico", 60000.00f, 3);
		lj.adicionarCarro("1005", "Renault", "Duster", "Preto", "SUV", 2.0f ,"Automatico", 80000.00f, 4);
		lj.adicionarCarro("1005", "Renault", "Duster", "Preto", "SUV", 2.0f ,"Automatico", 80000.00f, 4);
		System.out.println();
		lj.listarEstoquedeCarros();
		
		System.out.println("Cadastrando motos...\n");
		lj.adicionarMoto("2001", "Honda", "CG 150 Titan", "Branco",  150 , 20, 6000.00f, 0);
		lj.adicionarMoto("2001", "Honda", "CG 150 Titan", "Branco",  150 , 20, 6000.00f, 0);
		lj.adicionarMoto("2002", "Yamaha", "Factor YBR 125", "Verde", 125, 25, 5000.00f, 1);
		lj.adicionarMoto("2003", "Suzuki", "Yes 125", "Prata", 125, 15, 8000.00f, 2);
		lj.adicionarMoto("2003", "Suzuki", "Yes 125", "Prata", 125, 15, 8000.00f, 2);
		lj.adicionarMoto("2004", "Yamaha", "XTZ", "Vermelho", 125, 23, 7000.00f, 3);
		lj.adicionarMoto("2005", "Honda", "Biz", "Preto", 125, 18, 50000.00f, 4);
		lj.adicionarMoto("2005", "Honda", "Biz", "Preto", 125, 18, 50000.00f, 4);
		System.out.println();
		lj.listarEstoquedeMotos();
		
		System.out.println("Pesquisando carros...\n");
		lj.pesquisarCarro(null, "Fiat", null, null, null, 0, null, 0);
		lj.pesquisarCarro(null, null, "Novo Fiesta", null, null, 0, null, 0);
		System.out.println();
		
		System.out.println("Pesquisando motocicletas...\n");
		lj.pesquisarMoto(null, "Honda", null, null, 0, 0, 0);
		lj.pesquisarMoto(null, "Yamaha", null, null, 0, 0, 0);
		System.out.println();
		
		System.out.println("Pesquisando carros pelo chassi...\n");
		lj.pesquisarCarro("1001");
		lj.pesquisarCarro("1010");
		System.out.println();
		
		System.out.println("Pesquisando motos pelo chassi...\n");
		lj.pesquisarMoto("2001");
		lj.pesquisarMoto("2014");
		System.out.println();
		
		System.out.println("Salvando o estoque em txt...\n");
		lj.gravarEstoque();
		System.out.println();
		
		System.out.println("Esvaziando o estoque...\n");
		lj.limparEstoque();
		System.out.println();
		lj.listarEstoquedeCarros();
		lj.listarEstoquedeMotos();
		System.out.println();
		
		System.out.println("Recuperando estoque do txt...\n");
		lj.recuperarEstoque();
		System.out.println();
		lj.listarEstoquedeCarros();
		lj.listarEstoquedeMotos();
	}
}
