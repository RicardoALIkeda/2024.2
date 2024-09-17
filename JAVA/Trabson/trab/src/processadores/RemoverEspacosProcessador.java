package processadores;
/*
Ricardo Andre Lopes Ikeda - 10390256
Diego Estevao Lopes de Queiroz - 10419038
 */
import interfaces.ProcessadorTexto;

public class RemoverEspacosProcessador implements ProcessadorTexto {
    @Override
    public String processar(String texto) {
        return texto.replaceAll("\\s+", " ").trim();
    }
}