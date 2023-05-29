package populacaoMundial;

public class CrescimentoDemografico {

    private long populacaoAtual = 7900000000L;
    private double taxaCrescimentoAnual = 1.05;
    private int anoAtual = 2023;

    long populacaoAtualizada;
    long aumentoNumerico;

    public void crescimentoDemo() {
        System.out.println("Ano\tPopulaçao\tAumento Numérico");

        for (int i = 1; i <= 75; i++) {
            anoAtual = anoAtual + 1;

            populacaoAtualizada = (long) (populacaoAtual * Math.pow(taxaCrescimentoAnual, i));

            aumentoNumerico = populacaoAtualizada - populacaoAtual;

            System.out.println(anoAtual + "\t" + populacaoAtualizada + "\t" + aumentoNumerico);
        }

    }

    public void populacaoDobrada() {
        // Cálculo do ano em que a população dobraria ao que é hoje
        long populacaoDobrada = populacaoAtual * 2;
        int anosParaDobrar = 0;
        int ano = 2023;

        while (populacaoAtual < populacaoDobrada) {
            populacaoAtual *= taxaCrescimentoAnual;
            anosParaDobrar++;
        }

        int anoDobrar = ano + anosParaDobrar;

        System.out.println("\nAno em que a população dobraria: " + anoDobrar);
        System.out.println("\n ");
    }
}