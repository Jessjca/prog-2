public class Sessao {
    private int numeroSessao;

    public void setSessaoNum(int sessoes) {
        numeroSessao = sessoes;
    }

    public int getSessaoNum() {
        return numeroSessao;
    }

    int[] sessao = new int[5];
    {
        for (int i = 0; i < sessao.length; i++) {
            sessao[i] = i + 1;
        }

        for (int j = 0; j < sessao.length; j++) {
            // System.out.println(sessao[j]);
        }

        for (int k = 0; k < sessao.length; k++) {

        }
    }

    public void escolheSessao() {
        int i = 0;

        while (sessao[i] < numeroSessao) {
            sessao[i]++;
            if (sessao[i] == numeroSessao) {
                break;
            }
        }

        if (numeroSessao > 5) {
            System.out.println("ATENÇÃO: Escolha uma sessão de 1 a 5!");
        } else {
            System.out.println("Sua sessão é a: " + sessao[i]);
        }
    }
}
