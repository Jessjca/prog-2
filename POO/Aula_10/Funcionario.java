package Aula_10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    // Métodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(String novo_setor) {
        this.setor = novo_setor;
    }
}
