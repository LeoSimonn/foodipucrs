public class Entrega {
    private double pedido;
    private double entregador;
    private String statusEntrega;
    private String detalhesEntrega;

    public Entrega(double pedido, double entregador, String statusEntrega) {
        this.pedido = pedido;
        this.entregador = entregador;
        this.statusEntrega = statusEntrega;
        this.detalhesEntrega = "Pedido: " + pedido + ", Entregador: " + entregador + ", Status de Entrega: " + statusEntrega;
    }

    public double getPedido() {
        return pedido;
    }
    
    public void setPedido (double pedido){
        this.pedido = pedido;
    }

    public double getEntregador() {
        return entregador;
    }
    
    public void setEntregador(){
        this.entregador = entregador;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }
    
    public void setStatusEntrega(){
        this.statusEntrega = statusEntrega;
    }

    public String getDetalhesEntrega() {
        return detalhesEntrega;
    }
}




