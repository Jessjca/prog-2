import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        leIdade();
    }

    public static void leIdade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        
        while (true) {
            try {
                int idade = sc.nextInt();
                validaIdade(idade);
                break; // Sai do loop se a idade for válida
            } catch (InputMismatchException e) {
                System.out.println("ERRO! Valor não é um número inteiro. Tente novamente.");
                sc.nextLine(); // Limpa a entrada inválida do buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }
        }
    }

    public static void validaIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("ERRO! Idade Negativa!");
        } else if (idade != (int) idade) {
            throw new InputMismatchException("ERRO! Idade inválida!");
        }
    }
}
