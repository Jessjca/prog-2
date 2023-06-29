import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            for (;;) {
                System.out.println("Insira o primeiro número inteiro na tela:");
                int numero_1 = scanner.nextInt();

                System.out.println("Insira o primeiro número inteiro na tela:");
                int numero_2 = scanner.nextInt();

                if (numero_1 % numero_2 == 0){
                    System.out.println("Os números são multiplos entre si!");
                } else {
                    System.out.println("Os números não são multiplos entre si");
                }

                int multiplica;

                multiplica = numero_1 * numero_2;
                System.out.println("A multiplicação dos números inseridos resulta em: " + multiplica);
            }
        }
    }
}
