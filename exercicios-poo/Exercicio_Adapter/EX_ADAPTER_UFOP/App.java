public class App {
    public static void main(String[] args) throws IllegalArgumentException {

        ConversorReal conversor  = new Dolar();
        AdapterClass total = new AdapterClass(conversor, "euro");

        System.out.println(total.Conversor(conversor.Conversor(10))); 
    }
}
