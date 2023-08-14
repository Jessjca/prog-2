package salada;

import ingredientes.Salada;

public class SemVerdura implements Salada {
    @Override
    public void adicionaSalada() {
        System.out.println("Sem Verdura");
    }
}
