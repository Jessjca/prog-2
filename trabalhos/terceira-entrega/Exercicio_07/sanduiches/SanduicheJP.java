package sanduiches;

import fabricas.SanduicheIngredientesFactory;

public class SanduicheJP extends Sanduiche {
    public SanduicheJP(SanduicheIngredientesFactory fabrica) {
        super(fabrica);
    }

    @Override
    public void montaSanduiche() {
        System.out.println("Montando sanduíche JP:");
        pao.adicionaPao();
        queijo.adicionaQueijo();
        presunto.adicionaPresunto();
        salada.adicionaSalada();
    }
}