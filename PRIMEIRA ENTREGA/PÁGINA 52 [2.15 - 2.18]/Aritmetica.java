import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int produto = numero1 * numero2;
        int diferenca = numero1 - numero2;
        int quociente = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Quociente: " + quociente);

        scanner.close();
    }
}
// Este programa utiliza a classe Scanner para obter as entradas do usuário 
// e realiza as operações necessárias para calcular a soma, produto, diferença e quociente dos números informados. 
// Em seguida, imprime os resultados na tela.






