package criptografia;

public class Criptografe {
    private int numeroDescriptografado;
    private int numeroCriptografado;

    public void setNumDescripto(int numD) {
        numeroDescriptografado = numD;
    }

    public int getNumDescripto() {
        return numeroDescriptografado;
    }

    public void setNumCripto(int numC) {
        numeroCriptografado = numC;
    }

    public int getNumCripto() {
        return numeroCriptografado;
    }

    public void Criptografa() {
        // Separa os dígitos do número
        int digito1 = numeroDescriptografado / 1000;
        int digito2 = (numeroDescriptografado / 100) % 10;
        int digito3 = (numeroDescriptografado / 10) % 10;
        int digito4 = numeroDescriptografado % 10;

        // Criptografa os dígitos
        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;

        // Inverte a posição dos dígitos criptografados
        int numeroCriptografado = (digito3 * 1000) + (digito4 * 100) + (digito1 * 10) + digito2;

        System.out.println("Numero criptografado: " + numeroCriptografado);
    }

    public void verificaNumero() {
        if (numeroDescriptografado >= 1000 && numeroDescriptografado <= 9999)
        {
            Criptografa();
        } else {
            System.out.println("ATENÇÃO: digite um número de 4 dígitos.");
        }
    }
}

