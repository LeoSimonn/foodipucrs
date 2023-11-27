public class Entregador{

    private String nomeEntregador;
    private String formaDeEntrega;
    private String telefoneEntregador;
    
    public Entregador(String nomeEntregador, String formaDeEntrega, String telefoneEntregador){
        
        this.nomeEntregador = nomeEntregador;
        this.formaDeEntrega = formaDeEntrega;
        this.telefoneEntregador = telefoneEntregador;
    
    }
    
    //Métodos Get e Set
    
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

    //Metodo ToString
    
    public String toString(){
        return "DADOS DO ENTREGADOR | Nome do Entregador: " + this.nomeEntregador + " | Forma de Entrega: " + this.formaDeEntrega + " | Telefone do Entregador: " + this.telefoneEntregador;
    }
    
    //Método Especial 
    
    public boolean ehXara(Cliente cliente) {
        
        if (this.nomeEntregador.equalsIgnoreCase(cliente.getNomeCli())) {
            
            return true;
            
        }
        
        return false; 
        
    }
    
}
