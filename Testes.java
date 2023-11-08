public class Testes {
    
    public static void main (String [] args) {
            
        CatalogoDeEstabs catEstabs = new CatalogoDeEstabs(); 
        
        Estabelecimento[] listaDeEstabs = catEstabs.getEstabs(); 
        
        int testeCount = listaDeEstabs.length; 
        
        System.out.println (listaDeEstabs[1].getTipoEstab()); 

        System.out.println (testeCount + "Iiissaaaa"); 
        
        for (int i = 0; i < listaDeEstabs.length; i++) {
            
            System.out.println (testeCount);
            
        }
        
    }
    
}