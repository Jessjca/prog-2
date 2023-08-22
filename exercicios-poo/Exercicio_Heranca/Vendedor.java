package Exercicio_Heranca;

public class Vendedor extends Empregado{
    //Atributos
    private double valorVendas;
    private int qntVendas;

    //Métodos especiais
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public int getQntVendas() {
        return qntVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
}
