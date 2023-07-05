public class PessoaFisica extends Pessoa {
    String cpf;
    private double salario;

    PessoaFisica(String cpf, String nome, String endereco, String sexo, int idade) {
        super( nome, sexo, endereco, idade);
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void escreveNoConsole() {
        System.out.println("----------------------------");
        System.out.println("CPF: " + cpf);
        super.escreveNoConsole();
    }

    @Override
    public void pagarImposto() {
        System.out.println("----------------------------");
        System.out.println("O salário anual da pessoa é: " + salario);
        double imposto = this.salario * 0.07;
        System.out.println("A quantidade de imposto paga pela pessoa é de: " + imposto);
    }
}
