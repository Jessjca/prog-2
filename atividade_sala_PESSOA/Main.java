public class Main {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(null, null, null, null, 0);
        pf.setCpf("0000000-1");
        pf.setNome("Jessica");
        pf.setIdade(22);
        pf.setSexo("Feminino");
        pf.setEndereco("Av. Um");
        pf.setSalario(3000);

        PessoaJuridica pj = new PessoaJuridica(null, null, null, null, 0);
        pj.setCnpj("0000000-0");
        pj.setNome("UFOP");
        pj.setIdade(20);
        pj.setSexo("Indefinido");
        pj.setEndereco("Universidade Federal de Ouro Preto");
        pj.setRendimento(100000);

        pf.escreveNoConsole();
        pf.pagarImposto();
        pj.escreveNoConsole();
        pj.pagarImposto();


    }
}
