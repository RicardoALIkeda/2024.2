class RemoverCaracteresEspeciaisProcessador implements ProcessadorTexto {
    @Override
    public String processar(String texto) {
        return texto.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}