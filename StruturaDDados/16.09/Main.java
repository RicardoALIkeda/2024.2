class Main {
public static void main(String[] args) {
ArrayList<Atleta> atletas = new ArrayList<>();
try {
File arquivo = new File("atletas.txt");
Scanner scanner = new Scanner(arquivo);
while (scanner.hasNextLine()) {
String linha = scanner.nextLine();
String[] dados = linha.split(",");
Atleta atleta = new Atleta(dados[0], Integer.parseInt(dados[1]), dados[2],
Double.parseDouble(dados[3]));
atletas.add(atleta);
}
scanner.close();
for (Atleta atleta : atletas) {
System.out.println(atleta);
}
} catch (FileNotFoundException e) {
System.out.println("Arquivo não encontrado: " + e.getMessage());
}
}
}
