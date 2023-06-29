import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeral = 0;

            while (numeral < 10000 || numeral > 99999) {
                System.out.print("Digite um número de cinco dígitos: ");
                numeral = scanner.nextInt();

                if (numeral < 10000 || numeral > 99999) {
                    System.out.println("Este número é inválido. Por favor, digite um número de cinco dígitos.");
                }
            }

            int digito1 = numeral / 10000;
            int digito2 = (numeral / 1000) % 10;
            int digito4 = (numeral / 10) % 10;
            int digito5 = numeral % 10;

            if (digito1 == digito5 && digito2 == digito4) {
                System.out.println("O número " + numeral + " é um palíndromo!");
            } else {
                System.out.println("O número " + numeral + " não é um palíndromo!");
            }
        }
    }
}
