public class Main {
    public static void main(String[] args) throws Exception {
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF adaptador = new Adapter(medidorFarenheit);

        System.out.println("Temperatura em Celsius > " + adaptador.medirTemperatura());
    }
}
