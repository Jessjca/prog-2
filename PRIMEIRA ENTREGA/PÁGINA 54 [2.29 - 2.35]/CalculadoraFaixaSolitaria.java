import java.util.Scanner;

public class CalculadoraFaixaSolitaria {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler as informações do usuário
        System.out.print("Milhas totais dirigidas por dia: ");
        double milhasPorDia = scanner.nextDouble();

        System.out.print("Preço por galão de gasolina: ");
        double precoGasolina = scanner.nextDouble();

        System.out.print("Milhas médias por galão: ");
        double milhasPorGalao = scanner.nextDouble();

        System.out.print("Taxas de estacionamento por dia: ");
        double taxasEstacionamento = scanner.nextDouble();

        System.out.print("Pedágio por dia: ");
        double pedagio = scanner.nextDouble();

        // Calcular o custo diário de dirigir
        double custoDiario = calcularCustoDiario(milhasPorDia, precoGasolina, milhasPorGalao, taxasEstacionamento, pedagio);

        // Exibir o resultado
        System.out.println("O custo diário de dirigir é: R$" + custoDiario);

        // Fechar o Scanner
        scanner.close();
    }

    public static double calcularCustoDiario(double milhasPorDia, double precoGasolina, double milhasPorGalao, double taxasEstacionamento, double pedagio) {
        // Calcular o custo de gasolina por dia
        double galoesPorDia = milhasPorDia / milhasPorGalao;
        double custoGasolina = galoesPorDia * precoGasolina;

        // Calcular o custo total por dia
        double custoDiario = custoGasolina + taxasEstacionamento + pedagio;

        return custoDiario;
    }
}
