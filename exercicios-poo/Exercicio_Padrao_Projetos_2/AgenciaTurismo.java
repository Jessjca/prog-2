package Exercicio_Padrao_Projetos_2;

public class AgenciaTurismo {
    private static AgenciaTurismo instancia;

    private AgenciaTurismo() {
        //Construtor privado
    }

    public static AgenciaTurismo getInstancia() {
        if (instancia == null) {
            instancia = new AgenciaTurismo();
        } 
        return instancia;
    }

    public PacoteFactory criarFabricaPacotes(String tipo) {
        if(tipo.equalsIgnoreCase("Pacote Luxo")) {
            return new PacoteLuxo();
        } else if(tipo.equalsIgnoreCase("Pacote Padrao")) {
            return new PacotePadrao();
        }
        return null;
    }
}
