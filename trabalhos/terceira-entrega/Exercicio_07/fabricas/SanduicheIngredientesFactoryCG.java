package fabricas;
import ingredientes.*;
import pao.*;
import presunto.*;
import queijo.*;
import salada.*;

public class SanduicheIngredientesFactoryCG implements SanduicheIngredientesFactory
{
    @Override
    public Pao criaPao()
    {
        return new Integral();
    }

    @Override
    public Queijo criaQueijo()
    {
        return new Prato();
    }

    @Override
    public Presunto criaPresunto()
    {
        return new Frango();
    }

    @Override
    public Salada criaSalada()
    {
        return new SemVerdura();
    }
}
