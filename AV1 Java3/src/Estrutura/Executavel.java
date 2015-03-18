package Estrutura;
    
    public class Executavel {
    
    public static void main(String[] args)
    {
    
        System.out.println(" ...::: Consecionária DINUPES :::...\n");
    
        System.out.println("Cadastrando veiculos...\n");
        Loja l1= new Loja();
        l1.adicionarVeiculo(OpcoesVeiculo.Carro, "1001", MontadoraDeVeiculo.Ford, ModeloDeVeiculo.FOX, Cor.PRATA, TipoDeVeiculo.Sedan, 60000.00f);
        l1.adicionarVeiculo(OpcoesVeiculo.Carro, "1002", MontadoraDeVeiculo.Volkswagen, ModeloDeVeiculo.GOL, Cor.PRETO, TipoDeVeiculo.Hatch, 60000.00f);
        l1.adicionarVeiculo(OpcoesVeiculo.Carro, "1003", MontadoraDeVeiculo.Toyota, ModeloDeVeiculo.HILUX, Cor.BRANCO, TipoDeVeiculo.Picape, 60000.00f);
        l1.adicionarVeiculo(OpcoesVeiculo.Motocicleta, "1004", MontadoraDeVeiculo.Honda, ModeloDeVeiculo.HORNET, Cor.PRATA, TipoDeVeiculo.Esportivo, 60000.00f);
        l1.adicionarVeiculo(OpcoesVeiculo.Motocicleta, "1005", MontadoraDeVeiculo.Yamaha, ModeloDeVeiculo.TÉNÉRÉ, Cor.AZUL, TipoDeVeiculo.BigTrail, 60000.00f);
        l1.adicionarVeiculo(OpcoesVeiculo.Motocicleta, "1006", MontadoraDeVeiculo.Honda, ModeloDeVeiculo.TWISTER, Cor.VERMELHO, TipoDeVeiculo.Street, 60000.00f);
        System.out.println();
        l1.listarEstoquedeCarros();
        System.out.println();
        l1.listarEstoquedeMotos();
        
        System.out.println("Pesquisando veiculos...\n");
        l1.pesquisarVeiculo(OpcoesVeiculo.Carro, "1001", MontadoraDeVeiculo.Ford, ModeloDeVeiculo.FOX, Cor.PRATA, TipoDeVeiculo.Sedan, 60000.00f);
        l1.pesquisarVeiculo(OpcoesVeiculo.Motocicleta, "1016", MontadoraDeVeiculo.Honda, ModeloDeVeiculo.FALCON, Cor.VERMELHO, TipoDeVeiculo.Trail, 60000.00f);
        System.out.println();
        
        System.out.println("Pesquisando veiculos pelo chassi...\n");
        l1.pesquisarCarro("1011");
        l1.pesquisarCarro("1001");
        l1.pesquisarMoto("1010");
        l1.pesquisarMoto("1006");
        System.out.println();
    
        System.out.println("Salvando o estoque em txt...\n");
        l1.gravarEstoque();
        System.out.println();
    
        System.out.println("Esvaziando o estoque...\n");
        l1.limparEstoque();
        System.out.println();
        l1.listarEstoquedeCarros();
        l1.listarEstoquedeMotos();
        System.out.println();
    
        System.out.println("Recuperando estoque do txt...\n");
        l1.recuperarEstoque();
        System.out.println();
        l1.listarEstoquedeCarros();
        l1.listarEstoquedeMotos();
        }
    }
