package exercicios_slide.Factory_Method;

public class PizzaQuatroQueijos extends Pizza{
    
    private String processoDeFabricacao;

    protected PizzaQuatroQueijos(String processoDeFabricacao) {
        super("Pizza Quatro Queijos");
        this.processoDeFabricacao = processoDeFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Processo de fabricação: " + this.processoDeFabricacao;
    }
}
