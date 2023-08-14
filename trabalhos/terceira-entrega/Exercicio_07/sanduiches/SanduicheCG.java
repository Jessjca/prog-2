package sanduiches;

import fabricas.SanduicheIngredientesFactory;

public class SanduicheCG extends Sanduiche {
    public SanduicheCG(SanduicheIngredientesFactory fabrica) {
        super(fabrica);
    }

    @Override
    public void montaSanduiche() {
        System.out.println("Montando sanduíche CG:");
        pao.adicionaPao();
        queijo.adicionaQueijo();
        presunto.adicionaPresunto();
        salada.adicionaSalada();
    }
}
