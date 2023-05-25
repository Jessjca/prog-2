public class Employee {
    private String firstName;   // Primeiro nome do funcionário
    private String lastName;    // Sobrenome do funcionário
    private double monthlySalary;  // Salário mensal do funcionário

    // Construtor que inicializa as variáveis de instância
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);  // Chama o método setMonthlySalary para configurar o salário mensal
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

    // Método para configurar o salário mensal
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Método para recuperar o salário mensal
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Método para calcular o salário anual
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Método para aplicar um aumento de 10% no salário mensal
    public void applySalaryIncrease() {
        double increaseAmount = monthlySalary * 0.10;
        monthlySalary += increaseAmount;
    }
}
