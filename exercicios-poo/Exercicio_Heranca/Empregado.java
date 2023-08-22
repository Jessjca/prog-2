package Exercicio_Heranca;

public class Empregado extends Pessoa{
    //Atributos
    private double salario;
    private String matricula;

    //Métodos especiais
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
