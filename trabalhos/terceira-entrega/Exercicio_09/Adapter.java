public class Adapter implements MedidorCelsiusIF {
    
    public MedidorFarenheit medidor;

    public Adapter(MedidorFarenheit medidor) {
        this.medidor = medidor;
    }

    @Override
    public double medirTemperatura() {
        return (medidor.getTemperaturaFarenheint() - 32) / 1.8;
    }
}
