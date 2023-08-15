package EX_08;
import java.util.*;

public class SomadorExistente {
    public int somaLista(List<Integer> lista) {
        int resultado = 0;
        for (int i : lista) resultado += i;
        return resultado;
    }
}
