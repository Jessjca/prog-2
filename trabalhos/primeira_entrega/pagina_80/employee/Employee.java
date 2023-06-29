public class Employee {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Employee(String primeiroNome, String ultimoNome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        setSalarioMensal(salarioMensal);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0;
        }
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public void aplicaIncrementoSalarial() {
        double valorIncremento = salarioMensal * 0.10;
        salarioMensal += valorIncremento;
    }
}
