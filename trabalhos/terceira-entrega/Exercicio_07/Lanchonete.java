import fabricas.SanduicheIngredientesFactory;
import sanduiches.Sanduiche;
import sanduiches.SanduicheCG;
import sanduiches.SanduicheJP;
import sanduiches.SanduicheRT;

public class Lanchonete {
    private SanduicheIngredientesFactory fabrica;

    public Lanchonete(SanduicheIngredientesFactory fabrica) {
        this.fabrica = fabrica;
    }

    public Sanduiche montarSanduiche(String tipo) {
        if (tipo.equalsIgnoreCase("CG")) {
            return new SanduicheCG(fabrica);
        } else if (tipo.equalsIgnoreCase("JP")) {
            return new SanduicheJP(fabrica);
        } else if (tipo.equalsIgnoreCase("RT")) {
            return new SanduicheRT(fabrica);
        }
        return null; // ou lançar uma exceção se o tipo for inválido
    }
}
