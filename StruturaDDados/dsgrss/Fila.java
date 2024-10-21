import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos;

    public Fila() {
        elementos = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        elementos.addLast(elemento);
    }

    public T dequeue() {
        return elementos.removeFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
}       