public class App 
{
    public static void main(String[] args) throws Exception 
    {
        try
        {
            SomeClass s1 = new SomeClass();
        }
        catch(Exception e)
        {
            System.out.println("Exceção capturada ao tentar instanciar: " + e.getMessage());
        }
    }
}
