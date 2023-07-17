package Aula_07;

import java.util.Random;

public class Luta {
    //Atributos
    private int rounds;
    private boolean aprovada;
    private Lutador desafiado;
    private Lutador desafiante;

    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if(this.aprovada) {
            System.out.println("-----------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("-----------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor) {
                case 0: //empate
                System.out.println("-------------------");
                    System.out.println("Empatou!!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado vence
                    System.out.println("-----------------------------");
                    System.out.println("### VENCEDOR ###");
                    System.out.println("Vitória do " + this.desafiado.getNome() + "!!!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("-----------------------------");
                    System.out.println("### VENCEDOR ###");
                    System.out.println("Vitória do " + this.desafiante.getNome() + "!!!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else {
            System.out.println("Luta não pode acontecer!");
        }

    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    

}
