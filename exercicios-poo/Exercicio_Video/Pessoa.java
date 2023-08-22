package Exercicio_Video;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    //Método construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    //Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //Método toString
    public String toString() {
        return "Nome do usuário: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "Sexo: " + getSexo() + "\n" + "Experiência: " +
        getExperiencia();
    }
}
