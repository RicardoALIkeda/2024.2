public class Main {
    public static void main(String[] args) {
        Lista scores = new Lista(10);

        scores.add(new Gamer("JOAO", 500));
        scores.add(new Gamer("MARIA", 300));
        scores.add(new Gamer("SILVIA", 700));
        scores.add(new Gamer("PEDRO", 666));
        scores.add(new Gamer("SARAH", 400));

        System.out.println("Lista de scores:");
        scores.mostraLista();

        System.out.println("\nPrimeira posição=");
        System.out.println(scores.get(0));

        scores.remove(2);

        scores.mostraLista();
    }
}