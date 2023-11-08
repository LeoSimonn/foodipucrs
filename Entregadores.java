

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
    
    public String getFormaDeEntrega(){
        return formaDeEntrega;
    }
    
    public String getTelefoneEntregador(){
        return telefoneEntregador;
    }
    
}
