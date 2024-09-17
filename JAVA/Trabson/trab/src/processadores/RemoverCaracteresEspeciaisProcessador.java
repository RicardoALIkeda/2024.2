package processadores;
/*
Ricardo Andre Lopes Ikeda - 10390256
Diego Estevao Lopes de Queiroz - 10419038
 */
import interfaces.ProcessadorTexto;

public class RemoverCaracteresEspeciaisProcessador implements ProcessadorTexto {
    @Override
    public String processar(String texto) {
        return texto.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}