import java.util.Random;
class Simulador {
    private int tempoTotal;
    private Fila fila;
    private int totalClientes;
    private int tempoEsperaTotal;
    private int maiorTempoEspera;

    public Simulador(int tempoTotal) {
        this.tempoTotal = tempoTotal;
        this.fila = new Fila();
        this.totalClientes = 0;
        this.tempoEsperaTotal = 0;
        this.maiorTempoEspera = 0;
    }

    public void executar() {
        Random random = new Random();
        for (int minuto = 0; minuto < this.tempoTotal; minuto++) {
            if (!this.fila.vazia()) {
                int cliente = this.fila.desenfileirar();
                int tempoEspera = minuto - cliente;
                this.tempoEsperaTotal += tempoEspera;
                this.maiorTempoEspera = Math.max(this.maiorTempoEspera, tempoEspera);
                this.totalClientes++;
            }

            int k = random.nextInt(3); // Gera um número aleatório entre 0 e 2
            for (int i = 0; i < k; i++) {
                this.fila.enfileirar(minuto);
            }
        }
    }

    public void relatorio() {
        double tempoMedioEspera = 0;
        if (this.totalClientes > 0) {
            tempoMedioEspera = (double) this.tempoEsperaTotal / this.totalClientes;
        }

        System.out.println("Tempo total da simulação: " + this.tempoTotal + " minutos");
        System.out.println("Número total de clientes atendidos: " + this.totalClientes);
        System.out.printf("Tempo médio de espera na fila: %.2f minutos\n", tempoMedioEspera);
        System.out.println("Maior tempo de espera na fila: " + this.maiorTempoEspera + " minutos");
    }

    public static void main(String[] args) {
        int[] temposSimulacao = {30, 60, 120, 480};

        for (int tempo : temposSimulacao) {
            System.out.println("\nSimulação com " + tempo + " minutos:");
            Simulador simulador = new Simulador(tempo);
            simulador.executar();
            simulador.relatorio();
        }
    }
}