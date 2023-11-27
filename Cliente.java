public class Cliente {
    
    private String nomeCli; 
    private String cpfCli; 
    private String telefoneCli; 
    private String ruaCli; 
    private int numeroCli; 
    private String complementoCli; 
    private String bairroCli; 
    private String cidadeCli; 
    private String ufCli; 
    
    // Método Construtor
    
    public Cliente(String nomeCli, String cpfCli, String telefoneCli, String ruaCli, int numeroCli, String complementoCli, String bairroCli, String cidadeCli, String ufCli){
        
        this.nomeCli = nomeCli;
        this.cpfCli = cpfCli; 
        this.telefoneCli = telefoneCli;
        this.ruaCli = ruaCli; 
        this.numeroCli = numeroCli; 
        this.complementoCli = complementoCli;
        this.bairroCli = bairroCli; 
        this.cidadeCli = cidadeCli;
        this.ufCli = ufCli; 
        
    }
    
    // Getters e Setters 
    
    public String getNomeCli() {
        
        return this.nomeCli; 
        
    }
    
    public void setNomeCli(String nomeCli) {
        
        this.nomeCli = nomeCli;
        
    }
    
    
    
    public String getCpfCli() {
        
        return this.cpfCli; 
        
    }
    
    public void setCpfCli(String cpfCli) {
        
        this.cpfCli = cpfCli; 
        
    }
    
    
    
    public String getTelCli() {
        
        return this.telefoneCli; 
        
    }
    
    public void setTelCli(String telefoneCli) {
        
        this.telefoneCli = telefoneCli;
        
    }
    
    
    
    public String getRuaCli() {
        
        return this.ruaCli; 
        
    }
    
    public void setRuaCli(String ruaCli) {
        
        this.ruaCli = ruaCli; 
        
    }
    
    
    
    public int getNumeroCli() {
        
        return this.numeroCli; 
        
    }
    
    public void setNumeroCli(int numeroCli) {
        
        this.numeroCli = numeroCli;  
        
    }
    
    
    
    public String getComplementoCli() {
        
        return this.complementoCli; 
        
    }
    
    public void setComplementoCli(String complementoCli) {
        
        this.complementoCli = complementoCli;   
        
    }
    
    
    
    public String getBairroCli() {
        
        return this.bairroCli; 
        
    }
    
    public void setBairroCli(String bairroCli) {
        
        this.bairroCli = bairroCli;    
        
    }
    
    
    
    public String getCidadeCli() {
        
        return this.cidadeCli; 
        
    }
    
    public void setCidadeCli(String cidadeCli) {
        
        this.cidadeCli = cidadeCli;    
        
    }
        
    
    
    public String getUfCli() {
        
        return this.ufCli; 
        
    }
    
    public void setUfCli(String ufCli) {
        
        this.ufCli = ufCli;    
        
    }
    
    
    // Método toString 
    
    public String toString() {
        
        return "Cliente: " + this.nomeCli + " | CPF: " + this.cpfCli + " cadastrado com sucesso!";
        
    }
    
    
    // Método adicional
    
    public boolean validaSeEhGaucho() {
                
        if (this.ufCli.equalsIgnoreCase("RS")) {
         
            return true; 
            
        } 
        
        return false; 
    }
}