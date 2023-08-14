public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Sanduiche sanduicheCG = SanduicheFactory.getSanduiche("CG");
            sanduicheCG.montaSanduiche();
            System.out.println();

            Sanduiche sanduicheJP = SanduicheFactory.getSanduiche("JP");
            sanduicheJP.montaSanduiche();
            System.out.println();

            Sanduiche sanduicheRT = SanduicheFactory.getSanduiche("RT");
            sanduicheRT.montaSanduiche();

            Sanduiche sanduicheBB = SanduicheFactory.getSanduiche("BB");
            sanduicheBB.montaSanduiche();
        } catch (NullPointerException e) {
            System.out.println("ERRO! Não foi possível montar este sanduíche: " + e.getMessage());
        }
    }
}
