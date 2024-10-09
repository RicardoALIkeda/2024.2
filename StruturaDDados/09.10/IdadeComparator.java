import java.util.Comparator;

class IdadeComparator implements Comparator<Atleta> {
    @Override
    public int compare(Atleta a1, Atleta a2) {
        return Integer.compare(a1.getIdade(), a2.getIdade());
    }
}

class PontuacaoComparator implements Comparator<Atleta> {
    @Override
    public int compare(Atleta a1, Atleta a2) {
        return Integer.compare(a2.getPontuacao(), a1.getPontuacao());
    }
}

class NomeComparator implements Comparator<Atleta> {
    @Override
    public int compare(Atleta a1, Atleta a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}