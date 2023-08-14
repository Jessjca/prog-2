package Questao_01_01;

public class PerifericoSaida extends Periferico{

    public PerifericoSaida(String nome, String marca, String modelo, String tipoConex) {
        super(nome, marca, modelo, tipoConex);
    }

    public void saida(Object obj) {
        System.out.println("Imprimindo: " + obj.toString());
    }
}
