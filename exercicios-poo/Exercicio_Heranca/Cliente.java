package Exercicio_Heranca;

public class Cliente extends Pessoa{
    //Atributos
    private double valorDivida;
    private int anoNascimento;

    //Métodos especiais
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}
