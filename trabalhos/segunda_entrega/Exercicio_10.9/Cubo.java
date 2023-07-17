class Cubo extends FormaTridimensional {
    double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    double obterArea() {
        return 6 * lado * lado;
    }

    double obterVolume() {
        return lado * lado * lado;
    }
}
