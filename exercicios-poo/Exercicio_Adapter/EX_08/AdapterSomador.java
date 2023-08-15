package EX_08;
import java.util.*;

public class AdapterSomador implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public AdapterSomador(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor) { // Adiciona os elementos do vetor para o Array, assim você faz uma adaptação.
            lista.add(i);
        }
        return somadorExistente.somaLista(lista);
    }

}
