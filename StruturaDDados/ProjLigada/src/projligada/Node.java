package projligada;

public class Node {
    String nomeAnimal;
    Node next;
    
    Node(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
        this.next = null;
    }
    
    public void mostraAnimal(){
        System.out.println("Animal ==> " + nomeAnimal);
    }
}
