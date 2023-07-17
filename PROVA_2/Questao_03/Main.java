public class Main {
    public static void main(String[] args) {
        GerenciadorImposto gerenciador = new GerenciadorImposto();

        // Criando objetos tributáveis
        PessoaFisica pessoaFisica = new PessoaFisica("Jessica", 50000.0);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa UFOP", 100000.0);

        // Adicionando os objetos tributáveis ao gerenciador
        gerenciador.adicionar(pessoaFisica);
        gerenciador.adicionar(pessoaJuridica);

        // Obtendo o total de imposto calculado
        double totalImposto = gerenciador.getTotalImposto();
        System.out.println("Total de imposto calculado: " + totalImposto);
    }
}