public class Main {
    public static void main(String[] args) {
        GerenciadorImposto gerenciador = new GerenciadorImposto();

        // Criando objetos tributáveis
        Pessoa pessoa = new Pessoa("Jessica", 50000.0);

        // Adicionando os objetos tributáveis ao gerenciador
        gerenciador.adicionar(pessoa);

        // Obtendo o total de imposto calculado
        double totalImposto = gerenciador.getTotalImposto();
        System.out.println("Total de imposto calculado: " + totalImposto);
    }
}