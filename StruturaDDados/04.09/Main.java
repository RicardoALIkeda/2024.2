import java.util.Random;

public class Main {

    static int contadorOperacoes = 0; // Contador global de operações

    public static void main(String[] args) {
        int[][] A = new int[800][800];
        int[][] B = new int[800][800];


        preencheA(A);
        preencheB(B);

        int[][] C = new int[A.length][B[0].length];
        C = multiplica(A, B);

       // exibeResult(C);

        System.out.println("Número de operações realizadas: " + contadorOperacoes);
    }

    public static void preencheA(int A[][]) {
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = rand.nextInt(11); // Valores entre 0 e 10
            }
        }
    }

    public static void preencheB(int B[][]) {
        Random rand = new Random();
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = rand.nextInt(11); // Valores entre 0 e 10
            }
        }
    }

    public static int[][] multiplica(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];  

                    contadorOperacoes++; // Incrementa o contador
                }
            }
        }
        return C;
    }

    public static void exibeResult(int C[][]) {
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}