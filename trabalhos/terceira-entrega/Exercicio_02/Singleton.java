package EX02;

public class Singleton {
    // Atributo privado estático que armazenará a única instância da classe
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias através do operador 'new'
    private Singleton() {
        // Inicializações, se necessário
    }

    // Método público estático para acessar a instância única
    public static Singleton getInstance() {
        // Se a instância ainda não foi criada, cria-a
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Outros métodos da classe
}
