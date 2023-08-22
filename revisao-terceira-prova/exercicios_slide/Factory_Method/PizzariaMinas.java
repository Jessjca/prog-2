package exercicios_slide.Factory_Method;

public class PizzariaMinas extends FabricaAbstrataDePizza{

    @Override
    public Pizza FactoryPizza(String sabor) {
        if(sabor.equals("PizzaCalabresa")) {
            return new PizzaCalabresa();
        } else if(sabor.equals("PizzaMussarela")) {
            return new PizzaMussarela();
        } else if(sabor.equals("PizzaQuatroQueijos")) {
            return new PizzaQuatroQueijos("Processo de fabricação de pizza quatro queijos mineira!");
        } else {
            return new Pizza(sabor);
        }
    }
}
