class RemoverEspacosProcessador implements ProcessadorTexto {
    @Override
    public String processar(String texto) {
        return texto.replaceAll("\\s+", " ").trim();
    }
}