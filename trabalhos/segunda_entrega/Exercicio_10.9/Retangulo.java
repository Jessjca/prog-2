class Retangulo extends FormaBidimensional {
    double largura;
    double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double obterArea() {
        return largura * altura;
    }
}