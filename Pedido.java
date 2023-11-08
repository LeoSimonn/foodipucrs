
public class Pedido {
    private String formaPagamento;
    private int[][] pedidoInfo;
    private Estabelecimento estabelecimento;
    private Cliente cliente;
    private String codPedido;
    private Date dataPedido;

    public Pedido(String formaPagamento, int[][] pedidoInfo, Estabelecimento estabelecimento, Cliente cliente,
            String codPedido) {
        this.formaPagamento = formaPagamento;
        this.pedidoInfo = pedidoInfo;
        this.estabelecimento = estabelecimento;
        this.cliente = cliente;
        this.codPedido = codPedido;
        this.dataPedido = new Date(); // Captura a data e hora atual
    }

    // Getters e Setters

    public String getFormaPagemento() {
        return this.formaPagemento;
    }

    public void setFormaPagemento(String formaPagemento) {
        this.formaPagemento = formaPagemento;
    }

    public String getDataPedido() {
        return this.dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getCodigoEntrega() {
        return this.codigoEntrega;
    }

    public void setCodigoEntrega(int codigoEntrega) {
        this.codigoEntrega = codigoEntrega;
    }

    public int[][] getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int[][] estoque) {
        this.estoque = estoque;
    }

    public Estabelecimento getEstabelecimento() {
        return this.estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos

    public void mostrarPedido(String codPedido) {
        Pedido pedido = registroPedidos.get(codPedido);
        if (pedido != null) {
            System.out.println("Forma de pagamento: " + pedido.getFormaPagamento());
            System.out.println("Data do pedido: " + pedido.getDataPedido());
            System.out.println("Código do pedido: " + pedido.getCodPedido());
            System.out.println("Pedido: " + Arrays.deepToString(pedido.getPedidoInfo()));
            System.out.println("Estabelecimento: " + pedido.getEstabelecimento().getNomeEstab());
            System.out.println("Cliente: " + pedido.getCliente().getNome());
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    public String realizarPedido(String formaPagamento, int[][] pedidoInfo, Estabelecimento estabelecimento,
            Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Pedido: " + Arrays.deepToString(pedidoInfo));
        System.out.println("Estabelecimento: " + estabelecimento.getNomeEstab());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.print("Você confirma o pedido? (S/N): ");

        String acao = scanner.nextLine();

        if ("S".equalsIgnoreCase(acao)) {
            String codPedido = UUID.randomUUID().toString(); // Gera um código de pedido único
            System.out.println("Pedido realizado com sucesso! Código do pedido: " + codPedido);
            return "Pedido realizado com sucesso! Código do pedido: " + codPedido;
        } else {
            System.out.println("Pedido cancelado!");
            return "Pedido cancelado!";
        }
        scanner.close();
    }

}
