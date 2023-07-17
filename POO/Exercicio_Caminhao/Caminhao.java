package Exercicio_Caminhao;

public class Caminhao implements Painel{

    //Atributos
    private String modelo;
    private int  ano;
    private String dono;
    private String cpfDono;
    private boolean ligado;
    private boolean radio;
    private boolean buzina;

    //Métodos especiais
    public String getCpfDono() {
        return cpfDono;
    }
    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean isRadio() {
        return radio;
    }
    public void setRadio(boolean radio) {
        this.radio = radio;
    }
    public boolean isBuzina() {
        return buzina;
    }
    public void setBuzina(boolean buzina) {
        this.buzina = buzina;
    }

    //Sobrescrita dos métodos da interface
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Caminhão de " + this.getDono() + " acaba de ser ligado");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Caminhão desligado");
    }
    @Override
    public void ligarRadio() {
        this.radio = true;
        System.out.println("Radio acaba de ser ligado");
    }
    @Override
    public void desligarRadio() {
        this.radio = false;
        System.out.println("Radio desligado");
    }
    @Override
    public void buzinar() {
        this.buzina = true;
        System.out.println("BI BI BI BI!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Caminhao other = (Caminhao) obj;
        return cpfDono.equals(other.cpfDono);
    }
    
    @Override
    public int hashCode() {
        return this.getCpfDono().charAt(0);
    }

    @Override
    public String toString() {
        String str = "CPF: " + this.getCpfDono();
        str += " ; Nome do dono: " + this.getDono();
        return str;
    
    }

}
