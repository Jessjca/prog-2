package EX02;

public class AplicativoImpressao {
    public static void main(String[] args) {
        Impressora impressora = Impressora.getInstancia();

        // Solicitações de impressão
        impressora.imprimir("Documento 1");
        impressora.imprimir("Documento 2");

        System.out.println("Quantidade de papel restante: " + impressora.getQuantidadePapel());
    }
}
