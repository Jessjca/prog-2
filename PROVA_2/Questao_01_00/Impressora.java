package Questao_01_00;

public class Impressora extends Periferico implements PerifericoSaida {

    public Impressora(String nome, String marca, String modelo, String tipoConexão) {
        super(nome, marca, modelo, tipoConexão);
    }

    @Override
    public void saida(Object dados) {
        System.out.println("Imprimindo: " + dados.toString());
    }
}
