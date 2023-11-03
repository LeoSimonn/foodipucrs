import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {
        
        //Criado Estabelecimentos
        
        Estabelecimento e1 = new Estabelecimento("Supermercado", "Super do Zé", "Rua das Cangalhas", 47, "Sobreloja", "Menino Deus", "Porto Alegre", "RS", "08.768.451/0001-05", "(51) 3343.5845");
        Estabelecimento e2 = new Estabelecimento("Supermercado", "Bolicho da Maria", "Avenida Ipiranga", 7200, "Térreo", "Partenon", "Porto Alegre", "RS", "45.562.154/0001-84", "(51) 5452.4502");
        Estabelecimento e3 = new Estabelecimento("Supermercado", "Mercadinho do Vampeta", "Rua dos Camuchinhos", 56, "Nos fundos da Igreja", "Cidade Baixa", "Porto Alegre", "RS", "35.564.788/0001-78", "(51) 3345.4211");
        
        Estabelecimento [] listaEstabelecimentos = {e1, e2, e3}; 
        
        
        System.out.println("Olá, seja bem vindo ao C-Food!");
        System.out.println("---------------------------------------");
        
        System.out.println("");
        
        System.out.println("ESCOLHA A OPÇÃO DESEJADA: "); 
        System.out.println("---------------------------------------");
        System.out.println("1 - Fazer Pedido de Supermercados");
        System.out.println("2 - Fazer Pedido de Restaurantes");
        System.out.println("3 - Acompanhar Pedido");
        
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        int menuOption = scanner.nextInt();
        
        if (menuOption == 1) {
            
            
            System.out.println("ESCOLHA O SUPERMERCADO: ");
            
            for (int i = 0; i < listaEstabelecimentos.length; i++) {
                
                System.out.println( (i+1) + " - " + listaEstabelecimentos[i].getNomeEstab() );
                
            }
            
            
            
            
            
        }
        
        // BASE DE DADOS

        // Estabelecimentos
        //Estabelecimento[] estabelecimentos = new Estabelecimento[10];

        //estabelecimentos[0] = new Estabelecimento("Restaurante", "Mama Mia", "Rua Marechal Cardoso", 113, "Sem complemento", "Jundai", "Porto Alegre", "RS", "10.145.648/0001-99", "(51) 99874-5652");
        //estabelecimentos[1] = new Estabelecimento("Restaurante", "O Saboroso", "Rua das Flores", 123, "N/A", "Centro", "Cidade Feliz", "SP", "12.345.678/0001-99", "(11) 98765-4321");
        //estabelecimentos[2] = new Estabelecimento("Bar", "Noite Alegre", "Avenida da Liberdade", 456, "Apt 101", "Boêmia", "Cidade Feliz", "SP", "98.765.432/0001-00", "(11) 12345-6789");
        //estabelecimentos[3] = new Estabelecimento("Cafeteria", "Café com Prosa", "Praça Central", 58, "Loja 3", "Vila Nova", "Curitiba", "PR", "23.456.789/0002-11", "(41) 98765-4321");
        //estabelecimentos[4] = new Estabelecimento("Padaria", "Pão Quentinho", "Av. Brasil", 2100, "Quadra 10", "Santa Maria", "Belo Horizonte", "MG", "34.567.890/0003-22", "(31) 91234-5678");
        //estabelecimentos[5] = new Estabelecimento("Lanchonete", "Bom Lanche", "Rua da Praia", 89, "", "Praia Grande", "Salvador", "BA", "45.678.901/0004-33", "(71) 98765-1234");
        //estabelecimentos[6] = new Estabelecimento("Confeitaria", "Doce Momento", "Rua das Orquídeas", 345, "Loja B", "Florada", "Campinas", "SP", "23.456.789/0002-54", "(19) 98765-4231");
        //estabelecimentos[7] = new Estabelecimento("Sorveteria", "Gelato Tropical", "Alameda dos Anjos", 87, "Quiosque 12", "Solares", "Maceió", "AL", "34.567.890/0003-76", "(82) 93234-5768");
        //estabelecimentos[8] = new Estabelecimento("Pizzaria", "Bella Napoli", "Av. dos Italianos", 1230, "", "Bella Città", "Rio de Janeiro", "RJ", "45.678.901/0004-98", "(21) 98765-4321");
        //estabelecimentos[9] = new Estabelecimento("Churrascaria", "Espeto de Ouro", "Rodovia BR-101", 5050, "Km 33", "Carnes Nobres", "Porto Alegre", "RS", "56.789.012/0005-31", "(51) 99632-5678");
        
        // Pedidos
        //Pedidos[] pedidos = new Pedidos[10];

        //pedidos[0] = new Pedidos("Dinheiro", "01/07/2020", 1, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[0], clientes[0]);
        //pedidos[1] = new Pedidos("Cartão", "03/05/2020", 2, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[1], clientes[1]);
        //pedidos[2] = new Pedidos("PIX", "14/06/2020", 3, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[2], clientes[2]);
        //pedidos[3] = new Pedidos("Cartão", "30/02/2020", 4, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[3], clientes[3]);
        //pedidos[4] = new Pedidos("Dinheiro", "28/09/2020", 5, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[4], clientes[4]);
        //pedidos[5] = new Pedidos("PIX", "22/02/2020", 6, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[5], clientes[5]);
        //pedidos[6] = new Pedidos("Cartão", "01/01/2020", 7, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[6], clientes[6]);
        //pedidos[7] = new Pedidos("Dinheiro", "01/07/2020", 8, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[7], clientes[7]);
        //pedidos[8] = new Pedidos("PIX", "01/07/2020", 9, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[8], clientes[8]);
        //pedidos[9] = new Pedidos("Cartão", "01/07/2020", 10, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[9], clientes[9]);
        

    }
    
    
}