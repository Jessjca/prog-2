package Exercicio_FactoryMethod;

public class FabricaMotos implements FabricaVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
