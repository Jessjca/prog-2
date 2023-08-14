package Exercicio_Lanchonete;
import java.util.HashSet;
import java.util.Set;

public class Lanche {
    private String sabor;
    private double preco;

    private static Set<String> saborset = new HashSet<>();

    public Lanche(String sabor, double preco) {
        if (saborset.contains(sabor)) {
            throw new IllegalArgumentException("Já tem esse sabor de lanche");
        }else {
            this.sabor = sabor;
            this.preco = preco;
            saborset.add(sabor);
        }
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Sabor: " + getSabor() + " Preço: " + getPreco();
    }
}
