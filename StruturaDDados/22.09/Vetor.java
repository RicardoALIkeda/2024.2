import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vetor {
    private ArrayList<Atleta> elementos;

    public Vetor() {
        elementos = new ArrayList<>();
    }

    public void inserir(Atleta atleta) {
        elementos.add(atleta);
    }

    public void remover(int indice) {
        elementos.remove(indice);
    }

    public void remover(Atleta atleta) {
        elementos.remove(atleta);
    }

    public Atleta buscarPorNome(String nome) {
        for (Atleta atleta : elementos) {
            if (atleta.nome.equals(nome)) {
                return atleta;
            }
        }
        return null;
    }

    public int tamanho() {
        return elementos.size();
    }

    public Atleta get(int indice) {
        return elementos.get(indice);
    }

    public void ordenar() {
        Collections.sort(elementos, Comparator.comparingDouble(a -> -a.pontuacao));
    }

    public void limitar(int tamanho) {
        if (elementos.size() > tamanho) {
            elementos.subList(tamanho, elementos.size()).clear();
        }
    }

    public ArrayList<Atleta> getFinalistas(int quantidade) {
        return new ArrayList<>(elementos.subList(0, quantidade));
    }

    public void exibir() {
        for (Atleta atleta : elementos) {
            System.out.println(atleta);
        }
    }
}