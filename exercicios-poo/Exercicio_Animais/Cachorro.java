package Exercicio_Animais;

public class Cachorro extends Animal {    // Classe Cachorro que herda de Animal
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro está latindo.");
    }
}
