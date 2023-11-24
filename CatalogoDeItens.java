public class CatalogoDeItens {
    
    private Item [] catalogoDeItens;
    
    public CatalogoDeItens() {
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        
        catalogoDeItens = new Item[36];
        
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
    }
        
    

    
    public Item[] getItens() {
        
        return catalogoDeItens; 
        
    }
    
}