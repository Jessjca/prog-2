package EX04;

public class Main {
    public static void main(String[] args) {
        Objeto quadro = new Objeto("Quadrado");

        FormaGeometrica forma = quadro.getFormaGeometrica();
        forma.desenhar();

    }
}
