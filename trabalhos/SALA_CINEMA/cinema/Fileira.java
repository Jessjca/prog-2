package cinema;

public class Fileira {
    private int numeroFileira;

    public void setFileiraQuantidade(int fileira) {
        numeroFileira = fileira;
    }

    public int getFileiraQuantidade() {
        return numeroFileira;
    }

    int[] fileira = new int[10];
    {
        for (int i = 0; i < fileira.length; i++) {
            fileira[i] = i + 1;
        }

        for (int j = 0; j < fileira.length; j++) {
            // System.out.println(fileira[j]);
        }

        for (int k = 0; k < fileira.length; k++) {

        }
    }

    public int escolheFileira() {
        int i = 0;
        while (fileira[i] < numeroFileira) {
            fileira[i]++;
            if (fileira[i] == numeroFileira) {
                break;
            }
        }
        return fileira[i];
    }

    public void autentificaFileira() {
        if (numeroFileira > 10) {
            System.out.println("ATENÇÃO: Escolha uma fileira de 1 a 10!");
        }
    }
}
