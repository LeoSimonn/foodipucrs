import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        long timestampAtual = System.currentTimeMillis();
        Date dataAtual = new Date(timestampAtual);
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs();
        Estabelecimento[] listaEstabs = catEstabs.getEstabs();
        Scanner scanner = new Scanner(System.in);

        CatalogoDeItens catItens = new CatalogoDeItens();
        Item[] listaItens = catItens.getItens();

        Estabelecimento estabEscolhido = null;

        Cliente clienteAtual = new Cliente("", "", "", "", 0, "", "", "", "");
        
        Pedido pedidoAtual = new Pedido(clienteAtual, 1, dataAtual, null , "Cartão de Crédito"); 
        
        Entregador entregadorAtual = new Entregador("Jonleno", "Bicicleta", "(51) 99618.2548");
        Entrega entregaAtual = new Entrega(null, entregadorAtual, "Seu pedido está em preparo"); 

        System.out.println("Olá, seja bem vindo ao C-Food!");
        System.out.println("---------------------------------------");

        System.out.println("");

        int menuOption = 0;
        int numeradorMenu = 1;

        boolean validCadastro = false; 
        


        while (menuOption == 0) {

            System.out.println("ESCOLHA A OPÇÃO DESEJADA: ");
            System.out.println("---------------------------------------");
            System.out.println("1 - Realizar Cadastro de Cliente");
            System.out.println("2 - Fazer Pedido de Supermercados");
            System.out.println("3 - Fazer Pedido de Restaurantes");
            System.out.println("4 - Acompanhar Pedido");
            System.out.println("5 - Validar se Cliente é Gaúcho");
            System.out.println("6 - Validar se Estabelecimento do Pedido é Gaúcho");
            System.out.println("7 - Contar quantos Estabelecimentos são do RS no C-Food");
            System.out.println("8 - Avaliar preço de Itens");
            System.out.println("9 - Descobrir qual o Item mais caro do C-Food"); 
            System.out.println("10 - Investigar se o entregador é xará do cliente");
            
            menuOption = scanner.nextInt();

            System.out.println("");
            scanner.nextLine();

            if (menuOption == 1) {

                System.out.println("Informe seu nome: ");
                clienteAtual.setNomeCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Digite seu CPF: ");
                clienteAtual.setCpfCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Telefone de Contato: ");
                clienteAtual.setTelCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Rua de Entrega: ");
                clienteAtual.setRuaCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Número: ");
                clienteAtual.setNumeroCli(scanner.nextInt());
                System.out.println("");

                scanner.nextLine();

                System.out.println("Complemento: ");
                clienteAtual.setComplementoCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Bairro: ");
                clienteAtual.setBairroCli(scanner.nextLine());
                System.out.println("");

                System.out.println("Cidade: ");
                clienteAtual.setCidadeCli(scanner.nextLine());
                System.out.println("");

                System.out.println("UF: ");
                clienteAtual.setUfCli(scanner.nextLine());
                System.out.println("");

                System.out.println(clienteAtual);

                
                menuOption = 0; 
                validCadastro = true;
                

                menuOption = 0;


            }

            else if (menuOption == 2) {

                
                if (validCadastro == false) {
                    
                    System.out.println("Para fazer um pedido, você precisa se cadastrar no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    
                    System.out.println("ESCOLHA O SUPERMERCADO: ");
                    System.out.println("---------------------------------------");
                    
                    // Lista os supermercados e permite que o usuário escolha um
                    
                    for (int i = 0; i < listaEstabs.length; i++) {
                        
                        if (listaEstabs[i].getTipoEstab().equals("Supermercado")) {
                        
                            System.out.println( numeradorMenu + " - " + listaEstabs[i].getNomeEstab() );
                            
                            numeradorMenu++;
                        }
                        
                    }
                    
                    int submenuOption = scanner.nextInt();
                    
                    // Relaciona a opção do usuário com o objeto real em Estabelecimento
                    
                    int validOption = 0;
                    
                    for (int i = 0; i < listaEstabs.length; i++) {
                        
                        if (listaEstabs[i].getTipoEstab().equals("Supermercado")) {
                        
                            validOption++;
                            
                            if (validOption == submenuOption) {
                                
                                estabEscolhido = listaEstabs[i]; 
                                
                            }
                            
                        }
                    }
                    
                    // Lista os produtos do estabelecimento
                    
                    System.out.println("");
                    System.out.println ("ESCOLHA OS ITENS QUE VOCÊ QUER COMPRAR DO: " + estabEscolhido.getNomeEstab());
                    System.out.println("---------------------------------------");
                    System.out.println(" COD");
                    
                    for (int i = 0; i< listaItens.length; i++) {
                        
                        if (listaItens[i].getEstab().getNomeEstab().equals(estabEscolhido.getNomeEstab())) {
                            
                            System.out.println("[ " + listaItens[i].getCodItem() + " ]" + " R$ " +  listaItens[i].getPrecoItem() + " - " + listaItens[i].getNomeItem()); 
                            
                        }
                    
                    }
                    
        
                    // Inclui itens no pedido
                        
                    System.out.println("");
                    System.out.println ("Para incluir itens no pedido, digite o código do produto e a quantidade. Aqui, você C-Food e só pode escolher 3 itens por pedido. :) ");
                    System.out.println("");
                        
                    int[][] itensPedido = new int[3][2];
                                    
                    for (int l = 0; l < itensPedido.length; l++) {
                            
                        for (int c = 0; c < itensPedido[0].length; c++) {
                                
                            if( c == 0 ) {
                                
                                System.out.println("Insira o código do produto: ");
                                itensPedido[l][c] = scanner.nextInt();
                                System.out.println("");
                                    
                            }
                                
                            else if (c == 1) {
                                    
                                System.out.println("Insira a quantidade desejada: ");
                                itensPedido[l][c] = scanner.nextInt();
                                System.out.println("");
                            }
                          
                        }
                            
                    }
                        
                    
                    pedidoAtual.setItensPedido(itensPedido);
                    
                    entregaAtual.setPedido(pedidoAtual);  
                    
                    System.out.println(pedidoAtual);
                    System.out.println("");
                    
                    menuOption = 0; 
                        

                }
            
            }    
                
            else if (menuOption == 3) {

                if (validCadastro == false) {
                    
                    System.out.println("Para fazer um pedido, você precisa se cadastrar no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    System.out.println("ESCOLHA O RESTAURANTE: ");
                    System.out.println("---------------------------------------");
                    
                    // Lista os restaurantes e permite que o usuário escolha um
                    
                    for (int i = 0; i < listaEstabs.length; i++) {
                        
                        if (listaEstabs[i].getTipoEstab().equals("Restaurante")) {
                        
                            System.out.println( numeradorMenu + " - " + listaEstabs[i].getNomeEstab() );
                            
                            numeradorMenu++;
                        }
                        
                    }
                    
                    int submenuOption = scanner.nextInt();
                    
                    // Relaciona a opção do usuário com o objeto real em Estabelecimento
                    
                    int validOption = 0;
                    
                    for (int i = 0; i < listaEstabs.length; i++) {
                        
                        if (listaEstabs[i].getTipoEstab().equals("Restaurante")) {
                        
                            validOption++;
                            
                            if (validOption == submenuOption) {
                                
                                estabEscolhido = listaEstabs[i]; 
                                
                            }
                            
                        }
                    }
                    
                    // Lista os produtos do estabelecimento
                    
                    System.out.println("");
                    System.out.println ("ESCOLHA OS ITENS QUE VOCÊ QUER COMPRAR DO: " + estabEscolhido.getNomeEstab());
                    System.out.println("---------------------------------------");
                    System.out.println(" COD");
                    
                    for (int i = 0; i< listaItens.length; i++) {
                        
                        if (listaItens[i].getEstab().getNomeEstab().equals(estabEscolhido.getNomeEstab())) {
                            
                            System.out.println("[ " + listaItens[i].getCodItem() + " ]" + " R$ " +  listaItens[i].getPrecoItem() + " - " + listaItens[i].getNomeItem()); 
                            
                        }
                    
                    }
                    
        
                    // Inclui itens no pedido
                        
                    System.out.println("");
                    System.out.println ("Para incluir itens no pedido, digite o código do produto e a quantidade. Aqui, você C-Food e só pode escolher 3 itens por pedido. :) ");
                    System.out.println("");
                        
                    int[][] itensPedido = new int[3][2];
                                    
                    for (int l = 0; l < itensPedido.length; l++) {
                            
                        for (int c = 0; c < itensPedido[0].length; c++) {
                                
                            if( c == 0 ) {
                                
                                System.out.println("Insira o código do produto: ");
                                itensPedido[l][c] = scanner.nextInt();
                                System.out.println("");
                                    
                            }
                                
                            else if (c == 1) {
                                    
                                System.out.println("Insira a quantidade desejada: ");
                                itensPedido[l][c] = scanner.nextInt();
                                System.out.println("");
                            }
                          
                        }
                            
                    }
                        
                    
                    pedidoAtual.setItensPedido(itensPedido);
                    
                    entregaAtual.setPedido(pedidoAtual); 
                    
                    System.out.println(pedidoAtual);
                    System.out.println("");
                    
                    menuOption = 0; 
                        
                }
            }
            
            else if (menuOption == 4) {

                if (pedidoAtual.getItensPedido().length < 0) {
                    
                    System.out.println("Para acompanhar um pedido, você precisa primeiro fazer um pedido no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    
                    System.out.println(entregaAtual); 
                    System.out.println("");
                    
                    if (entregaAtual.getEntregador().getFormaDeEntrega().equalsIgnoreCase("Bicicleta")) {
                        
                        System.out.println("Este pedido será entregue de bicicleta. O planeta agradece! :) ");
                        
                    }
                    
                    else {
                        
                        System.out.println("Este pedido não será entregue de bicicleta. O planeta chora!. :( ");
                        
                    }
                    
                    menuOption = 0; 
         
                }
            
            }
            
            else if (menuOption == 5) {
                
                if (validCadastro == false) {
                    
                    System.out.println("Para fazer este teste, você precisa se cadastrar no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    
                    if (clienteAtual.validaSeEhGaucho()) {
                        
                        System.out.println("Este cliente é bagual, tchê!");
                        System.out.println("");
                        
                    }
                    
                    else {
                        
                        System.out.println("Este cliente NÃO é gaúcho!");
                        System.out.println("");
                        
                    }
                    
                    
                    menuOption = 0; 
                }
                
            }
            
            else if (menuOption == 6) {
                
                if (entregaAtual.getPedido() == null) {
                    
                    System.out.println("Para fazer este teste, você precisa primeiro fazer um pedido no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    
                    if (estabEscolhido.validSeEstabEhGaucho()) {
                        
                        System.out.println("O estabelecimento escolhido é bagual, tchê!");
                        System.out.println("");
                        
                    }
                    
                    else {
                        
                        System.out.println("Você escolheu um estabelecimento de outro estado. Seu pedido pode demorar um pouco para chegar. :(");
                        System.out.println("");
                        
                    }
                    
                    menuOption = 0;
                }
                
                
            }
            
            else if (menuOption == 7) {
                
                System.out.println("O C-Food valoriza o RS. Atualmente contamos com " + catEstabs.countEstabsDoRs() + " estabelecimentos gaúchos cadastrados em nossa base");
                System.out.println("");
                
                menuOption = 0;
            }
            
            else if (menuOption == 8) {
                
                System.out.println("Digite o código de um dos itens da lista para avaliar seu preço: ");
                System.out.println("");
                
                for (int i = 0; i < listaItens.length; i++) {
                    
                    System.out.println("[ " + listaItens[i].getCodItem() + " ]" + " R$ " +  listaItens[i].getPrecoItem() + " - " + listaItens[i].getNomeItem());
                    
                }
                
                System.out.println("Insira o código do produto para avaliar: ");
                int escolha = (scanner.nextInt() - 1); 
                 
                
                if (listaItens[escolha].avaliaPreco()) {
                 
                    System.out.println("O item escolhido " + listaItens[escolha].getNomeItem() + " é barato, pois custa menos de R$ 5,00. :) ");
                    System.out.println("");
                    
                }
                
                else {
                 
                    System.out.println("O item escolhido " + listaItens[escolha].getNomeItem() + " é caro, pois custa mais de R$ 5,00. :( ");
                    System.out.println("");
                    
                }
                
                
                menuOption = 0;
            }
            
            else if (menuOption == 9) {
                
                System.out.println("Atualmente, o item mais caro do C-Food é: " + catItens.maiorPreco().getNomeItem() + ". Pertence ao estabelecimento " 
                + catItens.maiorPreco().getEstab().getNomeEstab() + " e é vendido pela bagatela de R$ " + catItens.maiorPreco().getPrecoItem() + " reais."); 
                System.out.println("");
                
                menuOption = 0;
                
            }
            
            else if (menuOption == 10) {
                
                if (validCadastro == false) {
                    
                    System.out.println("Para fazer este teste, você precisa se cadastrar no C Food!"); 
                    System.out.println("");
                    
                    menuOption = 0;
                    
                }
                
                else {
                    
                    if (entregadorAtual.ehXara(clienteAtual)) {
                    
                        System.out.println("Uau, que coincidência, a pessoa entregadora tem o mesmo nome que você. Como prêmio do destino, você ganhou um mousse de chocolate!");
                        System.out.println("");
                    
                    }
                
                    else {
                    
                        System.out.println("Desculpe a frustração, mas você e a pessoa entregadora não possuem o mesmo nome."); 
                        System.out.println("");
                    
                    }
                    
                    menuOption = 0;
                }
                
             
            }
            
        }
    }
}