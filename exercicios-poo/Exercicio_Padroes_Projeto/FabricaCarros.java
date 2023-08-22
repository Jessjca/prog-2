package Exercicio_Padroes_Projeto;

public class FabricaCarros {
    private static FabricaCarros instancia;

    private FabricaCarros() {
        // Construtor privado
    }

    public static FabricaCarros getInstancia() {
        if (instancia == null) {
            instancia = new FabricaCarros();
        }
        return instancia;
    }

    public CarroFactory criarFabricaCarro(String tipo) {
        if (tipo.equalsIgnoreCase("sedan")) {
            return new FabricaCarroSedan();
        } else if (tipo.equalsIgnoreCase("suv")) {
            return new FabricaCarroSUV();
        }
        return null;
    }
}
