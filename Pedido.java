import java.util.Date; 
import java.text.SimpleDateFormat;

public class Pedido {

    private Cliente cliente;
    private int codPedido;
    private Date dataPedido;
    private int[][] itensPedido;
    private String formaPagamento;


    public Pedido(Cliente cliente, int codPedido, Date dataPedido, int[][] itensPedido, String formaPagamento) {
        
        this.cliente = cliente;
        this.codPedido = codPedido;
        this.dataPedido = dataPedido;
        this.itensPedido = itensPedido;
        this.formaPagamento = formaPagamento;
        
        }
        

    // Getters e Setters

    public String getFormaPagamento() {
        
        return this.formaPagamento;
    
    }

    public void setFormaPagemento(String formaPagamento) {
        
        this.formaPagamento = formaPagamento;
   
    }

    
    public Date getDataPedido() {
        
        return this.dataPedido;
        
    }

    public void setDataPedido(Date dataPedido) {
        
        this.dataPedido = dataPedido;
    
    }

    
    
    public int getCodPedido() {
        
        return this.codPedido;
    
    }

    public void setCodigoPedido(int codPedido) {
        
        this.codPedido = codPedido;
    
    }

    
    public int[][] getItensPedido() {
        
        return this.itensPedido;
    
    }

    public void setItensPedido(int[][] intensPedido) {
        
        this.itensPedido = itensPedido;
    
    }



    public Cliente getCliente() {
        
        return this.cliente;
    
    }

    public void setCliente(Cliente cliente) {
    
        this.cliente = cliente;
    
    }

    
    // Método toString
    
    public String toString() {
        
        return "Feito, " + this.cliente.getNomeCli() + "! O pedido código número: " + this.codPedido + " foi realizado com sucesso no dia " + getDataFormatada(); 
    }
    
    
    
    // Método para converter a data do pedido (timestamp para DD/MM/AAAA)
    
    public String getDataFormatada() {
        // Define o formato desejado
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Formata a data para o formato desejado
        String dataFormatada = sdf.format(this.dataPedido);
        return dataFormatada;
    }
    
    

    

}
