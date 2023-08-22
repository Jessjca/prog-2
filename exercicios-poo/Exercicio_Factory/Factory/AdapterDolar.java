public class AdapterDolar implements Conversor
{
    private Conversor conversor;
    private int i;

    public AdapterDolar(Conversor c, int i)
    {
        this.conversor = c;
        this.i = i;
    }

    @Override
    public double converterMoeda(double quantidade)
    {
        double total = conversor.converterMoeda(quantidade);
        switch(this.i)
        {
            case 1:
                // Real para Dolar
                return total * 4.89;
            case 2:
                // Euro para Dolar
                return total / 0.92;
            default:
                throw new IllegalArgumentException("Não existe conversão para essa muela.");
        }
    }
}
