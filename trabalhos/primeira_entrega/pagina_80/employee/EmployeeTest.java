public class EmployeeTest {
    public static void main(String[] args) {
        Employee funcionario1 = new Employee("John", "Doe", 5000);
        Employee funcionario2 = new Employee("Jane", "Smith", 6000);

        System.out.println("O salário anual do funcionário 1 é: " + funcionario1.getSalarioAnual());
        System.out.println("O salário anual do funcionário 2 é: " + funcionario2.getSalarioAnual());

        funcionario1.aplicaIncrementoSalarial();
        funcionario2.aplicaIncrementoSalarial();

        System.out.println("Salário anual do funcionario 1 depois do aumento: " + funcionario1.getSalarioAnual());
        System.out.println("Salário anual do funcionario 2 depois do aumento: " + funcionario2.getSalarioAnual());
    }
}
