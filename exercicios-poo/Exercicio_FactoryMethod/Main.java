package Exercicio_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabricaCarros = new FabricaCarros();
        Veiculo carro = fabricaCarros.criarVeiculo();
        carro.mover();


        FabricaVeiculos fabricaMotos = new FabricaMotos();
        Veiculo moto = fabricaMotos.criarVeiculo();
        moto.mover();

    }
}
