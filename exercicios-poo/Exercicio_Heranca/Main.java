package Exercicio_Heranca;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();
        Cliente c = new Cliente();

        g.setNome("Jessica");
        g.setIdade(23);

        System.out.println(g.getNome());

    }
}
