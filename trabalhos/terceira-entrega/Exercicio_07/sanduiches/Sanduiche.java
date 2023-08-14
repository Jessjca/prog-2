package sanduiches;

import fabricas.SanduicheIngredientesFactory;
import ingredientes.Pao;
import ingredientes.Presunto;
import ingredientes.Queijo;
import ingredientes.Salada;

public abstract class Sanduiche {
    Pao pao;
    Queijo queijo;
    Presunto presunto;
    Salada salada;

    public Sanduiche(SanduicheIngredientesFactory fabrica) {
        pao = fabrica.criaPao();
        queijo = fabrica.criaQueijo();
        presunto = fabrica.criaPresunto();
        salada = fabrica.criaSalada();
    }

    public abstract void montaSanduiche();
}
