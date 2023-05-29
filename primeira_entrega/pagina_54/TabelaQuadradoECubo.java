public class TabelaQuadradoECubo {
    public static void main(String[] args) {
        System.out.println("Número\tQuadrado\tCubo");

        for (int numero = 0; numero <= 10; numero++) {
            int quadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + "\t\t" + quadrado + "\t\t" + cubo);
        }
    }
}
