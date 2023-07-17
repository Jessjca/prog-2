package Aula_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando ArrayList de gatos
        List<Gato> gatos = new ArrayList<>();

        // Criando e adicionando gatos à lista
        Gato gato1 = new Gato();
        gato1.setNome("Rogerio");
        gato1.setPeso(4.5f);
        gato1.setIdade(5);
        gatos.add(gato1);

        Gato gato2 = new Gato();
        gato2.setNome("Roberto");
        gato2.setPeso(1.2f);
        gato2.setIdade(2);
        gatos.add(gato2);

        //Acessando os gatos adicionados
        imprimeLista(gatos);

        // Remover gatos da lista
        gatos.remove(0);
        System.out.println("O gato da posição 0 foi removido da lista");
        System.out.println("-------------------------");

        // Acessando os gatos da lista após a remoção
        imprimeLista(gatos);

        // Mostrando a quantidade de gatos após a remoção
        System.out.println("Tem " + gatos.size() + " gatinhos na lista!");
        System.out.println("-------------------------");

        // Limpando a lista
        gatos.clear();
        System.out.println("Lista limpada com sucesso!");
        System.out.println(gatos.size());
        System.out.println("-------------------------");
    }

    // Acessando os gatos da lista
    public static void imprimeLista(List<Gato> gatos) {
        for (Gato gato : gatos) {
            System.out.println("Nome do gato: " + gato.getNome());
            System.out.println("Peso do gato: " + gato.getPeso());
            System.out.println("Idade do gato: " + gato.getIdade());
            gato.locomover();
            gato.alimentar();
            gato.emitirAcao();
            System.out.println("-------------------------");
        }
    }
}
