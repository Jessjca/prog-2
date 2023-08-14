package fabricas;
import ingredientes.*;
import pao.*;
import presunto.*;
import queijo.*;
import salada.*;

public class SanduicheIngredientesFactoryJP implements SanduicheIngredientesFactory
{
    @Override
    public Pao criaPao()
    {
        return new Frances();
    }

    @Override
    public Queijo criaQueijo()
    {
        return new Mussarela();
    }

    @Override
    public Presunto criaPresunto()
    {
        return new Frango();
    }

    @Override
    public Salada criaSalada()
    {
        return new ComVerdura();
    }
}
