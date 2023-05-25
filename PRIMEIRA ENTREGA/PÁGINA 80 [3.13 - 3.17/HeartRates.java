import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;   // Primeiro nome
    private String lastName;    // Sobrenome
    private int birthDay;       // Dia de nascimento
    private int birthMonth;     // Mês de nascimento
    private int birthYear;      // Ano de nascimento

    // Construtor que inicializa os atributos
    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    // Método para configurar o primeiro nome
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Método para recuperar o primeiro nome
    public String getFirstName() {
        return firstName;
    }

    // Método para configurar o sobrenome
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Método para recuperar o sobrenome
    public String getLastName() {
        return lastName;
    }

    // Método para configurar o dia de nascimento
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    // Método para recuperar o dia de nascimento
    public int getBirthDay() {
        return birthDay;
    }

    // Método para configurar o mês de nascimento
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    // Método para recuperar o mês de nascimento
    public int getBirthMonth() {
        return birthMonth;
    }

    // Método para configurar o ano de nascimento
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Método para recuperar o ano de nascimento
    public int getBirthYear() {
        return birthYear;
    }

    // Método para calcular e retornar a idade da pessoa (em anos)
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    }

    // Método para calcular e retornar a frequência cardíaca máxima da pessoa
    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    // Método para calcular e retornar a frequência cardíaca-alvo da pessoa
    public String calculateTargetHeartRate() {
        int maximumHeartRate = calculateMaximumHeartRate();
        double lowerBound = maximumHeartRate * 0.5;
        double upperBound = maximumHeartRate * 0.85;
        return lowerBound + " - " + upperBound;
    }
}
