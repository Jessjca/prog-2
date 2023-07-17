public class PessoaJuridica implements Tributavel {

    private String nome;
    private double faturamento;

    public PessoaJuridica(String nome, double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public double getFaturamento() {
        return faturamento;
    }

    @Override
    public double calcularTributo() {
        return faturamento * 0.1;
    }
}