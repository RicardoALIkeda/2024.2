/*
 Nome: Ricardo Andre Lopes Ikeda
 RA: 10390256
 */
public class Main {
    public static void main(String[] args) {
        Campanha campanhaRedeSocial= new CampanhaRedeSocial(1,2,3);

        campanhaRedeSocial.configurar();
        campanhaRedeSocial.executar();
        campanhaRedeSocial.avaliar();
        System.out.println("=====================================");
        Campanha campanhaEmail = new CampanhaEmail(1,2);
        campanhaEmail.configurar();
        campanhaEmail.executar();
        campanhaEmail.avaliar();
    }
}
