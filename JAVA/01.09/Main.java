/*
 Nome: Ricardo Andre Lopes Ikeda
 RA: 10390256
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("_____________________________________");
        Campanha campanhaRedeSocial= new CampanhaRedeSocial(23,10,13);
        campanhaRedeSocial.configurar();
        campanhaRedeSocial.executar();
        campanhaRedeSocial.avaliar();

        System.out.println("_____________________________________");
        Campanha campanhaEmail = new CampanhaEmail(199999,27545);
        campanhaEmail.configurar();
        campanhaEmail.executar();
        campanhaEmail.avaliar();
        System.out.println("_____________________________________");
    }
}
