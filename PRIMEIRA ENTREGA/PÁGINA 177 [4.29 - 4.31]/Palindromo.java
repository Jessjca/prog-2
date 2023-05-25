import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero < 10000 || numero > 99999) {
            System.out.print("Digite um número de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero < 10000 || numero > 99999) {
                System.out.println("Número inválido. Por favor, digite um número de cinco dígitos.");
            }
        }

        int digito1 = numero / 10000;
        int digito2 = (numero / 1000) % 10;
        int digito4 = (numero / 10) % 10;
        int digito5 = numero % 10;

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println("O número " + numero + " é um palíndromo.");
        } else {
            System.out.println("O número " + numero + " não é um palíndromo.");
        }

        scanner.close();
    }
}
