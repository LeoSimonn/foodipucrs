import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {
        
        //Inicialização do Sistema
        SistemaDePedidos sistema = new SistemaDePedidos();
        
        System.out.println("Olá, seja bem vindo ao C-Food!");
        System.out.println("---------------------------------------");
        
        System.out.println("");
        
        System.out.println("ESCOLHA A OPÇÃO DESEJADA: "); 
        System.out.println("---------------------------------------");
        System.out.println("1 - Fazer Pedido");
        System.out.println("2 - Acompanhar Pedido");
        System.out.println("3 - Cancelar Pedido");
        System.out.println("4 - Sair");
        
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        int menuOption = scanner.nextInt();
        
        if (menuOption == 1) {
            
            System.out.println("Iremos iniciar o seu pedido!");
            System.out.println("---------------------------------------");

            System.out.println("Segue lista dos estabelecimentos:");
            System.out.println("---------------------------------------");
            System.out.println("1 - Restaurante Mama Mia");
            System.out.println("2 - Restaurante O Saboroso");
            System.out.println("3 - Bar Noite Alegre");
            System.out.println("4 - Cafeteria Café com Prosa");
            System.out.println("5 - Padaria Pão Quentinho");
            System.out.println("6 - Lanchonete Bom Lanche");
            System.out.println("7 - Confeitaria Doce Momento");
            System.out.println("8 - Sorveteria Gelato Tropical");
            System.out.println("9 - Pizzaria Bella Napoli");
            System.out.println("10 - Churrascaria Espeto de Ouro");
            System.out.println("---------------------------------------");

            System.out.println("Escolha o estabelecimento desejado: ");
            int estabelecimentoEscolhido = scanner.nextInt();

            switch (estabelecimentoEscolhido) {
                case 1:
                    System.out.println("Você escolheu o Restaurante Mama Mia!");
                    break;
                case 2:
                    System.out.println("Você escolheu o Restaurante O Saboroso!");
                    break;
                case 3:
                    System.out.println("Você escolheu o Bar Noite Alegre!");
                    break;
                case 4:
                    System.out.println("Você escolheu a Cafeteria Café com Prosa!");
                    break;
                case 5:
                    System.out.println("Você escolheu a Padaria Pão Quentinho!");
                    break;
                case 6:
                    System.out.println("Você escolheu a Lanchonete Bom Lanche!");
                    break;
                case 7:
                    System.out.println("Você escolheu a Confeitaria Doce Momento!");
                    break;
                case 8:
                    System.out.println("Você escolheu a Sorveteria Gelato Tropical!");
                    break;
                case 9:
                    System.out.println("Você escolheu a Pizzaria Bella Napoli!");
                    break;
                case 10:
                    System.out.println("Você escolheu a Churrascaria Espeto de Ouro!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("---------------------------------------");
            System.out.println("Segue lista dos produtos disponíveis:");
            System.out.println("---------------------------------------");  
            System.out.println("1 - Pizza Calabresa");
            System.out.println("2 - Pizza Portuguesa");
            System.out.println("3 - Pizza Quatro Queijos");
            System.out.println("4 - Torta de Morango");
            System.out.println("5 - Cascão de Chocolate");
            System.out.println("6 - Pizza Margherita");
            System.out.println("7 - Picanha na Tábua");
            System.out.println("8 - Salada Primavera");
            System.out.println("9 - Moqueca de Peixe");
            System.out.println("10 - Cheesecake de Frutas Vermelhas");
            System.out.println("---------------------------------------");  

            System.out.println("Escolha o produto desejado: ");
            int produtoEscolhido = scanner.nextInt();

            switch (produtoEscolhido) {
                case 1:
                    System.out.println("Você escolheu a Pizza Calabresa!");
                    break;
                case 2:
                    System.out.println("Você escolheu a Pizza Portuguesa!");
                    break;
                case 3:
                    System.out.println("Você escolheu a Pizza Quatro Queijos!");
                    break;
                case 4:
                    System.out.println("Você escolheu a Torta de Morango!");
                    break;
                case 5:
                    System.out.println("Você escolheu o Cascão de Chocolate!");
                    break;
                case 6:
                    System.out.println("Você escolheu a Pizza Margherita!");
                    break;
                case 7:
                    System.out.println("Você escolheu a Picanha na Tábua!");
                    break;
                case 8:
                    System.out.println("Você escolheu a Salada Primavera!");
                    break;
                case 9:
                    System.out.println("Você escolheu a Moqueca de Peixe!");
                    break;
                case 10:
                    System.out.println("Você escolheu a Cheesecake de Frutas Vermelhas!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("---------------------------------------");
            System.out.println("Escolha a quantidade desejada: ");
            int quantidadeEscolhida = scanner.nextInt();
            pedidoInfo[1][0] = produtoEscolhido;
            pedidoInfo[0][1] = quantidadeEscolhida;

            System.out.println("---------------------------------------");
            System.out.println("Qual a forma de pagamento? ");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cartão");
            System.out.println("3 - PIX");

            System.out.println("Escolha a forma de pagamento desejada: ");
            int formaPagamentoEscolhida = scanner.nextInt();
            System.out.println("Você escolheu a forma de pagamento: " + formaPagamentoEscolhida);

            System.out.println("---------------------------------------");

            realizarPedido(formaPagamentoEscolhida, pedidoInfo, estabelecimentos[estabelecimentoEscolhido], clientes[0]);
            mostrarPedido("1");

        } else if(menuOption == 2){

            System.out.println("Digite o código do pedido: ");
            String codPedido = scanner.next();
            mostrarPedido(codPedido);
            
        } else if(menuOption == 3){
            
            System.out.println("Digite o código do pedido: ");
            String codPedido = scanner.next();
            Pedido pedido = registroPedidos.get(codPedido);
        }
        
        // BASE DE DADOS

        //Estabelecimentos
        Estabelecimento[] estabelecimentos = new Estabelecimento[10];

        estabelecimentos[0] = new Estabelecimento("Restaurante", "Mama Mia", "Rua Marechal Cardoso", 113, "Sem complemento", "Jundai", "Porto Alegre", "RS", "10.145.648/0001-99", "(51) 99874-5652");
        estabelecimentos[1] = new Estabelecimento("Restaurante", "O Saboroso", "Rua das Flores", 123, "N/A", "Centro", "Cidade Feliz", "SP", "12.345.678/0001-99", "(11) 98765-4321");
        estabelecimentos[2] = new Estabelecimento("Bar", "Noite Alegre", "Avenida da Liberdade", 456, "Apt 101", "Boêmia", "Cidade Feliz", "SP", "98.765.432/0001-00", "(11) 12345-6789");
        estabelecimentos[3] = new Estabelecimento("Cafeteria", "Café com Prosa", "Praça Central", 58, "Loja 3", "Vila Nova", "Curitiba", "PR", "23.456.789/0002-11", "(41) 98765-4321");
        estabelecimentos[4] = new Estabelecimento("Padaria", "Pão Quentinho", "Av. Brasil", 2100, "Quadra 10", "Santa Maria", "Belo Horizonte", "MG", "34.567.890/0003-22", "(31) 91234-5678");
        estabelecimentos[5] = new Estabelecimento("Lanchonete", "Bom Lanche", "Rua da Praia", 89, "", "Praia Grande", "Salvador", "BA", "45.678.901/0004-33", "(71) 98765-1234");
        estabelecimentos[6] = new Estabelecimento("Confeitaria", "Doce Momento", "Rua das Orquídeas", 345, "Loja B", "Florada", "Campinas", "SP", "23.456.789/0002-54", "(19) 98765-4231");
        estabelecimentos[7] = new Estabelecimento("Sorveteria", "Gelato Tropical", "Alameda dos Anjos", 87, "Quiosque 12", "Solares", "Maceió", "AL", "34.567.890/0003-76", "(82) 93234-5768");
        estabelecimentos[8] = new Estabelecimento("Pizzaria", "Bella Napoli", "Av. dos Italianos", 1230, "", "Bella Città", "Rio de Janeiro", "RJ", "45.678.901/0004-98", "(21) 98765-4321");
        estabelecimentos[9] = new Estabelecimento("Churrascaria", "Espeto de Ouro", "Rodovia BR-101", 5050, "Km 33", "Carnes Nobres", "Porto Alegre", "RS", "56.789.012/0005-31", "(51) 99632-5678");
        
        //Pedidos
        Pedidos[] pedidos = new Pedidos[10];

        pedidos[0] = new Pedidos("Dinheiro", "01/07/2020", 1, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[0], clientes[0]);
        pedidos[1] = new Pedidos("Cartão", "03/05/2020", 2, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[1], clientes[1]);
        pedidos[2] = new Pedidos("PIX", "14/06/2020", 3, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[2], clientes[2]);
        pedidos[3] = new Pedidos("Cartão", "30/02/2020", 4, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[3], clientes[3]);
        pedidos[4] = new Pedidos("Dinheiro", "28/09/2020", 5, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[4], clientes[4]);
        pedidos[5] = new Pedidos("PIX", "22/02/2020", 6, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[5], clientes[5]);
        pedidos[6] = new Pedidos("Cartão", "01/01/2020", 7, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[6], clientes[6]);
        pedidos[7] = new Pedidos("Dinheiro", "01/07/2020", 8, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[7], clientes[7]);
        pedidos[8] = new Pedidos("PIX", "01/07/2020", 9, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[8], clientes[8]);
        pedidos[9] = new Pedidos("Cartão", "01/07/2020", 10, new int[][]{{1, 2}, {3, 4}}, estabelecimentos[9], clientes[9]);
        
        // Itens
        Item[] itens = new Item[15];

        itens[0] = new Item("Pizza", "Calabresa", 30.00, 1);
        itens[1] = new Item("Pizza", "Portuguesa", 30.00, 2);
        itens[2] = new Item("Pizza", "Quatro Queijos", 30.00, 3);
        itens[3] = new Item("Confeitaria", "Torta de Morango", 40.00, 4);
        itens[4] = new Item("Sorveteria", "Cascão de Chocolate", 15.00, 5);
        itens[5] = new Item("Pizzaria", "Margherita", 32.00, 6);
        itens[6] = new Item("Churrascaria", "Picanha na Tábua", 60.00, 7);
        itens[7] = new Item("Restaurante Vegetariano", "Salada Primavera", 20.00, 8);
        itens[8] = new Item("Peixaria", "Moqueca de Peixe", 45.00, 9);
        itens[9] = new Item("Confeitaria", "Cheesecake de Frutas Vermelhas", 25.00, 10);
        itens[10] = new Item("Sorveteria", "Sundae de Caramelo", 18.00, 11);
        itens[11] = new Item("Pizzaria", "Napolitana", 35.00, 12);
        itens[12] = new Item("Churrascaria", "Costela no Bafo", 70.00, 13);
        itens[13] = new Item("Restaurante Vegetariano", "Hambúrguer de Quinoa", 22.00, 14);
        itens[14] = new Item("Peixaria", "Sushi Variado", 50.00, 15);
        




        

    }
    
    
}