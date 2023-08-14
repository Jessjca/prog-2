public class ExceptionA extends Exception //ExceptionA vira subclasse de Exception para criar minha própria hierarquia de exceções.
{
    //Podemos considerar que ExceptionA irá virar uma SUPERCLASSE para as outras exceções que vão ser inseridas nesta hierarquia.
    public ExceptionA(String msg)
    {
        super(msg);
    }
}
