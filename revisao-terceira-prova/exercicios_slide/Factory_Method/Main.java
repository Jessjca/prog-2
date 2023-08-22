package exercicios_slide.Factory_Method;

public class Main {
    public static void main(String[] args) {
        
        FabricaAbstrataDePizza pizzaria = new PizzariaItaliana();
        Pizza minhaPizza = pizzaria.FactoryPizza("Qualquer");
        System.out.println(minhaPizza);
    }
}
