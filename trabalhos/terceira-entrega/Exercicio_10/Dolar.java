package Exercicio_10;

public class Dolar {
    private double quantidade;
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Dolar(double quantidade) throws IllegalAccessException{
        if(quantidade < 0) {
            throw new IllegalAccessException("O valor deve ser maior que zero!");
        } else {
            this.quantidade = quantidade;
        }
    }

    
}

