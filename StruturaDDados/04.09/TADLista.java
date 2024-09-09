package tadlista;

public class TADLista {

    public static void main(String[] args) throws Exception{
        Lista nomes = new Lista(5);
        
        nomes.add(0, "JOAO");
        nomes.add(1, "MARIA");
        nomes.add(2, "SILVIA");
        nomes.add(3, "PEDRO");
        nomes.add(4, "SARAH");
        
        nomes.set(0, "SOLANGE");
        nomes.remove(1);
        nomes.add(2,"JORGE");
        nomes.mostraLista();
        String x = nomes.get(3);
        System.out.println("Conteúdo = " + x);
        int result = nomes.search("PEDRO");
        if (result == -1)
            System.out.println("Não existe PEDRO na lista");
        else
            System.out.println("PEDRO está na posição " + result);
        
        
        
    }
    
}
