import java.util.ArrayList;
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
}
