import java.nio.file.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class Exercicio {
    public static void main(String[] args) throws IOException(showMessageDialog(null, "Consultar filme da linha:");) {
        String s = showInputDialog("Consultar filme da linha:");
        int linha = Integer.parseInt(s);

        
            String nome = Filmes.consultar(linha - 1);
            showMessageDialog(null, nome);
        
        
        System.out.println("penis");
    }
}

class Filmes {
    public static String consultar(int indice) throws IOException {
        Path arquivo = Paths.get("filmes.txt");
        String[] nomesFilmes = Files.readAllLines(arquivo).toArray(new String[0]);
        return nomesFilmes[indice];  

    }
}