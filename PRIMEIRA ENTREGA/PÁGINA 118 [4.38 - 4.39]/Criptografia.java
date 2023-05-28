import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de quatro dígitos para criptografar: ");
        int numeroOriginal = scanner.nextInt();

        int numeroCriptografado = criptografar(numeroOriginal);
        System.out.println("Número criptografado: " + numeroCriptografado);

        System.out.print("Digite um número de quatro dígitos criptografado para descriptografar: ");
        int numeroCriptografadoInput = scanner.nextInt();

        int numeroDescriptografado = descriptografar(numeroCriptografadoInput);
        System.out.println("Número descriptografado: " + numeroDescriptografado);

        scanner.close();
    }

    public static int criptografar(int numero) {
        int digito1 = (numero / 1000 + 7) % 10;
        int digito2 = ((numero / 100) % 10 + 7) % 10;
        int digito3 = ((numero / 10) % 10 + 7) % 10;
        int digito4 = (numero % 10 + 7) % 10;

        int numeroCriptografado = digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;

        return numeroCriptografado;
    }

    public static int descriptografar(int numeroCriptografado) {
        int digito1 = (numeroCriptografado / 10) % 10;
        int digito2 = numeroCriptografado % 10;
        int digito3 = numeroCriptografado / 1000;
        int digito4 = (numeroCriptografado / 100) % 10;

        int numeroDescriptografado = digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;

        return numeroDescriptografado;
    }
}
