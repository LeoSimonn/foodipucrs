public class Item {
    
    private int codItem; 
    private Estabelecimento estabelecimento; 
    private String nomeItem; 
    private String categoriaItem; 
    private double precoItem;
    
    //Construtor
    
    public Item(int codItem, Estabelecimento estabelecimento, String nomeItem, String categoriaItem, double precoItem) {
        
        this.codItem = codItem; 
        this.estabelecimento = estabelecimento; 
        this.nomeItem = nomeItem; 
        this.categoriaItem = categoriaItem; 
        this.precoItem = precoItem; 
        
    }
    
    //Getters e Setters
    
    public int getCodItem() {
        
        return this.codItem;
        
    }
    
    public void setCodItem(int codItem) {
        
        this.codItem = codItem; 
        
    }
    
    public Estabelecimento getEstab() {
        
        return this.estabelecimento; 
        
    }
    
    public void setEstab(Estabelecimento estabelecimento) {
        
        this.estabelecimento = estabelecimento; 
        
    }
    
    public String getNomeItem() {
        
        return this.nomeItem;
        
    }
    
    public void setNomeItem(String nomeItem) {
        
        this.nomeItem = nomeItem;
        
    }
    
    public String getCategoriaItem() {
        
        return this.categoriaItem; 
        
    }
    
    public void setCategoriaItem(String categoriaItem) {
        
        this.categoriaItem = categoriaItem; 
        
    }
    
    public double getPrecoItem() {
        
        return this.precoItem; 
        
    }
    
    public void setPrecoItem(double precoItem) {
        
        this.precoItem = precoItem; 
    }

    // Metodo Especial - avalia se um item é barato
    
    public boolean avaliaPreco() {
        
        if (this.precoItem > 5.00) {
            
            return false;
        }
        
        return true; 
    }
    
    
    

    
    // Metodo toString
    public String toString() {
        return "Código do Item: " + this.codItem + "\nEstabelecimento: " + this.estabelecimento + "\nNome do Item: " + this.nomeItem + "\nCategoria do Item: " + this.categoriaItem + "\nPreço do Item: " + this.precoItem;
    }


    
    
}