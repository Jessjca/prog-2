import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int tamanhoAtual = 0;
        boolean coletaAtiva = true;

        Scanner scanner = new Scanner(System.in);

        while (coletaAtiva && tamanhoAtual < 10) {
            try {
                System.out.print("Digite um valor inteiro (ou 0 para parar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    vetor[tamanhoAtual] = valor;
                    coletaAtiva = false;
                } else {
                    vetor[tamanhoAtual] = valor;
                    tamanhoAtual++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor inteiro válido!");
                scanner.nextLine(); // Limpa o buffer após o erro de leitura
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Você excedeu o tamanho máximo do vetor (10 elementos).");
                coletaAtiva = false;
            }
        }

        System.out.println("Valores digitados:");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
