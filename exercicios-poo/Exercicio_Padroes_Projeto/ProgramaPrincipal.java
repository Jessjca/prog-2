package Exercicio_Padroes_Projeto;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        FabricaCarros fabrica = FabricaCarros.getInstancia();

        CarroFactory fabricaSedan = fabrica.criarFabricaCarro("sedan");
        CarroFactory fabricaSUV = fabrica.criarFabricaCarro("suv");

        CarroEletrico sedanEletrico = fabricaSedan.criarCarroEletrico();
        CarroEletrico suvEletrico = fabricaSUV.criarCarroEletrico();

        CarroCombustao sedanCombustao = fabricaSedan.criarCarroCombustao();
        CarroCombustao suvCombustao = fabricaSUV.criarCarroCombustao();

        sedanEletrico.carregar();
        suvEletrico.carregar();

        sedanCombustao.abastecer();
        suvCombustao.abastecer();

        CarroCarregavel adaptadorSedanEletrico = new AdaptadorCarroEletrico(sedanEletrico);
        adaptadorSedanEletrico.carregarCarro();
    }
}

