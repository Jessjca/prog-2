package controle_acesso;

public class ControleAcesso {

    private static ControleAcesso instancia;
    private boolean acessoPermitido;

    private ControleAcesso() {
        acessoPermitido = false;
    }

    public static ControleAcesso getInstancia() {
        if (instancia == null) {
            instancia = new ControleAcesso();
        }
        return instancia;
    }

    public void permitirAcesso() {
        this.acessoPermitido = true;
        System.out.println("Acesso Permitido");
    }

    public void negarAcesso() {
        this.acessoPermitido = false;
        System.out.println("Acesso negado!");
    }

    public String isAcessoPermitido() {
        return "O acesso está: " + acessoPermitido;
    }
}
