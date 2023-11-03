public class Pedidos {

    private Estabelecimento estabelecimento;
    private Cliente cliente;
    private String formaPagemento;
    private String dataPedido;
    private int codigoEntrega;
    private int [][] estoque;
    // estoque = codItem + quantidade

    public Pedidos(String formaPagemento, String dataPedido, 
    int codigoEntrega, int [][] estoque, Estabelecimento estabelecimento, 
    Cliente cliente){

        this.formaPagemento = formaPagemento;
        this.dataPedido = dataPedido;
        this.codigoEntrega = codigoEntrega;
        this.estoque = estoque;
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

    



}