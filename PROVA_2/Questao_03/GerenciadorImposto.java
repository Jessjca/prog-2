public class GerenciadorImposto implements Tributavel {
    
    private double totalImposto;

    public GerenciadorImposto() {
        this.totalImposto = 0.0;
    }

    public void adicionar(Tributavel tributavel) {
        double imposto = tributavel.calcularTributo();
        this.totalImposto += imposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    @Override
    public double calcularTributo() {
        return totalImposto;
    }
}
