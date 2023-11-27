public class Entrega {
    
    private Pedido pedido;
    private Entregador entregador;
    private String statusEntrega;


    public Entrega(Pedido pedido, Entregador entregador, String statusEntrega) {
        
        this.pedido = pedido;
        this.entregador = entregador;
        this.statusEntrega = statusEntrega;
        
    }

    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido (Pedido pedido){
        this.pedido = pedido;
    }

    public Entregador getEntregador() {
        return entregador;
    }
    
    public void setEntregador(Entregador entregador){
        this.entregador = entregador;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }
    
    public void setStatusEntrega(String status){
        this.statusEntrega = status;
    }

    // Metodo toString

    public String toString() {
        return "DADOS DO PEDIDO | Código do Pedido: " + this.pedido.getCodPedido() + " | Entregador: " + this.entregador.getNomeEntregador() + " | Status de Entrega: " + this.statusEntrega;
    }
    
    // Método Especial 
    
    public boolean entregaDeBike() {
        
        if (this.entregador.getFormaDeEntrega().equalsIgnoreCase("Bicicleta")) {
            
            return true;
            
        }
        
        return false; 
    }

}




