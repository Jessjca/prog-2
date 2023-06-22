abstract class Conta {
    protected double saldo;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void tirarExtrato();
}

class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque efetuado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito efetuado. Novo saldo: " + saldo);
    }

    @Override
    public void tirarExtrato() {
        double saldoTotal = saldo + limiteChequeEspecial;
        System.out.println("Saldo em conta + limite de cheque especial: " + saldoTotal);
    }
}

class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito efetuado. Novo saldo: " + saldo);
    }

    @Override
    public void tirarExtrato() {
        double saldoTotal = saldo * (1 + taxaRendimento);
        System.out.println("Saldo em conta + rendimento: " + saldoTotal);
    }
}
