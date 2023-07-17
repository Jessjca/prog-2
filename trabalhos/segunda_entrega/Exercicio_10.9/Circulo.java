class Circulo extends FormaBidimensional {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double obterArea() {
        return Math.PI * raio * raio;
    }
}