import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em quilogramas: ");
        int pesoKg = scanner.nextInt();

        System.out.print("Digite sua altura em centímetros: ");
        int alturaCm = scanner.nextInt();

        int imc = (int) calcularIMC(pesoKg, alturaCm);

        String classificacaoIMC = interpretarIMC(imc);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação do IMC: " + classificacaoIMC);

        System.out.println("\nInformações do Department of Health and Human Services/National Institutes of Health:");
        System.out.println("IMC abaixo de 18: Abaixo do peso");
        System.out.println("IMC entre 18 e 24: Peso normal");
        System.out.println("IMC entre 25 e 29: Sobrepeso");
        System.out.println("IMC acima de 30: Obesidade");

        scanner.close();
    }

    public static double calcularIMC(int peso, int altura) {

        double alturaMetros = altura / 100.0;

 
        double imc = peso / (alturaMetros * alturaMetros);

        return imc;
    }

    public static String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
