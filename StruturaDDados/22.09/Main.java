import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Atleta> atletas = new ArrayList<>();
        String[] files = {"rodada1.txt", "rodada2.txt", "rodada3.txt", "rodada4.txt"};

        for (String file : files) {
            atletas.addAll(readAtletasFromFile(file));
            updateLinearList(atletas);
            displayLinearList(atletas);
        }

        List<Atleta> finalistas = getFinalistas(atletas);
        updateFinalScores(finalistas);
        displayFinalistas(finalistas);
        writeMedalistsToFile(finalistas);
    }

    static class Atleta {
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

    static List<Atleta> readAtletasFromFile(String fileName) {
        List<Atleta> atletas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Nome atleta, pais, pontuação
                String[] parts = line.split(",");
                Atleta atleta = new Atleta(parts[0].trim(), parts[1].trim(), Double.parseDouble(parts[2].trim()));
                atletas.add(atleta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return atletas;
    }

    static void updateLinearList(List<Atleta> atletas) {
        atletas.sort((a, b) -> Double.compare(b.pontuacao, a.pontuacao));
        if (atletas.size() > 20) {
            atletas.subList(20, atletas.size()).clear();
        }
    }

    static void displayLinearList(List<Atleta> atletas) {
        System.out.println("Lista Linear Atualizada:");
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }
    }

    static List<Atleta> getFinalistas(List<Atleta> atletas) {
        return new ArrayList<>(atletas.subList(0, 8));
    }

    static void updateFinalScores(List<Atleta> finalistas) {
        Scanner scanner = new Scanner(System.in);
        for (Atleta atleta : finalistas) {
            System.out.println("Digite a pontuação final para " + atleta.nome + " (" + atleta.pais + "): ");
            atleta.pontuacao = scanner.nextDouble();
        }
        finalistas.sort((a, b) -> Double.compare(b.pontuacao, a.pontuacao));
    }

    static void displayFinalistas(List<Atleta> finalistas) {
        System.out.println("Finalistas:");
        for (Atleta atleta : finalistas) {
            System.out.println(atleta);
        }
    }

    static void writeMedalistsToFile(List<Atleta> finalistas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("medalhas.txt"))) {
            bw.write("Ouro: " + finalistas.get(0) + "\n");
            bw.write("Prata: " + finalistas.get(1) + "\n");
            bw.write("Bronze: " + finalistas.get(2) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}