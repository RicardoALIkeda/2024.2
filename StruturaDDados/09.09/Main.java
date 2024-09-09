public class Main {
    public static void main(String[] args) {
        Lista scores = new Lista(10);

        scores.add(new Gamer("Alice", 500));
        scores.add(new Gamer("Bob", 300));
        scores.add(new Gamer("Charlie", 700));
        scores.add(new Gamer("Dave", 600));
        scores.add(new Gamer("Eve", 400));

        System.out.println("Lista de scores:");
        scores.mostraLista();

        System.out.println("\nPrimeira posição=");
        System.out.println(scores.get(0));

        scores.remove(2);

        scores.mostraLista();
    }
}