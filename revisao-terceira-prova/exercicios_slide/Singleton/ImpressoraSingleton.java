package exercicios_slide.Singleton;

public class ImpressoraSingleton {
    private static ImpressoraSingleton instancia = null;

    private ImpressoraSingleton() {

    }

    public static ImpressoraSingleton GetInstancia() {
        if (instancia == null) {
            instancia = new ImpressoraSingleton();
        }
        return instancia;
    }

    public void imprimir(String relatorio) {
        System.out.println(relatorio);
    }
}
