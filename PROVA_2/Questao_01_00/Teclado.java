package Questao_01_00;

public class Teclado extends Periferico implements PerifericoEntrada {

    public Teclado(String nome, String marca, String modelo, String tipoConexão) {
        super(nome, marca, modelo, tipoConexão);
    }

    @Override
    public void entrada(Object dados) {
        System.out.println("Recebendo entrada do teclado: " + dados.toString());
    }
}
