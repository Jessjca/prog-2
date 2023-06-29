package criptografia;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    Criptografe c = new Criptografe();

    int numeroDescriptografado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro de 4 digitos: "));
    c.setNumDescripto(numeroDescriptografado);
    c.verificaNumero();
    }
}
