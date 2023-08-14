package Exercicio_Caminhao;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Caminhao> Caminhoes = new HashSet<>();
        Caminhao c1 = new Caminhao();
        Caminhao c2 = new Caminhao();
        Caminhao c3 = new Caminhao();
        
        c1.setDono("Jessica");
        c1.setCpfDono("2002048665");
        c1.ligar();
        c1.ligarRadio();
        c1.buzinar();

        c2.setDono("Karina");
        c2.setCpfDono("2002048665");
        c2.ligar();
        c2.ligarRadio();


        c3.setDono("Karina");
        c3.setCpfDono("2222048665");

        Caminhoes.add(c1); // Adiciona o caminhão c1 à lista
        Caminhoes.add(c2); // Adiciona o caminhão c2 à lista
        Caminhoes.add(c3); // Adiciona o caminhão c3 à lista

        for(Caminhao caminhao : Caminhoes) {
            System.out.println(caminhao);
        }

    }
}
