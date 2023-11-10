import java.util.Scanner;
import java.util.Date; 

public class Main {
    
    public static void main (String [] args) {
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        Estabelecimento[] listaEstabs = catEstabs.getEstabs();
        Scanner scanner = new Scanner(System.in);
        
        CatalogoDeItens catItens = new CatalogoDeItens();
        Item[] listaItens = catItens.getItens(); 
        
        Estabelecimento estabEscolhido = null;
        
        Cliente clienteAtual = new Cliente ("","","","",0,"","","","");  
        
        System.out.println("Olá, seja bem vindo ao C-Food!");
        System.out.println("---------------------------------------");
        
        System.out.println("");
        
        int menuOption = 0; 
        int numeradorMenu = 1;
        
        long timestampAtual = System.currentTimeMillis();
        Date dataAtual = new Date(timestampAtual);
        
        
        while (menuOption == 0 ) {
        
            System.out.println("ESCOLHA A OPÇÃO DESEJADA: "); 
            System.out.println("---------------------------------------");
            System.out.println("1 - Realizar Cadastro de Cliente");
            System.out.println("2 - Fazer Pedido de Supermercados");
            System.out.println("3 - Fazer Pedido de Restaurantes");
            System.out.println("4 - Acompanhar Pedido");
            
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
                
            }
            
            
            else if (menuOption == 2) {
            
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
                
                
                Pedido pedidoAtual = new Pedido(clienteAtual, 5, dataAtual, itensPedido, "Cartão de Crédito");
                
                System.out.println(pedidoAtual);
                System.out.println("");
                
                menuOption = 0; 
                            
            }
            
            
            
        }
        
        
    }                
}