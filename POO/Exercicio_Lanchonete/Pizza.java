package Exercicio_Lanchonete;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String sabor;
    private double preco;
    Map<String, Pizza> saborset = new HashMap<>(); 

    public Pizza(String sabor, double preco){
        if(saborset.containsKey(sabor)){
            throw new IllegalArgumentException("sabor já cadastrado!");
        }
        else{
            this.preco=preco;
            this.sabor=sabor;
            saborset.put(sabor, this);
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String toString(){
        return "Sabor: "+getSabor()+ " preço: "+ getPreco();
    }
}