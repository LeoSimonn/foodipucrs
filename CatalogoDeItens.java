public class CatalogoDeItens {
    
    private Item [] catalogoDeItens;
    
    public CatalogoDeItens() {
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        
        catalogoDeItens = new Item[72];
        
        catalogoDeItens[0] = new Item(1, catEstabs.getEstabs()[0], "Coca Cola Lata 320ml", "Bebidas", 3.50);  
        catalogoDeItens[1] = new Item(2, catEstabs.getEstabs()[0], "Guaraná Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[2] = new Item(3, catEstabs.getEstabs()[0], "Sprite Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[3] = new Item(4, catEstabs.getEstabs()[0], "Trakinas Morango 270g", "Biscoitos", 2.75);
        catalogoDeItens[4] = new Item(5, catEstabs.getEstabs()[0], "Trakinas Chocolate 270g", "Biscoitos", 2.75);
        catalogoDeItens[5] = new Item(6, catEstabs.getEstabs()[0], "Trakinas Chocolate 270g", "Biscoitos", 2.75);
        catalogoDeItens[6] = new Item(7, catEstabs.getEstabs()[0], "Pão Francês", "Padaria", 3.50);  
        catalogoDeItens[7] = new Item(8, catEstabs.getEstabs()[0], "Pão de Sanduíche", "Padaria", 3.50);
        catalogoDeItens[8] = new Item(9, catEstabs.getEstabs()[0], "Grostoli", "Padaria", 3.50);
        catalogoDeItens[9] = new Item(10, catEstabs.getEstabs()[0], "Café Preto", "Rotisserie", 2.75);
        catalogoDeItens[10] = new Item(11, catEstabs.getEstabs()[0], "Chá de Hortelã", "Rotisserie", 2.75);
        catalogoDeItens[11] = new Item(12, catEstabs.getEstabs()[0], "Frango Assado", "Açougue", 2.75);
        catalogoDeItens[12] = new Item(13, catEstabs.getEstabs()[1], "Maçãs (kg)", "Frutas", 2.00);
        catalogoDeItens[13] = new Item(14, catEstabs.getEstabs()[1], "Bananas (kg)", "Frutas", 1.75);
        catalogoDeItens[14] = new Item(15, catEstabs.getEstabs()[1], "Tomates (kg)", "Vegetais", 2.50);
        catalogoDeItens[15] = new Item(16, catEstabs.getEstabs()[1], "Cenouras (kg)", "Vegetais", 1.80);
        catalogoDeItens[16] = new Item(17, catEstabs.getEstabs()[1], "Leite Integral 1L", "Laticínios", 3.20);
        catalogoDeItens[17] = new Item(18, catEstabs.getEstabs()[1], "Queijo Prato 200g", "Laticínios", 5.50);
        catalogoDeItens[18] = new Item(19, catEstabs.getEstabs()[1], "Sabonete 90g", "Higiene Pessoal", 2.50);
        catalogoDeItens[19] = new Item(20, catEstabs.getEstabs()[1], "Shampoo 250ml", "Higiene Pessoal", 7.00);
        catalogoDeItens[20] = new Item(21, catEstabs.getEstabs()[1], "Papel Higiênico (pacote com 4 rolos)", "Limpeza", 4.50);
        catalogoDeItens[21] = new Item(22, catEstabs.getEstabs()[1], "Detergente 500ml", "Limpeza", 2.75);
        catalogoDeItens[22] = new Item(23, catEstabs.getEstabs()[1], "Fraldas Pampers (pacote com 20 unidades)", "Bebê", 15.99);
        catalogoDeItens[23] = new Item(24, catEstabs.getEstabs()[1], "Mamadeira", "Bebê", 8.50);
        catalogoDeItens[24] = new Item(25, catEstabs.getEstabs()[2], "Fraldas de Pano (kit com 6 unidades)", "Bebê", 10.00);
        catalogoDeItens[25] = new Item(26, catEstabs.getEstabs()[2], "Brinquedo de Pelúcia", "Brinquedos", 12.99);
        catalogoDeItens[26] = new Item(27, catEstabs.getEstabs()[2], "Carne Bovina (kg)", "Açougue", 15.00);
        catalogoDeItens[27] = new Item(28, catEstabs.getEstabs()[2], "Peito de Frango (kg)", "Açougue", 8.50);
        catalogoDeItens[28] = new Item(29, catEstabs.getEstabs()[2], "Salsichas (pacote com 8 unidades)", "Açougue", 4.75);
        catalogoDeItens[29] = new Item(30, catEstabs.getEstabs()[2], "Filé de Peixe (kg)", "Peixaria", 12.99);
        catalogoDeItens[30] = new Item(31, catEstabs.getEstabs()[2], "Camarão (kg)", "Peixaria", 18.99);
        catalogoDeItens[31] = new Item(32, catEstabs.getEstabs()[2], "Lula (kg)", "Peixaria", 10.99);
        catalogoDeItens[32] = new Item(33, catEstabs.getEstabs()[2], "Pasta de Dente 150g", "Higiene Pessoal", 3.75);
        catalogoDeItens[33] = new Item(34, catEstabs.getEstabs()[2], "Enxaguante Bucal 500ml", "Higiene Pessoal", 6.50);
        catalogoDeItens[34] = new Item(35, catEstabs.getEstabs()[2], "Desinfetante 1L", "Limpeza", 4.25);
        catalogoDeItens[35] = new Item(36, catEstabs.getEstabs()[2], "Esponja de Cozinha (pacote com 3 unidades)", "Limpeza", 2.99);   
        catalogoDeItens[36] = new Item(37, catEstabs.getEstabs()[3], "Hamburguer Simples", "Pratos Principais", 9.99);
        catalogoDeItens[37] = new Item(38, catEstabs.getEstabs()[3], "Pizza Margherita (individual)", "Pratos Principais", 12.50);
        catalogoDeItens[38] = new Item(39, catEstabs.getEstabs()[3], "Salada Caesar", "Saladas", 7.75);
        catalogoDeItens[39] = new Item(40, catEstabs.getEstabs()[3], "Sopa de Tomate", "Sopas", 6.50);
        catalogoDeItens[40] = new Item(41, catEstabs.getEstabs()[3], "Pasta à Carbonara", "Massas", 11.99);
        catalogoDeItens[41] = new Item(42, catEstabs.getEstabs()[3], "Sushi Misto (porção)", "Sushi", 15.99);
        catalogoDeItens[42] = new Item(43, catEstabs.getEstabs()[3], "Tacos de Frango (trio)", "Pratos Principais", 10.50);
        catalogoDeItens[43] = new Item(44, catEstabs.getEstabs()[3], "Suco de Laranja Natural 300ml", "Bebidas", 4.50);
        catalogoDeItens[44] = new Item(45, catEstabs.getEstabs()[3], "Smoothie de Frutas Vermelhas", "Bebidas", 6.25);
        catalogoDeItens[45] = new Item(46, catEstabs.getEstabs()[3], "Cerveja Artesanal (garrafa 500ml)", "Bebidas Alcoólicas", 8.99);
        catalogoDeItens[46] = new Item(47, catEstabs.getEstabs()[3], "Vinho Tinto (garrafa)", "Bebidas Alcoólicas", 20.00);
        catalogoDeItens[47] = new Item(48, catEstabs.getEstabs()[3], "Café Expresso", "Cafés", 3.25);
        catalogoDeItens[48] = new Item(49, catEstabs.getEstabs()[4], "Sanduíche de Frango Grelhado", "Pratos Principais", 8.75);
        catalogoDeItens[49] = new Item(50, catEstabs.getEstabs()[4], "Wrap de Vegetais", "Pratos Principais", 7.99);
        catalogoDeItens[50] = new Item(51, catEstabs.getEstabs()[4], "Mousse de Chocolate", "Sobremesas", 5.50);
        catalogoDeItens[51] = new Item(52, catEstabs.getEstabs()[4], "Caipirinha", "Coquetéis", 9.50);
        catalogoDeItens[52] = new Item(53, catEstabs.getEstabs()[4], "Margarita", "Coquetéis", 8.75);
        catalogoDeItens[53] = new Item(54, catEstabs.getEstabs()[4], "Batata Frita", "Acompanhamentos", 6.25);
        catalogoDeItens[54] = new Item(55, catEstabs.getEstabs()[4], "Ceviche de Peixe", "Pratos Principais", 13.99);
        catalogoDeItens[55] = new Item(56, catEstabs.getEstabs()[4], "Tiramisu", "Sobremesas", 7.50);
        catalogoDeItens[56] = new Item(57, catEstabs.getEstabs()[4], "Chá Gelado de Pêssego", "Bebidas", 4.25);
        catalogoDeItens[57] = new Item(58, catEstabs.getEstabs()[4], "Burrito de Carne", "Pratos Principais", 10.99);
        catalogoDeItens[58] = new Item(59, catEstabs.getEstabs()[4], "Sorvete de Baunilha", "Sobremesas", 6.75);
        catalogoDeItens[59] = new Item(60, catEstabs.getEstabs()[4], "Espaguete ao Pesto", "Massas", 11.50);
        catalogoDeItens[60] = new Item(61, catEstabs.getEstabs()[5], "Coca Cola Zero Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[61] = new Item(62, catEstabs.getEstabs()[5], "Guaraná Antarctica Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[62] = new Item(63, catEstabs.getEstabs()[5], "Fanta Laranja Lata 320ml", "Bebidas", 3.50);
        catalogoDeItens[63] = new Item(64, catEstabs.getEstabs()[5], "Bife à Parmegiana", "Pratos Principais", 14.99);
        catalogoDeItens[64] = new Item(65, catEstabs.getEstabs()[5], "Creme de Espinafre", "Sopas", 7.25);
        catalogoDeItens[65] = new Item(66, catEstabs.getEstabs()[5], "Cheesecake de Morango", "Sobremesas", 8.50);
        catalogoDeItens[66] = new Item(67, catEstabs.getEstabs()[5], "Mojito", "Coquetéis", 9.99);
        catalogoDeItens[67] = new Item(68, catEstabs.getEstabs()[5], "Salmão Grelhado", "Peixes", 16.50);
        catalogoDeItens[68] = new Item(69, catEstabs.getEstabs()[5], "Caesar Wrap", "Pratos Principais", 8.99);
        catalogoDeItens[69] = new Item(70, catEstabs.getEstabs()[5], "Margarita Pizza (individual)", "Pratos Principais", 11.50);
        catalogoDeItens[70] = new Item(71, catEstabs.getEstabs()[5], "Bruschetta de Tomate", "Aperitivos", 5.75);
        catalogoDeItens[71] = new Item(71, catEstabs.getEstabs()[5], "Bruschetta de Aspargos", "Aperitivos", 5.75);
    }
    
    // Getters and Setters
    
    public Item[] getItens() {
        
        return catalogoDeItens; 
        
    }
    
    public void setItens (Item[] listaDeItens) {
        
        this.catalogoDeItens = listaDeItens;
        
    }
    
    //Método To String 
    
    public String toString() {
        
        return Integer.toString(catalogoDeItens.length);
   
    }
    
    //Método da Classe
    
    public Item maiorPreco() {
        
        Item maisCaro = catalogoDeItens[0]; 
        
        for (int i = 0; i < this.catalogoDeItens.length; i++) {
            
            if (catalogoDeItens[i].getPrecoItem() > maisCaro.getPrecoItem() ) {
                
                maisCaro = catalogoDeItens[i];
            }
            
        }
        
        return maisCaro;
    }
    
    
}