package atividades_slide.slide_1;

public class Cliente {
    private String nome;
    private int cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String toString() {
        return "Nome do cliente: " + getNome() + "\n" + "Endereço: " + getEndereço() + "\n" + "CPF: " + getCpf();
    }
}
