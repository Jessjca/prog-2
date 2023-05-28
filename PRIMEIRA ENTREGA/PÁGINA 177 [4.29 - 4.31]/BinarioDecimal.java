import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        long numeroBinario = scanner.nextLong();

        int decimal = 0;
        int posicao = 0;

        while (numeroBinario != 0) {
            int digito = (int) (numeroBinario % 10);
            decimal += digito * Math.pow(2, posicao);
            posicao++;
            numeroBinario /= 10;
        }

        System.out.println("O número decimal equivalente é: " + decimal);

        scanner.close();
    }
}
