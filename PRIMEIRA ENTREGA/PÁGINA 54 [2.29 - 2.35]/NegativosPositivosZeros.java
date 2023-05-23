import java.util.Scanner;

public class NegativosPositivosZeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int contadorNegativos = 0;
            int contadorPositivos = 0;
            int contadorZeros = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o número " + i + ": ");
                int numero = scanner.nextInt();

                if (numero < 0) {
                    contadorNegativos++;
                } else if (numero > 0) {
                    contadorPositivos++;
                } else {
                    contadorZeros++;
                }
            }

            System.out.println("Quantidade de números negativos: " + contadorNegativos);
            System.out.println("Quantidade de números positivos: " + contadorPositivos);
            System.out.println("Quantidade de zeros: " + contadorZeros);
        }
    }
}
