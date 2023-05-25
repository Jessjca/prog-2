import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações da pessoa
        System.out.print("Digite o primeiro nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String lastName = scanner.nextLine();

        System.out.print("Digite o dia de nascimento: ");
        int birthDay = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int birthYear = scanner.nextInt();

        // Instancia um objeto HeartRates
        HeartRates heartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        // Imprime as informações da pessoa
        System.out.println("\nInformações da pessoa:");
        System.out.println("Nome: " + heartRates.getFirstName() + " " + heartRates.getLastName());
        System.out.println("Data de Nascimento: " + heartRates.getBirthDay() + "/" + heartRates.getBirthMonth() + "/" + heartRates.getBirthYear());

        // Calcula e imprime a idade da pessoa
        int age = heartRates.calculateAge();
        System.out.println("Idade: " + age + " anos");

        // Calcula e imprime o intervalo de frequência cardíaca máxima
        int maximumHeartRate = heartRates.calculateMaximumHeartRate();
        System.out.println("Frequência Cardíaca Máxima: " + maximumHeartRate + " bpm");

        // Calcula e imprime a frequência cardíaca-alvo
        String targetHeartRate = heartRates.calculateTargetHeartRate();
        System.out.println("Frequência Cardíaca-Alvo: " + targetHeartRate + " bpm");

        scanner.close();
    }
}