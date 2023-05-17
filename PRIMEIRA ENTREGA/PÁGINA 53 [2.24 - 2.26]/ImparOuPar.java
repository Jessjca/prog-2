import java.util.Scanner;

public class ImparOuPar {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                for (;;) {
                System.out.print("Insira um número inteiro: ");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                 System.out.println("O numero " + numero + " é par");
                } else {
                System.out.println("O numero " + numero + " é impar");
                }
            }
        }
    }
}
