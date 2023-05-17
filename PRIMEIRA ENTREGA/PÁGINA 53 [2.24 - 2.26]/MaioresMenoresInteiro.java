import java.util.Scanner;

public class MaioresMenoresInteiro {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Insira o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Insira o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        System.out.print("Insira o quarto número inteiro: ");
        int numero4 = scanner.nextInt();

        System.out.print("Insira o quinto número inteiro: ");
        int numero5 = scanner.nextInt();

        int menor;
        int maior;

        if (numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4 && numero1 <= numero5) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4 && numero2 <= numero5) {
            menor = numero2;
        } else if (numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4 && numero3 <= numero5) {
            menor = numero3;
        } else if (numero4 <= numero1 && numero4 <= numero2 && numero4 <= numero3 && numero4 <= numero5) {
            menor = numero4;
        } else {
            menor = numero5;
        }

        if (numero1 >= numero2 && numero1 >= numero3 && numero1 >= numero4 && numero1 >= numero5) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3 && numero2 >= numero4 && numero2 >= numero5) {
            maior = numero2;
        } else if (numero3 >= numero1 && numero3 >= numero2 && numero3 >= numero4 && numero3 >= numero5) {
            maior = numero3;
        } else if (numero4 >= numero1 && numero4 >= numero2 && numero4 >= numero3 && numero4 >= numero5) {
            maior = numero4;
        } else {
            maior = numero5;
        }

        System.out.println("O menor número entre os 5 é: "+ menor);
        System.out.println("O maior número entre os 5 é: " + maior);
    }
    }
}
