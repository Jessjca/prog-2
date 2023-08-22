public class AdapterClass implements ConversorReal {
    private ConversorReal conversorReal;
    private String nomeMoeda;
    

    public AdapterClass(ConversorReal conversorReal, String nomeMoeda){
        this.conversorReal = conversorReal;
        this.nomeMoeda = nomeMoeda;
    }

    @Override
    public double Conversor(double quantidade){
        if(nomeMoeda.equalsIgnoreCase("dolar")){
            double total = conversorReal.Conversor(quantidade);
            total = quantidade * 4.87;
            return total;
        }
        else if(nomeMoeda.equalsIgnoreCase("euro")){
            double total = conversorReal.Conversor(quantidade);
            total = quantidade * 5.44;
            return total;
        }
        else{
            throw new IllegalArgumentException("Num tem essa moeda ainda");
        }
        
        
    }
}
