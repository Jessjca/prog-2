import java.util.Scanner;

public class SeparandoDigitos {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                for(;;){
                System.out.println();
                System.out.println("Digite um número de cinco dígitos: ");
                int numero = scanner.nextInt();

                int contador = 0;
                int divisor = 10000;

             if (numero < 10000 || numero > 99999) {
                   System.out.println("O número digitado não possui cinco dígitos.");
              } else {
                 System.out.println("Dígitos separados por três espaços cada:");

                    while (contador < 5) {
                      int digito = numero / divisor;
                     System.out.print(digito + "   ");

                        numero %= divisor;
                        divisor /= 10;
                        contador++;
                   }
                }
            }
        }
    }
}
