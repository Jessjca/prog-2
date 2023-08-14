package Exercicio_Lanchonete;

public class Cardapio {
    private Pizza pizza[];
    private Lanche lanche[];

    public Cardapio(int quantidadeP, int quantidadeL) {
        pizza = new Pizza[quantidadeP];

        for (int i = 0; i < quantidadeP; i++) {
            pizza[quantidadeP] = null;
        }

        lanche = new Lanche[quantidadeL];

        for (int i = 0; i < quantidadeL; i++) {
            lanche[quantidadeL] = null;
        }
    }

    public boolean addPizza(Pizza c, int i) {
        try {
            if (pizza[i] == null) {
                pizza[i] = c;
                return true;
            } else {
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Pizza já cadastrada!");
            return false;
        }
    }

    public boolean addLanche(Lanche l, int i) {
        try {
            if (lanche[i] == null) {
                lanche[i] = l;
                return true;
            } else {
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lanche já cadastrada!");
            return false;
        }
    }
}