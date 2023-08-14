package sanduiches;

import fabricas.SanduicheIngredientesFactory;

public class SanduicheRT extends Sanduiche {
    public SanduicheRT(SanduicheIngredientesFactory fabrica) {
        super(fabrica);
    }

    @Override
    public void montaSanduiche() {
        System.out.println("Montando sanduíche RT:");
        pao.adicionaPao();
        queijo.adicionaQueijo();
        presunto.adicionaPresunto();
        salada.adicionaSalada();
    }
}
