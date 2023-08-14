package factory;

import interfaces.CarroPopular;
import interfaces.CarroSedan;
import popular.Palio;
import sedan.Siena;

public class FiatFactory extends CarroFactory {
    @Override
    public CarroPopular criarCarroPopular(String modelo) {
        if (modelo == null) {
            return null;
        }
        if (modelo.equalsIgnoreCase("Palio")) {
            return new Palio();
        }
        return null;
    }

    @Override
    public CarroSedan criarCarroSedan(String modelo) {
        if (modelo == null) {
            return null;
        }
        if (modelo.equalsIgnoreCase("Siena")) {
            return new Siena();
        }
        return null;
    }
}
