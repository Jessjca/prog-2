package EX_09;

public class Main {
    public static void main(String[] args) {
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF adaptador = new AdapterTemperatura(medidorFarenheit);

        System.out.println("Temperatura em Celsius > " + adaptador.medirTemperatura());

    }

}
