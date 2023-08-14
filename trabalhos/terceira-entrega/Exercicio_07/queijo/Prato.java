package queijo;

import ingredientes.Queijo;

public class Prato implements Queijo {
    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo Prato");
    }
}
