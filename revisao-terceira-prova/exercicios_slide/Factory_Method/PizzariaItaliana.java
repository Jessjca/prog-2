package exercicios_slide.Factory_Method;

public class PizzariaItaliana extends FabricaAbstrataDePizza {

    @Override
    public Pizza FactoryPizza(String sabor) {
        if(sabor.equals("PizzaCalabresa")) {
            return new PizzaCalabresa();
        } else if(sabor.equals("PizzaMussarela")) {
            return new PizzaMussarela();
        } else if(sabor.equals("PizzaQuatroQueijos")) {
            return new PizzaQuatroQueijos("Processo de fabricação da pizzaria italiana");
        } else {
            return new Pizza(sabor);
        }
    }
}
