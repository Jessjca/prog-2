public class CalculadoraCrescimentoDemografico {
    public static void main(String[] args) {
        // População mundial atual em bilhões
        double populacao_Atual = 7.888;

        // Taxa de crescimento demográfico anual em porcentagem
        double taxa_CrescimentoAnual = 1.1;

        // Calcular a população estimada para os próximos 5 anos
        for (int i = 1; i <= 5; i++) {
            double populacaoEstimada = calcularPopulacaoEstimada(populacao_Atual, taxa_CrescimentoAnual, i);
            System.out.printf("População estimada depois %d ano(s): %.3f bilhões%n", i, populacaoEstimada);
        }
    }

    public static double calcularPopulacaoEstimada(double populacao_Atual, double taxa_CrescimentoAnual, int anos) {
        double taxa_CrescimentoDecimal = taxa_CrescimentoAnual / 100.0;
        double populacaoEstimada = populacao_Atual;
        for (int i = 1; i <= anos; i++) {
            populacaoEstimada += populacaoEstimada * taxa_CrescimentoDecimal;
        }
        return populacaoEstimada;
    }
}
