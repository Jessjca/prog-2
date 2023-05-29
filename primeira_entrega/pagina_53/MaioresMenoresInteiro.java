import java.util.Scanner;

public class MaioresMenoresInteiro {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Insira o primeiro número inteiro: ");
        int numero_1 = scanner.nextInt();

        System.out.print("Insira o segundo número inteiro: ");
        int numero_2 = scanner.nextInt();

        System.out.print("Insira o terceiro número inteiro: ");
        int numero_3 = scanner.nextInt();

        System.out.print("Insira o quarto número inteiro: ");
        int numero_4 = scanner.nextInt();

        System.out.print("Insira o quinto número inteiro: ");
        int numero_5 = scanner.nextInt();

        int menor;
        int maior;

        if (numero_1 <= numero_2 && numero_1 <= numero_3 && numero_1 <= numero_4 && numero_1 <= numero_5) {
            menor = numero_1;
        } else if (numero_2 <= numero_1 && numero_2 <= numero_3 && numero_2 <= numero_4 && numero_2 <= numero_5) {
            menor = numero_2;
        } else if (numero_3 <= numero_1 && numero_3 <= numero_2 && numero_3 <= numero_4 && numero_3 <= numero_5) {
            menor = numero_3;
        } else if (numero_4 <= numero_1 && numero_4 <= numero_2 && numero_4 <= numero_3 && numero_4 <= numero_5) {
            menor = numero_4;
        } else {
            menor = numero_5;
        }

        if (numero_1 >= numero_2 && numero_1 >= numero_3 && numero_1 >= numero_4 && numero_1 >= numero_5) {
            maior = numero_1;
        } else if (numero_2 >= numero_1 && numero_2 >= numero_3 && numero_2 >= numero_4 && numero_2 >= numero_5) {
            maior = numero_2;
        } else if (numero_3 >= numero_1 && numero_3 >= numero_2 && numero_3 >= numero_4 && numero_3 >= numero_5) {
            maior = numero_3;
        } else if (numero_4 >= numero_1 && numero_4 >= numero_2 && numero_4 >= numero_3 && numero_4 >= numero_5) {
            maior = numero_4;
        } else {
            maior = numero_5;
        }

        System.out.println("O menor número entre os 5 é: "+ menor);
        System.out.println("O maior número entre os 5 é: " + maior);
    }
    }
}
