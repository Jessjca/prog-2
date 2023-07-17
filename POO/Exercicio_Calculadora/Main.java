package Exercicio_Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(2, 3);
        double resultado2 = calculadora.somar(2.5, 3.7);
        int resultado3 = calculadora.somar(2, 3, 4);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}


