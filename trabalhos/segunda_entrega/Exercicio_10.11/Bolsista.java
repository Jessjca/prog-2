package Aula_10;

import java.util.Scanner;

public final class Bolsista extends Aluno {
    private boolean bolsa;
    private int valorBolsa;

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    public int getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(int valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public void ativarBolsa() {
        System.out.println("SUCESSO: O aluno detém uma bolsa");
        this.bolsa = true;
    }

    public void renovarBolsa() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor da bolsa: ");
            float valor = scanner.nextFloat();
            System.out.println("A bolsa de " + valor + " foi renovada para o próximo semestre");
        }
        this.bolsa = true;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. Pagamento facilitado.");
    }
}
