public class Assento {
    private int numeroAssento;

    public void setAssentoQuantidade(int assento) {
        numeroAssento = assento;
    }

    public int getAssentoQuantidade() {
        return numeroAssento;
    }

    int[] assento = new int[6];
    {
        for (int i = 0; i < assento.length; i++) {
            assento[i] = i + 1;
        }

        for (int j = 0; j < assento.length; j++) {
            // System.out.println(assento[j]);
        }

        for (int k = 0; k < assento.length; k++) {

        }
    }

    public void escolheAssento() {
        int i = 0;

        while (assento[i] < numeroAssento) {
            assento[i]++;
            if (assento[i] == numeroAssento) {
                break;
            }
        }

        if (numeroAssento > 6) {
            System.out.println("ATENÇÃO: Escolha um assento de 1 a 6!");
        } else {
            System.out.println("Seu assento é o: " + assento[i]);

        }
    }
}