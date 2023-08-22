package atividades_slide.slide_1;

public class Carro {
    private String cor;
    private int ano;
    private String modelo;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Ano: " + getAno() + "\n" + "Cor: " + getCor() + "\n" + "Modelo: " + getModelo();
    }
}
