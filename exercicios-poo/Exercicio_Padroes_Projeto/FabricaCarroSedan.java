package Exercicio_Padroes_Projeto;

public class FabricaCarroSedan implements CarroFactory {
    public CarroEletrico criarCarroEletrico() {
        return new SedanEletrico();
    }

    public CarroCombustao criarCarroCombustao() {
        return new SedanCombustao();
    }
}
