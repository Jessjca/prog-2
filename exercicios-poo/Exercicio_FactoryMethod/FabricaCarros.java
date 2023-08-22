package Exercicio_FactoryMethod;

public class FabricaCarros implements FabricaVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
