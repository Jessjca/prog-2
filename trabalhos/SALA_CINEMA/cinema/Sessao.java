package cinema;

public class Sessao {
    private int numeroSessao;

    public void setSessaoNum(int sessoes) {
        numeroSessao = sessoes;
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

    public int escolheSessao() {
        int i = 0;
        while (sessao[i] < numeroSessao) {
            sessao[i]++;
            if (sessao[i] == numeroSessao) {
                break;
            }
        }
        return sessao[i];
    }

    public void autentificaSessao() {
        if (numeroSessao > 5) {
            System.out.println("ATENÇÃO: Escolha uma sessão de 1 a 5!");
        }
    }
}
