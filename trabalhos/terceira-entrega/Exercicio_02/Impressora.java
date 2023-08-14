package EX02;

public class Impressora {
    // Atributo privado estático que armazenará a única instância da classe
    private static Impressora instancia;

    private int quantidadePapel;

    // Construtor privado para evitar a criação de instâncias através do operador 'new'
    private Impressora() {
        // A impressora começa com um certo número de folhas de papel
        quantidadePapel = 10;
    }

    // Método público estático para acessar a instância única
    public static Impressora getInstancia() {
        if (instancia == null) {
            instancia = new Impressora();
        }
        return instancia;
    }

    public void imprimir(String documento) {
        if (quantidadePapel > 0) {
            System.out.println("Imprimindo: " + documento);
            quantidadePapel--;
        } else {
            System.out.println("Sem papel!");
        }
    }

    public int getQuantidadePapel() {
        return quantidadePapel;
    }
}
