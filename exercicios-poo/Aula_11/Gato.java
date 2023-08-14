package Aula_11;

public class Gato extends Mamifero{
    public void miar() {
        System.out.println(getNome() + " está miando!");
    }

    public void seLamber() {
        System.out.println(getNome() + " está se lambendo");
    }

    @Override
    public void emitirAcao() {
        System.out.println("Miau! Miau! Miau! " + getNome() + " está miando muito!");
    }

    @Override
    public void alimentar() {
        System.out.println("EBA! " + getNome() + " ganhou um Whiskas!");
    }

    public void reagir(String frase) {
        if(frase == "Toma petisco" || frase == "Olá") {
            System.out.println("Abanar o rabo e sorrir!");
        }else {
            System.out.println("Miando feio e mostrando unhas!!");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12 && hora > 8) {
            System.out.println("Abanar o rabo");
        }else if(hora <= 18 && hora >= 12){
            System.out.println("Ignorar");
        }else {
            System.out.println("Latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono == true) {
            System.out.println("Abanar o rabo");
        }else {
            System.out.println("Latir!");
        }
    }

}
