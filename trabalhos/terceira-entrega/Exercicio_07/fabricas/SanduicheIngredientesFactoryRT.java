package fabricas;
import ingredientes.*;
import pao.*;
import presunto.*;
import queijo.*;
import salada.*;

public class SanduicheIngredientesFactoryRT implements SanduicheIngredientesFactory
{
    @Override
    public Pao criaPao()
    {
        return new Bola();
    }

    @Override
    public Queijo criaQueijo()
    {
        return new Cheddar();
    }

    @Override
    public Presunto criaPresunto()
    {
        return new Peru();
    }

    @Override
    public Salada criaSalada()
    {
        return new SemVerdura();
    }    
}