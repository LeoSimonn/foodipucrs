import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {
        
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        Estabelecimento[] listaEstabs = catEstabs.getEstabs();
        
        CatalogoDeItens catItens = new CatalogoDeItens();
        Item[] listaItens = catItens.getItens(); 
        
        Estabelecimento estabEscolhido = null;
        
        System.out.println("Olá, seja bem vindo ao C-Food!");
        System.out.println("---------------------------------------");
        
        System.out.println("");
        
        System.out.println("ESCOLHA A OPÇÃO DESEJADA: "); 
        System.out.println("---------------------------------------");
        System.out.println("1 - Fazer Pedido de Supermercados");
        System.out.println("2 - Fazer Pedido de Restaurantes");
        System.out.println("3 - Acompanhar Pedido");
        
        Scanner scanner = new Scanner(System.in);
        int menuOption = scanner.nextInt();
        int numeradorMenu = 1; 
        
        System.out.println("");
        
        if (menuOption == 1) {
            
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
            System.out.println ("Para incluir itens no pedido, digite o código do produto e a quantidade. Para encerrar o pedido, digite -1");
            
            
            
            
        
                        
        }
    }                
}