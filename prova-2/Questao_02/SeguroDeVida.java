package Questao_02;

public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42; // Taxa fixa de R$ 42 para o seguro de vida
    }
    
}
