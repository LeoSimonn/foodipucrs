public class CatalogoDeEstabs {
    
    
    private Estabelecimento [] catalogoDeEstabs;
    
    public CatalogoDeEstabs() {
        
        catalogoDeEstabs = new Estabelecimento[13];
        
        catalogoDeEstabs[0] = new Estabelecimento("Supermercado", "Super do Zé", "Rua das Cangalhas", 47, "Sobreloja", "Menino Deus", "Porto Alegre", "RS", "08.768.451/0001-05", "(51) 3343.5845");
        catalogoDeEstabs[1] = new Estabelecimento("Supermercado", "Bolicho da Maria", "Avenida Ipiranga", 7200, "Térreo", "Partenon", "Porto Alegre", "RS", "45.562.154/0001-84", "(51) 5452.4502");
        catalogoDeEstabs[2] = new Estabelecimento("Supermercado", "Mercadinho do Vampeta", "Rua dos Camuchinhos", 56, "Nos fundos da Igreja", "Cidade Baixa", "Porto Alegre", "RS", "35.564.788/0001-78", "(51) 3345.4211");
        catalogoDeEstabs[3] = new Estabelecimento("Restaurante", "Mama Mia", "Rua Marechal Cardoso", 113, "Sem complemento", "Jundai", "Porto Alegre", "RS", "10.145.648/0001-99", "(51) 99874-5652");
        catalogoDeEstabs[4] = new Estabelecimento("Restaurante", "O Saboroso", "Rua das Flores", 123, "N/A", "Centro", "Cidade Feliz", "SP", "12.345.678/0001-99", "(11) 98765-4321");
        catalogoDeEstabs[5] = new Estabelecimento("Restaurante", "Noite Alegre", "Avenida da Liberdade", 456, "Apt 101", "Boêmia", "Cidade Feliz", "SP", "98.765.432/0001-00", "(11) 12345-6789");
        catalogoDeEstabs[6] = new Estabelecimento("Restaurante", "Café com Prosa", "Praça Central", 58, "Loja 3", "Vila Nova", "Curitiba", "PR", "23.456.789/0002-11", "(41) 98765-4321");
        catalogoDeEstabs[7] = new Estabelecimento("Restaurante", "Pão Quentinho", "Av. Brasil", 2100, "Quadra 10", "Santa Maria", "Belo Horizonte", "MG", "34.567.890/0003-22", "(31) 91234-5678");
        catalogoDeEstabs[8] = new Estabelecimento("Restaurante", "Bom Lanche", "Rua da Praia", 89, "", "Praia Grande", "Salvador", "BA", "45.678.901/0004-33", "(71) 98765-1234");
        catalogoDeEstabs[9] = new Estabelecimento("Restaurante", "Doce Momento", "Rua das Orquídeas", 345, "Loja B", "Florada", "Campinas", "SP", "23.456.789/0002-54", "(19) 98765-4231");
        catalogoDeEstabs[10] = new Estabelecimento("Restaurante", "Gelato Tropical", "Alameda dos Anjos", 87, "Quiosque 12", "Solares", "Maceió", "AL", "34.567.890/0003-76", "(82) 93234-5768");
        catalogoDeEstabs[11] = new Estabelecimento("Restaurante", "Bella Napoli", "Av. dos Italianos", 1230, "", "Bella Città", "Rio de Janeiro", "RJ", "45.678.901/0004-98", "(21) 98765-4321");
        catalogoDeEstabs[12] = new Estabelecimento("Restaurante", "Espeto de Ouro", "Rodovia BR-101", 5050, "Km 33", "Carnes Nobres", "Porto Alegre", "RS", "56.789.012/0005-31", "(51) 99632-5678");
        
    }
    
    public Estabelecimento[] getEstabs() {
        
        return catalogoDeEstabs; 
        
    }
    
    
}