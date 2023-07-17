public class App {
    public static void main(String[] args) throws Exception {
       Forma[] formas = new Forma[4];
        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(3, 4);
        formas[2] = new Esfera(2);
        formas[3] = new Cubo(3);

        for (Forma forma : formas) {
            if (forma instanceof FormaBidimensional) {
                System.out.println("Forma bidimensional: " + forma.getClass().getSimpleName());
                System.out.println("Área: " + forma.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Forma tridimensional: " + forma.getClass().getSimpleName());
                System.out.println("Área: " + forma.obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println();
        }
    }
}
