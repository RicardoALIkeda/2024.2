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
    
    public boolean remove(String elemento) {
        Node atual, anterior;
        boolean achou = false;
        atual = header;
        anterior = null;

        if (isEmpty()) {
            return false;
        }
        if (atual.nomeAnimal.equals(elemento)) {
            header = atual.next;
            return true;
        }

        anterior = atual;
        atual = atual.next;

        while (atual != null) {
            if (atual.nomeAnimal.equals(elemento)) {
                anterior.next = atual.next;
                return true;
            }
            anterior = atual;
            atual = atual.next;
        }

        return false;
    }
}
