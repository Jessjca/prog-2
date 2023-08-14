import java.util.ArrayList;
import java.util.List;

public class Adapter implements SomadorEsperado {
    public SomadorExistente somaArray;

    public Adapter(SomadorExistente somaArray) {
        this.somaArray = somaArray;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor) // Adiciona os elementos do vetor para o Array, assim você faz uma adaptação.
        {
            lista.add(i);
        }
        return somaArray.somaLista(lista);
    }
}
