package tadlista;

public class Lista {

    String[] vetor; //tipo da lista
    int tamanho;  //capacidade máxima
    int qtde;  //qtde elementos atual

    public Lista(int tamanho) {
        this.tamanho = tamanho;
        vetor = new String[tamanho];
        qtde = 0;
    }

    public boolean isEmpty() {
        //verifica se a lista está vazia
        if (qtde == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        //retorna a qtde de elementos na lista
        return qtde;
    }

    public String get(int p) throws Exception {
        //retorna o conteúdo da posição p
        if (isEmpty()) {
            throw new Exception("A lista está vazia!!");
        }
        if (p < 0 || p >= qtde) {
            throw new Exception("Posição inválida");
        }
        return vetor[p];
    }

    public void set(int p, String novo) throws Exception {
        //substitui o conteúdo de p por novo
        if (isEmpty()) {
            throw new Exception("A lista está vazia!!");
        }
        if (p < 0 || p >= qtde) {
            throw new Exception("Posição inválida");
        }
        vetor[p] = novo;
    }

    public void add(int p, String novo) throws Exception {
        //adiciona o novo elemento na posição p
        if (qtde == tamanho) {
            throw new Exception("A lista está cheia!! Impossível inserir");
        }
        if (p<0 || p > qtde) {
            throw new Exception("Posição inválida!!");
        }
        for (int i = qtde; i > p; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[p] = novo;
        qtde++;
    }
    
    public void remove(int p) throws Exception {
        //remove o elemento da posição p
        if (isEmpty())
            throw new Exception("A lista está vazia!! Impossível remover");
        if (p<0 || p > qtde-1) {
            throw new Exception("Posição inválida!!");
        }
        for (int i = p; i<=qtde-2;i++){
            vetor[i]=vetor[i+1];
        }
        qtde--;
    }

    public int search(String busca){
        //procura a posição onde está busca
        for (int i=0;i<qtde;i++){
            if (vetor[i].equals(busca))
                return i;
        }
        return -1;
    }
    
    public void mostraLista(){
        //exibe o conteúdo da lista
        for (int i=0;i<qtde;i++)
            System.out.print(vetor[i] + " ");
        System.out.println("FIM DA LISTA!!");
    }
    
}


