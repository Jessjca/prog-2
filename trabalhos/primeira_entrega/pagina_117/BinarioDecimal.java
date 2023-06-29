import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        long num_binario = scanner.nextLong();

        int posicao = 0;
        int decimal = 0;

        while (num_binario != 0) {
            int num = (int) (num_binario % 10);
            decimal += num * Math.pow(2, posicao);
            posicao++;
            num_binario /= 10;
        }

        System.out.println("Número decimal equivalente: " + decimal);

        scanner.close();
    }
}
