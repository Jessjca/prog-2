package Exercicio_Animais;

public class Gato extends Animal { // Classe Gato que herda de Animal
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O gato está miando.");
    }
}
