public class Entrega {
    private double pedido;
    private double entregador;
    private String statusEntrega;
    private String detalhesEntrega;

    public entrega(double pedido, double entregador, String statusEntrega) {
        this.pedido = pedido;
        this.entregador = entregador;
        this.statusEntrega = statusEntrega;
        this.detalhesEntrega = "Pedido: " + pedido + ", Entregador: " + entregador + ", Status de Entrega: " + statusEntrega;
    }

    public double getPedido() {
        return pedido;
    }

    public double getEntregador() {
        return entregador;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    public String getDetalhesEntrega() {
        return detalhesEntrega;
    }
}




