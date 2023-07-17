package Questao_02;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01; // 1% do saldo da conta corrente
    }
}
