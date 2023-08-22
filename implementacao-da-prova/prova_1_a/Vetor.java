package prova_1_a;

public class Vetor {
    private String[] elementos;
    private int tamanhoAtual;

    public Vetor(int tamanhoInicial) {
        elementos = new String[tamanhoInicial];
        tamanhoAtual = 0;
    }

    private void expandirVetor() {
        int novoTamanho = elementos.length * 2;
        String[] novoVetor = new String[novoTamanho];

        for(int i = 0; i < tamanhoAtual; i++) {
            novoVetor[i] = elementos[i];
        }

        elementos = novoVetor;
    }

    public void insert(String valor) {
        if (tamanhoAtual >= elementos.length) {
            expandirVetor();
        }
    }
}
