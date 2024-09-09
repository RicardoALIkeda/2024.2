import java.util.*;    
    public class GerenciadorNomesMem implements GerenciadorNomes {
        private List<String> nomes = new ArrayList<String>();
        @Override
        public list<String> obterNomes(){
            return nomes;
        }

        @Override
        public void adicionarNome(String nome){
            nomes.add(nome);
        }

}
