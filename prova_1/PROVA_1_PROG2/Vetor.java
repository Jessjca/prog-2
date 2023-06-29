public class Vetor {
    private int[] vetor;

    public Vetor() {
        vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 11;
        vetor[2] = 12;
        vetor[3] = 13;
        vetor[4] = 14;
        vetor[5] = 15;

        if(vetor.length > vetor.length) {
            vetor = new int[vetor.length + 1];
        }
    }

    public void exibirVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        Vetor v = new Vetor();
        v.exibirVetor();
    }
}
