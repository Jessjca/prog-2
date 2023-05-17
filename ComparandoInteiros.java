import java.util.Scanner;

public class ComparandoInteiros {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Insira o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Insira o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 < numero2)
            System.out.println(numero2 + " é maior");
            else if (numero1 > numero2)
            System.out.println(numero1 + " é maior");
            else
            System.out.println("Os numeros são iguais!");
        }

    }
}
