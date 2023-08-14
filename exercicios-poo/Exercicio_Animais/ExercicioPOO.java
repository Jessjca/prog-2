package Exercicio_Animais;
import java.util.*;

public class ExercicioPOO {
    public static void main(String[] args) {
        try {
            // Criando uma lista de animais
            List<Animal> animais = new ArrayList<>();

            // Adicionando animais à lista
            animais.add(new Cachorro("Roberto", 2));
            animais.add(new Gato("Ronaldo", 5));

            // Exibindo informações dos animais
            for (Animal animal : animais) {
                System.out.println(animal);
                animal.fazerBarulho();
            }

            // Criando um conjunto de animais
            Set<Animal> conjuntoAnimais = new HashSet<>();

            // Adicionando animais ao conjunto
            conjuntoAnimais.add(new Cachorro("Rex", 2));
            conjuntoAnimais.add(new Gato("Mia", 4));

            // Exibindo informações dos animais no conjunto
            for (Animal animal : conjuntoAnimais) {
                System.out.println(animal);
                animal.fazerBarulho();
            }

            // Criando um mapa de animais
            Map<String, Animal> mapaAnimais = new HashMap<>();

            // Adicionando animais ao mapa
            mapaAnimais.put("Cachorro", new Cachorro("Max", 4));
            mapaAnimais.put("Gato", new Gato("Simba", 3));

            // Exibindo informações dos animais no mapa
            for (String key : mapaAnimais.keySet()) {
                Animal animal = mapaAnimais.get(key);
                System.out.println(key + ": " + animal);
                animal.fazerBarulho();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
