import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler o peso do usuário em quilogramas
        System.out.print("Digite seu peso em quilogramas: ");
        int pesoKg = scanner.nextInt();

        // Ler a altura do usuário em centímetros
        System.out.print("Digite sua altura em centímetros: ");
        int alturaCm = scanner.nextInt();

        // Calcular o IMC
        int imc = (int) calcularIMC(pesoKg, alturaCm);

        // Interpretar o IMC
        String classificacaoIMC = interpretarIMC(imc);

        // Exibir o resultado
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação do IMC: " + classificacaoIMC);

        // Informações do DHHS/NIH
        System.out.println("\nInformações do Department of Health and Human Services/National Institutes of Health:");
        System.out.println("IMC abaixo de 18: Abaixo do peso");
        System.out.println("IMC entre 18 e 24: Peso normal");
        System.out.println("IMC entre 25 e 29: Sobrepeso");
        System.out.println("IMC acima de 30: Obesidade");

        // Fechar o Scanner
        scanner.close();
    }

    public static double calcularIMC(int peso, int altura) {
        // Converter a altura de centímetros para metros
        double alturaMetros = altura / 100.0;

        // Calcular o IMC
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
