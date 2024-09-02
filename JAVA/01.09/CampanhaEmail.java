/*
 Nome: Ricardo Andre Lopes Ikeda
 RA: 10390256
 */
public class CampanhaEmail extends Campanha {
    private long taxaAbertura;
    private long taxaCliques;

    
    public CampanhaEmail(long taxaDeAbertura, long taxaDeCliques) {
        this.taxaAbertura = taxaDeAbertura;
        this.taxaCliques = taxaDeCliques;
    }
    @Override
    public void configurar(){
        System.out.println("Configurando campanha de email.");
    }
    @Override
    public void executar(){
        System.out.println("Executando campanha de email.");
    }
    @Override
    public void avaliar(){
        System.out.println("Avaliando campanha de email.");
    }
}
