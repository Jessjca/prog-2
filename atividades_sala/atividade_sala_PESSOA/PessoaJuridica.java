import javax.xml.transform.Source;

public class PessoaJuridica extends Pessoa{
    String cnpj;
    private double rendimento;

    PessoaJuridica(String cnpj, String nome, String endereco, String sexo, int idade) {
        super(nome, endereco, sexo, idade);
        this.cnpj = cnpj;
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void escreveNoConsole() {
        System.out.println("----------------------------");
        System.out.println("CNPJ: " + cnpj);
        super.escreveNoConsole();
    }

    @Override
    public void pagarImposto() {
        System.out.println("----------------------------");
        System.out.println("O rendimento anual da empresa é: " + rendimento);
        double imposto = this.rendimento * 0.10;
        System.out.println("A quantidade de imposto paga pela empresa é de: " + imposto);
    }
}
