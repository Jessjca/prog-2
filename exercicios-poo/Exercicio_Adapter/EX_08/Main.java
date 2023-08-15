package EX_08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do SomadorExistente
        SomadorExistente somadorExistente = new SomadorExistente();

        // Criando um adapter para SomadorExistente
        SomadorEsperado adapter = new AdapterSomador(somadorExistente);

        // Criando uma instância do Cliente com o adapter
        Cliente cliente = new Cliente(adapter);

        // Executando a operação de soma através do Cliente
        cliente.executar();
        
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        int soma = somadorExistente.somaLista(lista);

        System.out.println("Resultado usando SomadorExistente: " + soma);
    }
}
