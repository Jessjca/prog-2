package EX04;

public class FormaGeometricaFactory {
    public static FormaGeometrica CriarForma(String forma) {
        if (forma == null)
        return null;
        if (forma.equalsIgnoreCase("Triangulo")) {
            return new Triangulo();
        } else if (forma.equalsIgnoreCase("Quadrado")) {
            return new Quadrado();
        } else if (forma.equalsIgnoreCase("Circulo")) {
            return new Circulo();
        }
        return null;
    }
}
