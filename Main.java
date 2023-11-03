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
        
        
        
        
        
        
        
    }
    
    
}