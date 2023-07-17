public class PessoaFisica implements Tributavel {
    private String nome;
    private double renda;

    public PessoaFisica(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    @Override
    public double calcularTributo() {
        return renda * 0.05;
    }
}