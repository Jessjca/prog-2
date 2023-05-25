public class CalculadoraCrescimentoDemografico {
    public static void main(String[] args) {
        // População mundial atual em bilhões
        double populacaoAtual = 7.888;

        // Taxa de crescimento demográfico anual em porcentagem
        double taxaCrescimentoAnual = 1.1;

        // Calcular a população estimada para os próximos 5 anos
        for (int i = 1; i <= 5; i++) {
            double populacaoEstimada = calcularPopulacaoEstimada(populacaoAtual, taxaCrescimentoAnual, i);
            System.out.printf("População estimada após %d ano(s): %.3f bilhões%n", i, populacaoEstimada);
        }
    }

    public static double calcularPopulacaoEstimada(double populacaoAtual, double taxaCrescimentoAnual, int anos) {
        double taxaCrescimentoDecimal = taxaCrescimentoAnual / 100.0;
        double populacaoEstimada = populacaoAtual;
        for (int i = 1; i <= anos; i++) {
            populacaoEstimada += populacaoEstimada * taxaCrescimentoDecimal;
        }
        return populacaoEstimada;
    }
}
