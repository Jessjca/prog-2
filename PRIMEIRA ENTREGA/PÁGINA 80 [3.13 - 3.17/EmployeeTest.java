public class EmployeeTest {
    public static void main(String[] args) {
        // Criação de dois objetos Employee
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Smith", 6000);

        // Exibição do salário anual inicial de cada funcionário
        System.out.println("Salário Anual do Funcionário 1: " + employee1.getAnnualSalary());
        System.out.println("Salário Anual do Funcionário 2: " + employee2.getAnnualSalary());

        // Aplicação de aumento de 10% no salário de cada funcionário
        employee1.applySalaryIncrease();
        employee2.applySalaryIncrease();

        // Exibição do salário anual após o aumento
        System.out.println("Salário Anual do Funcionário 1 após o aumento: " + employee1.getAnnualSalary());
        System.out.println("Salário Anual do Funcionário 2 após o aumento: " + employee2.getAnnualSalary());
    }
}
