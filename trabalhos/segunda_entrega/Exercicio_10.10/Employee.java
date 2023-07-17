public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Construtor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter e Setter para firstName, lastName e socialSecurityNumber

    // Método abstrato para calcular os ganhos
    public abstract double earnings();

    // Retorna a representação em String do funcionário
    @Override
    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s", firstName, lastName, socialSecurityNumber);
    }
}
