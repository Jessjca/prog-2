import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
        ArrayList<FormaBidimensional> formas = new ArrayList<>();

        Circulo c = new Circulo(4);
        Triangulo t = new Triangulo(4, 6);
        Quadrado q = new Quadrado(5);


        formas.add(c);
        formas.add(t);
        formas.add(q);

        for(int i = 0; i < formas.size(); i++){
            FormaBidimensional aux = formas.get(i);
            System.out.println("Forma " + aux.getClass());
            System.out.printf("Area: %.2f \n",  aux.calcularArea());
            System.out.println("Area: " + aux.calcularPerimetro());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    
    }
}
