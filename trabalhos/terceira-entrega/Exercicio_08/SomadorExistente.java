import java.util.List;

public class SomadorExistente {
    public int somaLista(List<Integer> lista) {
        int resultado = 0;
        for (int i : lista) {
            resultado += i;
        }
        return resultado;
    }
}
