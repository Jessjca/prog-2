import java.util.Scanner;

public class QuadradoAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanhoLado = scanner.nextInt();

        if (tamanhoLado >= 1 && tamanhoLado <= 20) {
            for (int i = 1; i <= tamanhoLado; i++) {
                for (int j = 1; j <= tamanhoLado; j++) {
                    if (i == 1 || i == tamanhoLado || j == 1 || j == tamanhoLado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho do lado inválido. O tamanho deve estar entre 1 e 20.");
        }

        scanner.close();
    }
}
