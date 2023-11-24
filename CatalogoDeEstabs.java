    public class CatalogoDeEstabs {
    
    private Estabelecimento [] catalogoDeEstabs;
    
    public CatalogoDeEstabs() {
        
        catalogoDeEstabs = new Estabelecimento[6];
        
        catalogoDeEstabs[0] = new Estabelecimento("Supermercado", "Super do Zé", "Rua das Cangalhas", 47, "Sobreloja", "Menino Deus", "Porto Alegre", "RS", "08.768.451/0001-05", "(51) 3343.5845");
        catalogoDeEstabs[1] = new Estabelecimento("Supermercado", "Bolicho da Maria", "Avenida Ipiranga", 7200, "Térreo", "Partenon", "Porto Alegre", "RS", "45.562.154/0001-84", "(51) 5452.4502");
        catalogoDeEstabs[2] = new Estabelecimento("Supermercado", "Mercadinho do Vampeta", "Rua dos Camuchinhos", 56, "Nos fundos da Igreja", "Cidade Baixa", "Porto Alegre", "RS", "35.564.788/0001-78", "(51) 3345.4211");
        catalogoDeEstabs[3] = new Estabelecimento("Restaurante", "Mama Mia", "Rua Marechal Cardoso", 113, "Sem complemento", "Jundai", "Porto Alegre", "RS", "10.145.648/0001-99", "(51) 99874-5652");
        catalogoDeEstabs[4] = new Estabelecimento("Restaurante", "O Saboroso", "Rua das Flores", 123, "N/A", "Centro", "Cidade Feliz", "SP", "12.345.678/0001-99", "(11) 98765-4321");
        catalogoDeEstabs[5] = new Estabelecimento("Restaurante", "Noite Alegre", "Avenida da Liberdade", 456, "Apt 101", "Boêmia", "Cidade Feliz", "SP", "98.765.432/0001-00", "(11) 12345-6789");
    
        
    }
    
    //Métodos Get e Set
    
    public Estabelecimento[] getEstabs() {
        
        return catalogoDeEstabs; 
        
    }   
    
    public void setEstabs (Estabelecimento[] listaDeEstabs) {
        
        this.catalogoDeEstabs = listaDeEstabs;
        
    }
    
    //Método To String 
    
    public String toString() {
        
        return Integer.toString(catalogoDeEstabs.length);
   
    }
    
    // Método da Classe 
    
    public int countEstabsDoRs() {
        
        int count = 0; 
        
        for (int i=0; i < catalogoDeEstabs.length; i++ ) {
            
            if ( catalogoDeEstabs[i].getUfEstab().equalsIgnoreCase("RS") ) {
                
                count = count + 1; 
            }
            
        }
        
        return count; 
    }
    
    
    
}