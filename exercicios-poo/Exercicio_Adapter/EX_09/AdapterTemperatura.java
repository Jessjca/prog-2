package EX_09;

public class AdapterTemperatura implements MedidorCelsiusIF{
    private MedidorFarenheit medidorFarenheit;

    public AdapterTemperatura(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        return (medidorFarenheit.getTemperaturaFarenheit() - 32)/1.8;
    }
}
