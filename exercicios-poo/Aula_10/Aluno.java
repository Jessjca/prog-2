package Aula_10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    // Métodos especiais
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula() {
        this.matricula = 0;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com sucesso!");
    }
}
