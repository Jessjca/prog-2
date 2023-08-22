package Exercicio_10;

public class DolarAdapter implements ConversorMoeda {
    public Dolar dolar;

    public DolarAdapter(Dolar dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converter(double quantidade) {
        return dolar.getQuantidade() * 4.85;
    }
}
