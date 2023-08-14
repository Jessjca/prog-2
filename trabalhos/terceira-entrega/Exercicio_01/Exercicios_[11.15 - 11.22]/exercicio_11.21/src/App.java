public class App 
{
    public static void main(String[] args) throws Exception 
    {
        /* 
        Escreva um programa que ilustra o relançamento de uma exceção. Defina os métodos someMethod e someMethod2.0 método someMethod2 
        deve lançar inicialmente uma exceção. O método someMethod deve chamar someMethod2, capturar a exceção e relançá-la. 
        Chame someMethod a partir do método main e capture a exceção relançada. Imprima o rastreamento de pilha dessa exceção.
        */
        try
        {
            someMethod();
        }
        catch(Exception e)
        {
            System.out.println("Tratando a exceção lançada ao chamar someMethod(): " + e.getMessage());
            System.out.println("\n");
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception
    {
        try
        {
            someMethod2();
        }
        catch(Exception e)
        {
            System.out.println("Tratando a exceção lançada ao chamar someMethod2(): " + e.getMessage());
            throw e; // Relançando a exceção para ser tratada no bloco catch externo
        }
    }

    public static void someMethod2() throws Exception
    {
        throw new Exception("Exceção someMethod2");
        
    }

    /*
    Exceções verificadas (checked exception)
     * Quando você coloca throws Exception no cabeçalho de um método, está informando que este método pode lançar exceções do tipo 
     * Exception ou suas subclasses. Isso permite que o código que chama essa função saiba que precisa tratar ou propagar as exceções 
     * que essa função pode gerar.
     * 
     * 
     * O throw é usado para lançar uma exceção específica.
    */
}
