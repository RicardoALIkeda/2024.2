import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class Atleta {
String nome;
int idade;
String modalidade;
double tempo;
public Atleta(String nome, int idade, String modalidade, double tempo) {
this.nome = nome;
this.idade = idade;
this.modalidade = modalidade;
this.tempo = tempo;
}
@Override
public String toString() {
return "Atleta: " + nome + ", Idade: " + idade + ", Modalidade: " + modalidade + ",
Tempo: " + tempo;
}
}
