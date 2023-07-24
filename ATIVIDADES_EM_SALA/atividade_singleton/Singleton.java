public class Singleton {
    public static void main(String[] args) {
        ImpressoraSingleton impressora = ImpressoraSingleton.getInstancia();
        System.out.println("Objeto 1: " + impressora);

        ImpressoraSingleton impressora2 = ImpressoraSingleton.getInstancia();
        System.out.println("Objeto 2: " + impressora2);
    }
}
