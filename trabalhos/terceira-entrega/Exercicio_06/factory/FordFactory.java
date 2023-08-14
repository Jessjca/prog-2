package factory;

import interfaces.CarroPopular;
import interfaces.CarroSedan;
import popular.Fiesta;
import sedan.FiestaSedan;

public class FordFactory extends CarroFactory {
    @Override
    public CarroSedan criarCarroSedan(String modelo) {
        if (modelo == null) {
            return null;
        }
        if (modelo.equalsIgnoreCase("Fiesta Sedan")) {
            return new FiestaSedan();
        }
        return null;
    }

    @Override
    public CarroPopular criarCarroPopular(String modelo) {
        if (modelo == null) {
            return null;
        }
        if (modelo.equalsIgnoreCase("Fiesta")) {
            return new Fiesta();
        }
        return null;
    }
}
