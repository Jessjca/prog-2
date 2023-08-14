package queijo;

import ingredientes.Queijo;

public class Cheddar implements Queijo {
    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo Cheddar");
    }
}
