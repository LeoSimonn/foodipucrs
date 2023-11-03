public class Pedidos {

    private int codPedido;
    private Estabelecimento estabelecimento;
    private Cliente cliente;
    private String formaPagemento;
    private String dataPedido;
    private int codigoEntrega;
    private int [][] pedidoInfo;
    //estoque = codItem + quantidade

    public Pedidos(int codPedido, String formaPagemento, String dataPedido, 
    int codigoEntrega, int [][] pedidoInfo, Estabelecimento estabelecimento, 
    Cliente cliente){

        this.codPedido = codPedido;
        this.formaPagemento = formaPagemento;
        this.dataPedido = dataPedido;
        this.codigoEntrega = codigoEntrega;
        this.pedidoInfo = pedidoInfo;
        this.estabelecimento = estabelecimento;
        this.cliente = cliente;

    }

    // Getters e Setters

    public String getFormaPagemento(){
        return this.formaPagemento;
    }

    public void setFormaPagemento(String formaPagemento){
        this.formaPagemento = formaPagemento;
    }

    public String getDataPedido(){
        return this.dataPedido;
    }

    public void setDataPedido(String dataPedido){
        this.dataPedido = dataPedido;
    }

    public int getCodigoEntrega(){
        return this.codigoEntrega;
    }

    public void setCodigoEntrega(int codigoEntrega){
        this.codigoEntrega = codigoEntrega;
    }

    public int [][] getEstoque(){
        return this.estoque;
    }

    public void setEstoque(int [][] estoque){
        this.estoque = estoque;
    }

    public Estabelecimento getEstabelecimento(){
        return this.estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento){
        this.estabelecimento = estabelecimento;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    // Métodos

    public mostrarPedido(int codPedido){

        System.out.println("Forma de pagamento: " + this.formaPagemento);
        System.out.println("Data do pedido: " + this.dataPedido);
        System.out.println("Código da entrega: " + this.codigoEntrega);
        System.out.println("Pedido: " + this.pedidoInfo);
        System.out.println("Estabelecimento: " + this.estabelecimento);
        System.out.println("Cliente: " + this.cliente);

    }



}