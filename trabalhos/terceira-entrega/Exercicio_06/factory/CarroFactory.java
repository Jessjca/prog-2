package factory;

import interfaces.CarroPopular;
import interfaces.CarroSedan;

public abstract class CarroFactory {
    public abstract CarroSedan criarCarroSedan(String modelo);

    public abstract CarroPopular criarCarroPopular(String modelo);
}
