package exercicios_slide.Singleton;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        System.out.println("Objeto 1: " + impressora);

        Impressora impressora2 = new Impressora();
        System.out.println("Objeto 2: " + impressora2);

        ImpressoraSingleton impressora3 = ImpressoraSingleton.GetInstancia();
        System.out.println("Objeto 3: " + impressora3);

        ImpressoraSingleton impressora4 = ImpressoraSingleton.GetInstancia();
        System.out.println("Objeto 4: " + impressora4);
    }
}
