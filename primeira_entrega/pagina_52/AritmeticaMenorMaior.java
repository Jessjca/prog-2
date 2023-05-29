import java.util.Scanner;

public class AritmeticaMenorMaior {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Insira o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.print("Insira o terceiro número inteiro: ");
            int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        int media = (numero1 + numero2 + numero3)/3;
        int produto = numero1 * numero2 * numero3;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        System.out.println("O produto dos números é: " + produto);
        
        int menor;
        int maior;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        System.out.println("O menor número entre os 3 é: "+ menor);
        System.out.println("O maior número entre os 3 é: " + maior);
        
        }
    }
}