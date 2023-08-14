package Questao_01_01;

public class PerifericoEntrada extends Periferico{
    
    public PerifericoEntrada(String nome, String marca, String modelo, String tipoConex) {
        super(nome, marca, modelo, tipoConex);
    }

    public void entrada(Object obj) {
            System.out.println("Recebendo entrada do teclado: " + obj.toString());
        }
}
