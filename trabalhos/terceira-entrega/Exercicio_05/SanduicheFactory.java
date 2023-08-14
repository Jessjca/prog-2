public class SanduicheFactory {

    public static Sanduiche getSanduiche(String tipo) throws NullPointerException {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("CG")) {
            return new LanchoneteCG();
        }
        if (tipo.equalsIgnoreCase("JP")) {
            return new LanchoneteJP();
        }
        if (tipo.equalsIgnoreCase("RT")) {
            return new LanchoneteRT();
        }
        return null;
    }
}
