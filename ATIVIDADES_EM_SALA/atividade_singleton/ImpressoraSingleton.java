public class ImpressoraSingleton {

    private static ImpressoraSingleton instancia = null;
    
    private ImpressoraSingleton() {
        // Construtor privado vazio
    }

    public static ImpressoraSingleton getInstancia() {
        if(instancia == null) {
            instancia = new ImpressoraSingleton();
        }

        return instancia;
    }

    public void Imprimir(String relatorio) {
        System.out.println(relatorio);
    }
}
