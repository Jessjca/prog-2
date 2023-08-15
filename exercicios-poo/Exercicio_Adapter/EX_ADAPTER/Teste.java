package EX_ADAPTER;

public class Teste {
    public static void main(String[] args) {
        TomadaDeTresPinos tresPinos = new TomadaDeTresPinos();
        TomadaDeDoisPinos tomada = new AdapterTomada(tresPinos);
        
        tresPinos.ligarNaTomadaDeTresPinos();
        tomada.ligarNaTomadaDeDoisPinos();

    }
}
