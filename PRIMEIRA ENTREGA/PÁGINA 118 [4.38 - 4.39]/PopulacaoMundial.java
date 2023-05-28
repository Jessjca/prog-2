public class PopulacaoMundial {
    public static void main(String[] args) {
        int currentYear = 2023;
        long currentPopulation = 7800000000L; // Exemplo de população atual (2023)
        double growthRate = 1.05; // Exemplo de taxa de crescimento anual de 5%

        System.out.println("Ano\tPopulação\tAumento Numérico");

        for (int year = 1; year <= 75; year++) {
            long population = (long) (currentPopulation * Math.pow(growthRate, year));
            long populationIncrease = population - currentPopulation;

            System.out.println(year + "\t" + population + "\t" + populationIncrease);
        }

        // Cálculo do ano em que a população dobraria ao que é hoje
        long doubledPopulation = currentPopulation * 2;
        int yearsToDouble = 0;

        while (currentPopulation < doubledPopulation) {
            currentPopulation *= growthRate;
            yearsToDouble++;
        }

        int yearToDouble = currentYear + yearsToDouble;

        System.out.println("\nAno em que a população dobraria ao que é hoje: " + yearToDouble);
    }
}
