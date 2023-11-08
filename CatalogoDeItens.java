public class CatalogoDeItens {
    
    private Item [] catalogoDeItens;
    
    public CatalogoDeItens() {
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        
        catalogoDeItens = new Item[6];
        
        catalogoDeItens[0] = new Item(0001, catEstabs.getEstabs()[0], "Coca Cola Lata 320ml", "Bebidas", 3.50);  
        catalogoDeItens[1] = new Item(0002, catEstabs.getEstabs()[0], "Guaraná Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[2] = new Item(0003, catEstabs.getEstabs()[0], "Sprite Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[3] = new Item(0004, catEstabs.getEstabs()[0], "Trakinas Morango 270g", "Biscoitos", 2.75);
        catalogoDeItens[4] = new Item(0005, catEstabs.getEstabs()[0], "Trakinas Chocolate 270g", "Biscoitos", 2.75);
        catalogoDeItens[5] = new Item(0006, catEstabs.getEstabs()[0], "Trakinas Chocolate 270g", "Biscoitos", 2.75);
        
    }

    
    public Item[] getItens() {
        
        return catalogoDeItens; 
        
    }
    
}