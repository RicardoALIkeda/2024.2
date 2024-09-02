import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] chaves = new int[500];
        preencherComNumerosAleatorios(chaves);
        bubbleSort(chaves);
        // Adicione qualquer outra lógica que você precise aqui
    }
        public static void preencherComNumerosAleatorios(int[] chaves) {
        Random random = new Random();
        for (int i = 0; i < chaves.length; i++) {
            chaves[i] = random.nextInt(1000); // Gera números aleatórios entre 0 e 999
        }
    }
    public static void bubbleSort(int[] chaves) {
        int temp;
        int counter = 0; // Inicializa o contador de trocas
        // inicia o Bubble Sort
        for (int i = 0; i < chaves.length; i++) {
            for (int j = 1; j < chaves.length - i; j++) {
                if (chaves[j - 1] > chaves[j]) {
                    // troca os elementos
                    temp = chaves[j - 1];
                    chaves[j - 1] = chaves[j];
                    chaves[j] = temp;
                    counter++; // Incrementa o contador de trocas
                }
            }
        }
        System.out.println("Número de trocas realizadas: " + counter); // Exibe o número de trocas
    }
}