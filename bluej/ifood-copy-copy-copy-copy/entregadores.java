

public class entregadores
{
    private String nomeEntregador;
    private String formaDeEntrega;
    private String telefoneEntregador;
    
    public entregadores(String nomeEntregador, String formaDeEntrega, String telefoneEntregador){
        this.nomeEntregador = nomeEntregador;
        this.formaDeEntrega = formaDeEntrega;
        this.telefoneEntregador = telefoneEntregador;
    }
    
    public String getNomeEntregador(){
        return nomeEntregador;
    }
    
    public void setNomeEntregador (String nomeEntregador){
        this.nomeEntregador = nomeEntregador;
    }
    
    public String getFormaDeEntrega(){
        return formaDeEntrega;
    }
    
    public void setFormaDeEntrega (String formaDeEntrega){
        this.formaDeEntrega = formaDeEntrega;
    }
    
    public String getTelefoneEntregador(){
        return telefoneEntregador;
    }
    
    public void setTelefoneEntregador (String telefoneEntregador){
        this.telefoneEntregador = telefoneEntregador;
    }
    
}
