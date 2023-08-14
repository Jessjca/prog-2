package EX02;

public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Verifica se as duas instâncias são iguais
        System.out.println("Instância 1 é igual à Instância 2: " + (singletonInstance1 == singletonInstance2));
    }
}
