package fabricas;

import ingredientes.Pao;
import ingredientes.Presunto;
import ingredientes.Queijo;
import ingredientes.Salada;

public interface SanduicheIngredientesFactory 
{
    Pao criaPao();
    Queijo criaQueijo();
    Presunto criaPresunto();
    Salada criaSalada();
}