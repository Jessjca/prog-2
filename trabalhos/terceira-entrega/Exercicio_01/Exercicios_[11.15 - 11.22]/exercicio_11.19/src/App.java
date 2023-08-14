public class App 
{
    public static void main(String[] args) throws Exception {
        try {
            try {
                int[] numbers = { 1, 2, 3 };
                System.out.println(numbers[4]);
            } catch (Exception e) {
                System.out.println("Exceção genérica: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exceção específica: " + e.getMessage());
            }
        } catch (Exception a) {
            System.out.println("ERRO! Subclasse (ArrayIndexOutOfBoundsException) definida depois da Superclasse (Exception): " + a.getMessage());
            a.printStackTrace();
        }
    }

    
        //A exceção genérica não pode vir primeiro que a exceção específica
        /*
            A exceção genérica(Exception) é uma superclasse e não faz sentido colocá-la e logo em seguida colocar uma 
            exceção expecífica(ArrayIndexOutOfBounds) que é uma sublaclasse. 
            Isso porque, a superclasse já captura todos os tipos de exceções.
        */
    
}
