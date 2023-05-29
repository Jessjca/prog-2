import java.util.Scanner;

public class QuadradoAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tam_lado = scanner.nextInt();

        if (tam_lado >= 1 && tam_lado <= 20) {
            for (int i = 1; i <= tam_lado; i++) {
                for (int j = 1; j <= tam_lado; j++) {
                    if (i == 1 || i == tam_lado || j == 1 || j == tam_lado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("O tamanho do lado é inválido. O tamanho deve estar entre 1 e 20.");
        }

        scanner.close();
    }
}
