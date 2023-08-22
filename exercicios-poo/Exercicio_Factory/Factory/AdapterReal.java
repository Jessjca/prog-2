public class AdapterReal implements Conversor {
    private Conversor conversor;
    private int i;

    public AdapterReal(Conversor conversor, int i){
        this.conversor =  conversor;
        this.i = i;
    }

    public double converterMoeda(double quantidade){
        double total = conversor.converterMoeda(quantidade);
       
        switch(this.i){
            case 1:
                //Dolar para Real
                return total / 4.89;

            case 2:
                //Euro para Real
                return total / 5.22;
            
            default:
                throw new IllegalArgumentException("Num tem");
            }
            

    }

}
