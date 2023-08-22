package Exercicio_10;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Dolar dolar = new Dolar(10);
        ConversorMoeda conversor = new DolarAdapter(dolar);

        System.out.println("A conversão de " + dolar.getQuantidade() + " Dólares é igual a " + conversor.converter(dolar.getQuantidade()) + " Reais.");
    }
}

