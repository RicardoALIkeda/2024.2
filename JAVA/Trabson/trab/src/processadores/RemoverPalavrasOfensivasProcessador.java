package processadores;
/*
Ricardo Andre Lopes Ikeda - 10390256
Diego Estevao Lopes de Queiroz - 10419038
 */
import interfaces.ProcessadorTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RemoverPalavrasOfensivasProcessador implements ProcessadorTexto {
    private Set<String> palavrasOfensivas;

    public RemoverPalavrasOfensivasProcessador(String arquivoPalavrasOfensivas) {
        this.palavrasOfensivas = carregarPalavrasOfensivas(arquivoPalavrasOfensivas);
    }

    private Set<String> carregarPalavrasOfensivas(String arquivo) {
        Set<String> palavras = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                palavras.add(linha.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar palavras ofensivas: " + e.getMessage());
        }
        return palavras;
    }

    @Override
    public String processar(String texto) {
        String[] palavras = texto.split("\\s+");
        StringBuilder textoProcessado = new StringBuilder();
        for (String palavra : palavras) {
            if (palavrasOfensivas.contains(palavra.toLowerCase())) {
                textoProcessado.append("[REMOVIDO]").append(" ");
            } else {
                textoProcessado.append(palavra).append(" ");
            }
        }
        return textoProcessado.toString().trim();
    }
}