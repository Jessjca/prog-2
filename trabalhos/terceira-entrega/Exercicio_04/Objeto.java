package EX04;

public class Objeto {

    private FormaGeometrica forma;

    public Objeto (String forma) {
        this.forma = FormaGeometricaFactory.CriarForma(forma);
    }

    public FormaGeometrica getFormaGeometrica() {
        return this.forma;
    }
}
