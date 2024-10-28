package projligada;

public class LinkedList {
    Node header;
    Node trailer;
    int size;
    
    LinkedList(){
        //criar uma lista vazia
        header = null;
        trailer = null;
        size = 0;        
    }
    
    public boolean isEmpty(){
        //verifica se a lista esta vazia
        if (size == 0)
            return true;
        else
            return false;
    }
    
    public int verTamanho(){
        //retorna a qtde de elementos da lista
        return size;
    }
    
    public Node first(){
        //retorna o primeiro nó da lista
        return header;
    }
    
    public Node last(){
        //retorna o último nó da lista
        return trailer;
    }
    
    public void addFirst(Node novo){
        //adiciona um novo nó no início da lista
        if (isEmpty()){
            header = novo;
            trailer = novo;
        }
        else {
            novo.next = header;
            header = novo;            
        }
        size++;
    }
        
    public void addLast(Node novo){
        //adiciona um novo nó no final da lista
        if (isEmpty()){
            header = novo;
            trailer = novo;
        }
        else {
            trailer.next = novo;
            trailer = novo;
        }
        size++;
    }
    
    public void mostraLista(){
        Node aux = header;
        aux.mostraAnimal();
        while (aux.next != null){
            aux = aux.next;
            aux.mostraAnimal();
        }
        System.out.println("FIM DA LISTA!");
    }
    
    
    public void remove(Node nodeToRemove) {
        if (isEmpty()) {
            return;
        }
    
        // If the node to remove is the first node
        if (header == nodeToRemove) {
            header = header.next;
            if (header == null) { // If the list becomes empty
                trailer = null;
            }
            size--;
            return;
        }
    
        // Traverse the list to find the node to remove
        Node current = header;
        while (current.next != null && current.next != nodeToRemove) {
            current = current.next;
        }
    
        // If the node was found
        if (current.next == nodeToRemove) {
            current.next = nodeToRemove.next;
            if (nodeToRemove == trailer) { // If the node to remove is the last node
                trailer = current;
            }
            size--;
        }
    }
    
}
