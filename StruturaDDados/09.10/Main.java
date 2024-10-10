import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Atleta> atletas = new ArrayList<>();
        atletas.add(new Atleta("Carlos", 25, 90));
        atletas.add(new Atleta("Ana", 22, 95));
        atletas.add(new Atleta("Bruno", 30, 85));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha o critério de ordenação:");
            System.out.println("1. Nome (Ordem Alfabética)");
            System.out.println("2. Idade (Ordem Crescente)");
            System.out.println("3. Pontuação (Ordem Decrescente)");
            System.out.println("4. Nome (Usando Comparator)");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    Collections.sort(atletas);
                    break;
                case 2:
                    Collections.sort(atletas, new IdadeComparator());
                    break;
                case 3:
                    Collections.sort(atletas, new PontuacaoComparator());
                    break;
                case 4:
                    Collections.sort(atletas, new NomeComparator());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            for (Atleta atleta : atletas) {
                System.out.println(atleta);
            }
        }
    }
}