package Aula_11;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Métodos abstratos
    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirAcao() {
        System.out.println("Som de gato!");
    }

    @Override
    public void locomover() {
        System.out.println(getNome() + " está correndo com suas patinhas!");
    }
}
