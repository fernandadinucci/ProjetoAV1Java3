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
    ArrayList<Veiculo> estoqueDeCarros= new ArrayList<Veiculo>();
    ArrayList<Veiculo> estoqueDeMotos = new ArrayList<Veiculo>();
    
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
    
    
    public boolean estaCadastrado(Veiculo v)
    {
        if ((estoqueDeCarros.contains(v) == true) || (estoqueDeMotos.contains(v) == true)) {
            return true;
        }
        else
            return false;        
    }

    public void adicionarVeiculo(OpcoesVeiculo ov, String chassi, MontadoraDeVeiculo montadora, 
            ModeloDeVeiculo modelo, Cor cor, TipoDeVeiculo tipo, float preco)
    {
        Veiculo v = new Veiculo();
        v.propriedades.put("Opcao de Veiculo", ov);
        v.setChassi(chassi);
        v.propriedades.put("Montadora", montadora);
        v.propriedades.put("Modelo", modelo);
        v.propriedades.put("Cor", cor);
        v.propriedades.put("Tipo", tipo);
        v.setPreco(preco);
        if(estaCadastrado(v))
        {
            System.out.println("Erro: Veiculo já cadastrado!");
        }
        else
        {
            if (ov == OpcoesVeiculo.Carro) { 
                estoqueDeCarros.add(v);
                System.out.println("Carro cadastrado com sucesso!");
            }
            else
            {
                if (ov == OpcoesVeiculo.Motocicleta) {
                    estoqueDeMotos.add(v);
                    System.out.println("Moto cadastrada com sucesso!");
                }
            }
        }
    }

    public void pesquisarVeiculo(OpcoesVeiculo ov, String chassi, MontadoraDeVeiculo montadora, 
            ModeloDeVeiculo modelo, Cor cor, TipoDeVeiculo tipo, float preco)
    {
        Veiculo v = new Veiculo();
        v.propriedades.put("Opcao de Veiculo", ov);
        v.setChassi(chassi);
        v.propriedades.put("Montadora", montadora);
        v.propriedades.put("Modelo", modelo);
        v.propriedades.put("Cor", cor);
        v.propriedades.put("Tipo", tipo);
        v.setPreco(preco);
        
        if (ov == OpcoesVeiculo.Carro) {
            if (estoqueDeCarros.contains(v))
                System.out.println("Carro encontrado!");
            else
                System.out.println("Carro não encontrado!");
        }    
    
        if (ov == OpcoesVeiculo.Motocicleta) {
            if (estoqueDeMotos.contains(v)) {
                System.out.println("Moto encontrada!");
            }
            else
                System.out.println("Moto não encontrada!");
        }
    }
    
    
    public void pesquisarCarro(String chassi)
    {
        int aux = 0;
        
        for (Veiculo v : estoqueDeCarros) {
            if(v.getChassi()==chassi) {
                aux= 1;
                for(@SuppressWarnings("rawtypes") Enum valoresEnum: v.propriedades.values())
                {
                    System.out.println(valoresEnum);
                }
                System.out.println(v.getChassi());
                System.out.println(v.getPreco());
            }
        }
        
        if (aux== 0) {
            System.out.println("Carro não encontrado!");
        }
        
    }
    
    public void pesquisarMoto(String chassi)
    {
        int aux = 0;
        
        for (Veiculo v : estoqueDeMotos) {
            if(v.getChassi()==chassi) {
                aux= 1;
                for(@SuppressWarnings("rawtypes") Enum valoresEnum: v.propriedades.values())
                {
                    System.out.println(valoresEnum);
                }
                System.out.println(v.getChassi());
                System.out.println(v.getPreco());
            }
        }
        if (aux == 0) {
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
            for (Veiculo v : estoqueDeCarros) {
                for(@SuppressWarnings("rawtypes") Enum valoresEnum: v.propriedades.values())
                {
                    System.out.println(valoresEnum);
                }
                System.out.println(v.getChassi());
                System.out.println(v.getPreco());
                System.out.println("");
            }
        }
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
            for (Veiculo v : estoqueDeMotos) {
                for(@SuppressWarnings("rawtypes") Enum valoresEnum: v.propriedades.values())
                {
                    System.out.println(valoresEnum);
                }
                System.out.println(v.getChassi());
                System.out.println(v.getPreco());
                System.out.println("");
            }
        }
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
            for (Veiculo v : estoqueDeCarros)
            {
                outCarros.writeObject(v);
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
            for (Veiculo v : estoqueDeMotos)
            {
                outMotos.writeObject(v);
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
                 Veiculo v= (Veiculo) in.readObject();
                 if (v.propriedades.containsValue(OpcoesVeiculo.Carro))
                     estoqueDeCarros.add(v);
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
                 Veiculo v = (Veiculo) in.readObject();
                 if (v.propriedades.containsValue(OpcoesVeiculo.Motocicleta))
                     estoqueDeMotos.add(v);
             }
             in.close();
             fileIn.close();
        }
         catch(IOException | ClassNotFoundException io)
         {
             
         }
         
     }
     
}