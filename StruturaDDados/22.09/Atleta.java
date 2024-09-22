public class Atleta {
    String nome;
    String pais;
    double pontuacao;

    public Atleta(String nome, String pais, double pontuacao) {
        this.nome = nome;
        this.pais = pais;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return nome + " " + pais + " " + pontuacao;
    }
}