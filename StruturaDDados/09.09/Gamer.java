public class Gamer implements Comparable<Gamer> {
    private String nome;
    private int score;

    public Gamer(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Gamer outro) {
        return Integer.compare(outro.getScore(), this.score); // Ordena em ordem decrescente
    }

    @Override
    public String toString() {
        return nome + ": " + score;
    }
}