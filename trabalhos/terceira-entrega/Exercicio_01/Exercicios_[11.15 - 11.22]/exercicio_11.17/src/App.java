public class App 
{
    public static void main(String[] args) throws Exception 
    {
        try
        {
            throw new ExceptionB("Lançando exceção do Tipo B");
        }
        catch(ExceptionA e)
        {
            System.out.println("Exceção do tipo B tratatada com a exceção do Tipo A: " + e.getMessage()); 
            e.printStackTrace();
            System.out.println("\n\n");
            //TRATANDO A EXCEÇÃO COM A SUPERCLASSE, QUE É A EXCEÇÃO GENERALIZADA :D
        }

        try 
        {
            throw new ExceptionC("Lançando exceção do Tipo C");
        } 
        catch (ExceptionA e) 
        {
            System.out.println("Exceção do tipo C tratada com a exceção do Tipo A: " + e.getMessage());
            e.printStackTrace();
            //TRATANDO A EXCEÇÃO COM A SUPERCLASSE, QUE É A EXCEÇÃO GENERALIZADA :D
        }
    }
}
