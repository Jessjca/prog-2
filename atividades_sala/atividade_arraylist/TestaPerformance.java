import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        Collection<Integer> teste = new HashSet<>();

        int total = 30000;

        // Medição de tempo para a inserção dos elementos
        long inicioInsercao = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fimInsercao = System.currentTimeMillis();
        long tempoInsercao = fimInsercao - inicioInsercao;

        // Medição de tempo para a busca dos elementos
        long inicioBusca = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fimBusca = System.currentTimeMillis();
        long tempoBusca = fimBusca - inicioBusca;

        System.out.println("Tempo gasto na inserção: " + tempoInsercao + " milissegundos");
        System.out.println("Tempo gasto na busca: " + tempoBusca + " milissegundos");
    }
}
