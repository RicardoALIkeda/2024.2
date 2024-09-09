public class Main {
    public static void main(String[] args) {
      GerenciadorNomes gNomes = new GerenciadorNomes();
      Ihm ihm = new Ihm(gNomes);
      ihm.dialogar();
    }
  }