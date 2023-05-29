import java.util.Scanner;

public class ValorInteiroCaractere {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
                System.out.printf("O caractere %c tem o valor %d\n", 'A', (int) 'A');
                System.out.printf("O caractere %c tem o valor %d\n", 'B', (int) 'B');
                System.out.printf("O caractere %c tem o valor %d\n", 'C', (int) 'C');
                System.out.printf("O caractere %c tem o valor %d\n", 'a', (int) 'a');
                System.out.printf("O caractere %c tem o valor %d\n", 'b', (int) 'b');
                System.out.printf("O caractere %c tem o valor %d\n", 'c', (int) 'c');
                System.out.printf("O caractere %c tem o valor %d\n", '0', (int) '0');
                System.out.printf("O caractere %c tem o valor %d\n", 'i', (int) 'i');
                System.out.printf("O caractere %c tem o valor %d\n", '2', (int) '2');
                System.out.printf("O caractere %c tem o valor %d\n", 'S', (int) 'S');
                System.out.printf("O caractere %c tem o valor %d\n", '*', (int) '*');
                System.out.printf("O caractere %c tem o valor %d\n", '+', (int) '+');
                System.out.printf("O caractere %c tem o valor %d\n", '/', (int) '/');
                System.out.printf("O caractere %c tem o valor %d\n", ' ', (int) ' ');
        }
    }
}
