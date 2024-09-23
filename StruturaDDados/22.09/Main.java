import java.io.*;
import java.util.*;

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
        entradaManualPontuacaoFinal(finalistas);
        finalistas.sort((a, b) -> Double.compare(b.pontuacao, a.pontuacao));
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

    static void entradaManualPontuacaoFinal(ArrayList<Atleta> finalistas) {
        Scanner scanner = new Scanner(System.in);
        for (Atleta atleta : finalistas) {
            System.out.println("Digite a pontuação final para " + atleta.nome + " (" + atleta.pais + "): ");
            double pontuacaoFinal = scanner.nextDouble();
            atleta.pontuacao = pontuacaoFinal;
        }
    }

    static void exibirMedalhistas(ArrayList<Atleta> finalistas) {
        System.out.println("Medalhistas:");
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