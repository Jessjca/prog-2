package Questao_01_01;

public abstract class Periferico {
    private String nome;
    private String marca;
    private String modelo;
    private String tipoConex;


    //Construtor
    public Periferico(String nome, String marca, String modelo, String tipoConex) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoConex = tipoConex;
    }

    //Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipoConex() {
        return tipoConex;
    }
    public void setTipoConex(String tipoConex) {
        this.tipoConex = tipoConex;
    }

    @Override
    public String toString() {
        return "Periferico [nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", tipoConex=" + tipoConex
                + "]";
    }

}
