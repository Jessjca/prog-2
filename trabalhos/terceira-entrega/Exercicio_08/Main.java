public class Main {
    public static void main(String[] args) throws Exception {
        SomadorEsperado somadorEsperado = (SomadorEsperado) new Adapter(new SomadorExistente());

        Cliente cliente = new Cliente(somadorEsperado);
        cliente.executar();
    }
}
