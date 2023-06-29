public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return  Math.pow(lado, lado);
    }

    @Override
    public double calcularPerimetro() {
       return 4 * this.lado;
    }   

}
