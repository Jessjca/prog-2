public class SomeClass 
{
    public SomeClass() throws Exception
    {
        /*
        Quando um construtor lança uma exceção, as partes do código que estão criando uma instância da classe SomeClass 
        são obrigadas a lidar com essa possibilidade. Ao declarar throws Exception no construtor, você está informando que 
        qualquer código que chame o construtor precisa estar preparado para capturar ou retransmitir essa exceção.
        */
        try
        {
            throw new Exception("Erro no construtor da classe SomeClass()");
        }
        catch(Exception e)
        {
            throw new Exception("Erro que foi criado no construtor, foi capturado: " + e.getMessage());
        }
    }
}
