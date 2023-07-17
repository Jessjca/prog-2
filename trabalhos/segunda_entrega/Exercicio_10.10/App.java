public class App {
    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[3];

        employees[0] = new Pieceworker("John", "Doe", "123-45-6789", 2.5, 100);
        employees[1] = new SalariedEmployee("Jane", "Smith", "987-65-4321", 1000);
        employees[2] = new HourlyEmployee("Bob", "Johnson", "456-78-9123", 15.5, 40);

        // Itera sobre os funcionários e exibe suas representações em String e ganhos
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.printf("Earnings: $%.2f%n", employee.earnings());
            System.out.println();
        }
    }
}
