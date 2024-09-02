/*
 Nome: Ricardo Andre Lopes Ikeda
 RA: 10390256
 */
public class CampanhaEmail extends Campanha {
    private long taxaDeAbertura;
    private long taxaDeCliques;

    
    public CampanhaEmail(long taxaDeAbertura, long taxaDeCliques) {
        this.taxaDeAbertura = taxaDeAbertura;
        this.taxaDeCliques = taxaDeCliques;
    }
    public void configurar(){
        System.out.println("Configurando campanha de email.");
    }
    public void executar(){
        System.out.println("Executando campanha de email.");
    }
    public void avaliar(){
        System.out.println("Avaliando campanha de email.");
    }
}
