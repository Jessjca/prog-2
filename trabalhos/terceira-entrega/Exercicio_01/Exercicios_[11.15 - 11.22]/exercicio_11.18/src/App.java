import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        /*
        11.18 - (Capturando exceções com a classe Exception) Escreva um programa que demonstra como várias exceções são capturadas com 
        catch (Exception exception )
        */
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        try
        {
            for(int i=0; i<10; i++)
            {
                arr.add(i+1);
            }

            System.out.println(arr.get(0));
            System.out.println(arr.get(5));
            System.out.println(arr.get(9));
            System.out.println(arr.get(10));
        } catch(IndexOutOfBoundsException e)
        {
            System.out.println("ERRO! Tentativa de acessar um índice inválido: " + e.getMessage());
        }   
       

        System.out.println("============================");


        try
        {
            boolean valid = false;
            while(valid == false)
            {
                System.out.println("\nDigite o numerador: ");
                int value1 = sc.nextInt();  
                System.out.println("Digite o denominador: ");  
                int value2 = sc.nextInt();  
                
                double div = value1 / value2;
                System.out.println("Divisão de " + value1 + "/" + value2 + ": " + div);

                sc.nextLine();
                System.out.println("\nDeseja realizar mais divisões? (SIM ou NAO): ");
                String decision = sc.nextLine();
                if(decision.equalsIgnoreCase("sim"))
                {
                    valid = false;
                }
                if(decision.equalsIgnoreCase("nao"))
                {
                    valid = true;
                }
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("ERRO! Divisão inválida: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("ERRO DESCONHECIDO" + e.getMessage() + "\n");
            e.printStackTrace();
        }
           


        System.out.println("============================");


        try
        {
            ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Jorginho");
            nomes.add("Melissa");
            nomes.add("Miguel");
            nomes.add("Hadassa");
            nomes.add(null);


            System.out.println(nomes.get(0).length());
            System.out.println(nomes.get(3).length());
            System.out.println(nomes.get(4).length()); //NullPointerExcepetion

            System.out.println(nomes.get(0));
            System.out.println(nomes.get(3));
            System.out.println(nomes.get(5)); //IndexOutOfBoundsException
        }
        catch(NullPointerException e)
        {
            System.out.println("ERRO! Posição nula: " + e.getMessage());
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("ERRO! Tentativa de acessar uma posição inválida do array: " + e.getMessage());
        }


    }
}
