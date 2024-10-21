import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[] temposSimulacao = {30, 60, 120, 480};

        for (int tempoSimulacao : temposSimulacao) {
            simular(tempoSimulacao);
        }
    }

    public static void simular(int tempoSimulacao) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();
        int clientesAtendidos = 0;
        int tempoEsperaTotal = 0;
        int maiorTempoEspera = 0;

        for (int minuto = 0; minuto < tempoSimulacao; minuto++) {
            if (!fila.isEmpty()) {
                int tempoEntrada = fila.poll();
                int tempoEspera = minuto - tempoEntrada;
                tempoEsperaTotal += tempoEspera;
                clientesAtendidos++;
                if (tempoEspera > maiorTempoEspera) {
                    maiorTempoEspera = tempoEspera;
                }
            }
            int k = random.nextInt(3);
            for (int i = 0; i < k; i++) {
                fila.add(minuto);
            }
        }

        double tempoMedioEspera = clientesAtendidos > 0 ? (double) tempoEsperaTotal / clientesAtendidos : 0;

        System.out.println("Tempo de Simulação: " + tempoSimulacao + " minutos");
        System.out.println("Número total de clientes atendidos: " + clientesAtendidos);
        System.out.println("Tempo médio de espera na fila: " + tempoMedioEspera);
        System.out.println("Maior tempo de espera na fila: " + maiorTempoEspera);
        System.out.println();
    }
}