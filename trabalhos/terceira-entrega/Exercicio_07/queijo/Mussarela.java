package queijo;

import ingredientes.Queijo;

public class Mussarela implements Queijo {
    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo Mussarela");
    }
}
