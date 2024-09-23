import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/*Ricardo Andre Lopes Ikeda - 10390256 */

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

    public void entradaManualPontuacaoFinal(ArrayList<Atleta> finalistas) {
        Scanner scanner = new Scanner(System.in);
        for (Atleta atleta : finalistas) {
            double pontuacaoFinal;
            do {
                System.out.println("Digite a pontuação final para " + atleta.nome + " (" + atleta.pais + ") entre 0 e 20: ");
                pontuacaoFinal = scanner.nextDouble();
                if (pontuacaoFinal < 0 || pontuacaoFinal > 20) {
                    System.out.println("Pontuação inválida. Por favor, insira um valor entre 0 e 20.");
                }
            } while (pontuacaoFinal < 0 || pontuacaoFinal > 20);
            atleta.pontuacao = pontuacaoFinal;
        }
        ordenar();
    }
}