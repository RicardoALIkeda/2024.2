package projligada;

public class ProjLigada {

    public static void main(String[] args) {
        LinkedList zoo = new LinkedList();
        
        Node n1 = new Node("GATO");
        zoo.addFirst(n1);
        zoo.addFirst(new Node("CACHORRO"));
        zoo.addFirst(new Node ("PATO"));
        zoo.addLast(new Node ("LEÃO"));
        zoo.addLast(new Node ("JACARÉ"));
        
        zoo.mostraLista();
    }
    
}
