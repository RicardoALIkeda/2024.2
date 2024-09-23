import java.io.*;
import java.util.*;
/*Ricardo Andre Lopes Ikeda - 10390256 */
public class Main {
    public static void main(String[] args) {
        Vetor atletas = new Vetor();
        String[] arquivos = {"rodada1.txt", "rodada2.txt", "rodada3.txt", "rodada4.txt"};

        for (String arquivo : arquivos) {
            lerArquivo(arquivo, atletas);
            atletas.ordenar();
            atletas.limitar(20);
            System.out.println("Lista atualizada após " + arquivo + ":");
            atletas.exibir();
        }

        ArrayList<Atleta> finalistas = atletas.getFinalistas(8);
        atletas.entradaManualPontuacaoFinal(finalistas);
        finalistas.sort((a, b) -> Double.compare(b.pontuacao, a.pontuacao)); // Ordena os finalistas por pontuação decrescente
        exibirMedalhistas(finalistas);
        gravarMedalhistas(finalistas);
    }

    static void lerArquivo(String nomeArquivo, Vetor atletas) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(",");
                Atleta atleta = new Atleta(dados[0].trim(), dados[1].trim(), Double.parseDouble(dados[2].trim()));
                atletas.inserir(atleta);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    static void exibirMedalhistas(ArrayList<Atleta> finalistas) {
        System.out.println("Medalhistas:");
        
        if (finalistas.size() < 3) {
            System.out.println("Não há atletas suficientes para atribuir todas as medalhas.");
            return;
        }

        System.out.println("Ouro: " + finalistas.get(0));
        System.out.println("Prata: " + finalistas.get(1));
        System.out.println("Bronze: " + finalistas.get(2));
    }

    static void gravarMedalhistas(ArrayList<Atleta> finalistas) {
        try (FileWriter writer = new FileWriter("medalhas.txt")) {
            writer.write("Ouro: " + finalistas.get(0) + "\n");
            writer.write("Prata: " + finalistas.get(1) + "\n");
            writer.write("Bronze: " + finalistas.get(2) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}