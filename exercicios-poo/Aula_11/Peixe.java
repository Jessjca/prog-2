package Aula_11;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comidinha de peixe!");
    }

    @Override
    public void emitirAcao() {
        System.out.println("Soltando bolhas!");
    }
}
