public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String sexo;
    private int idade;

    public Pessoa(String nome, String endereco, String sexo, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void escreveNoConsole() {
        System.out.println("O nome da pessoa é: " + this.nome);
        System.out.println("O sexo da pessoa é: " + this.sexo);
        System.out.println("O endereço é: " + this.endereco);
        System.out.println("Idade: " + this.idade);
    }

    public abstract void pagarImposto(); {
        return salarioAnual * 0.1;
        return salarioAnual * 0.15;
    }
}
