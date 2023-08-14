package Questao_01_01;

public class Main {
    public static void main(String[] args) {
        PerifericoSaida ps = new PerifericoSaida("Impressora 1", "HP", "Modelo XYZ", "USB");
        PerifericoEntrada pe = new PerifericoEntrada("Teclado 1", "Logitech", "Modelo ABC", "USB");

        System.out.println(ps.toString());
        System.out.println(pe.toString());
        
        pe.toString();

        String textoParaImprimir = "Olá, mundo";
        ps.saida(textoParaImprimir);

        String sequenciaDeTeclas = "ABCD";
        pe.entrada(sequenciaDeTeclas);
    }
}