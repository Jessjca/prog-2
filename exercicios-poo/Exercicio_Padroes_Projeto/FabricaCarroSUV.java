package Exercicio_Padroes_Projeto;

public class FabricaCarroSUV implements CarroFactory {
    public CarroEletrico criarCarroEletrico() {
        return new SUVEletrico();
    }

    public CarroCombustao criarCarroCombustao() {
        return new SUVCombustao();
    }
}
