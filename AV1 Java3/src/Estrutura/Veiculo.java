package Estrutura;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Veiculo implements Serializable{
    //Serializable: para dizer que os membros desta classe são "seriáveis".
    private float preco;
    private String chassi;

    @SuppressWarnings("rawtypes")
    Map<String, Enum> propriedades = new HashMap<String, Enum>();
    //Private: para maior segurança dos dados.
    
    public String getChassi()
    {
        return chassi;
    }

    public void setChassi(String chassi)
    {
        this.chassi = chassi;
    }
    
    public float getPreco()
    {
        return preco;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
}