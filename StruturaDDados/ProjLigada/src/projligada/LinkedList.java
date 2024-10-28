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
    public boolean removeFirst(){
            if(isEmpty()){
                return false;
            }
            header = header.next;
            size--;
            if(isEmpty()){
                trailer = null;
            }
            return true;
    }
    public boolean removeLast(){
        //remove o último nó da lista
        if (isEmpty())
            return false;
        else {
            Node aux = header;
            while (aux.next != trailer)
                aux = aux.next;
            trailer = aux;
            trailer.next = null;
            size--;
            return true;
        }
    }
    
    public boolean remove(String elemento) {
        Node atual, anterior;
        atual = header;
        anterior = null;

        if (isEmpty()) {
            return false;
        }
        if (atual.nomeAnimal.equals(elemento)) {
            header = atual.next;
            size--;
            return true;
        }

        anterior = atual;
        atual = atual.next;

        while (atual != null) {
            if (atual.nomeAnimal.equals(elemento)) {
                anterior.next = atual.next;
                size--;
                return true;
            }
            anterior = atual;
            atual = atual.next;
        }

        return false;
    }
}
