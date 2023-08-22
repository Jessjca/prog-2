public class AdapterEuro implements Conversor{
    private Conversor conversor;
    private int i;

    public AdapterEuro(Conversor conversor, int i) {
        this.conversor = conversor;
        this.i = i;
    }

    @Override
    public double converterMoeda(double quantidade) {
        double total = conversor.converterMoeda(quantidade);

        switch(this.i) {
            case 1: 
                // Real para Euro
                return total * 5.22;
            case 2:
                //Dolar para Euro
                return total * 0.92;

            default: throw new IllegalArgumentException("Num tem essa moela");
        }
    }
}
