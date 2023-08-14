import fabricas.SanduicheIngredientesFactory;
import fabricas.SanduicheIngredientesFactoryCG;
import fabricas.SanduicheIngredientesFactoryJP;
import fabricas.SanduicheIngredientesFactoryRT;
import sanduiches.Sanduiche;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crie as fábricas de ingredientes para cada tipo de sanduíche
        SanduicheIngredientesFactory fabricaCG = new SanduicheIngredientesFactoryCG();
        SanduicheIngredientesFactory fabricaJP = new SanduicheIngredientesFactoryJP();
        SanduicheIngredientesFactory fabricaRT = new SanduicheIngredientesFactoryRT();

        // Crie a lanchonete usando a fábrica de ingredientes específica
        Lanchonete lanchoneteCG = new Lanchonete(fabricaCG);
        Lanchonete lanchoneteJP = new Lanchonete(fabricaJP);
        Lanchonete lanchoneteRT = new Lanchonete(fabricaRT);

        // Monte e exiba os sanduíches
        Sanduiche sanduicheCG = lanchoneteCG.montarSanduiche("CG");
        sanduicheCG.montaSanduiche();
        System.out.println();

        Sanduiche sanduicheJP = lanchoneteJP.montarSanduiche("JP");
        sanduicheJP.montaSanduiche();
        System.out.println();

        Sanduiche sanduicheRT = lanchoneteRT.montarSanduiche("RT");
        sanduicheRT.montaSanduiche();
    }
}
