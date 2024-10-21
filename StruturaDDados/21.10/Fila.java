import java.util.LinkedList;
import java.util.Queue;

class Fila {
    private Queue<Integer> itens;

    public Fila() {
        this.itens = new LinkedList<>();
    }

    public boolean vazia() {
        return this.itens.isEmpty();
    }

    public void enfileirar(int item) {
        this.itens.add(item);
    }

    public Integer desenfileirar() {
        if (!this.vazia()) {
            return this.itens.poll();
        } else {
            return null;
        }
    }

    public int tamanho() {
        return this.itens.size();
    }
}


