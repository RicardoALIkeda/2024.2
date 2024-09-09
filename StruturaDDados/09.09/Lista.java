import java.util.Arrays;

public class Lista {
    private Gamer[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        elementos = new Gamer[capacidade];
        tamanho = 0;
    }

    public void add(Gamer gamer) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = gamer;
            tamanho++;
            Arrays.sort(elementos, 0, tamanho); // Ordena a lista após a inserção
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public void remove(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[tamanho - 1] = null;
            tamanho--;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public Gamer get(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        }
        return null;
    }

    public void mostraLista() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }
}