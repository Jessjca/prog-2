package controle_acesso;

public class Main {
    public static void main(String[] args) {
        ControleAcesso controle1 = ControleAcesso.getInstancia();

        controle1.permitirAcesso();

        ControleAcesso controle2 = ControleAcesso.getInstancia();

        controle2.negarAcesso();
    }
}
