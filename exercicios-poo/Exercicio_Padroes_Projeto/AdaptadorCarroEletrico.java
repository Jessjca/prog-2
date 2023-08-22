package Exercicio_Padroes_Projeto;

public class AdaptadorCarroEletrico implements CarroCarregavel {
    private CarroEletrico carroEletrico;

    public AdaptadorCarroEletrico(CarroEletrico carroEletrico) {
        this.carroEletrico = carroEletrico;
    }

    public void carregarCarro() {
        carroEletrico.carregar();
    }
}
