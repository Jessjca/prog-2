public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        contaCorrente.depositar(2000.0);
        contaCorrente.sacar(1500.0);
        contaCorrente.tirarExtrato();

        ContaPoupanca contaPoupanca = new ContaPoupanca(0.05);
        contaPoupanca.depositar(5000.0);
        contaPoupanca.sacar(2000.0);
        contaPoupanca.tirarExtrato();
    }
}