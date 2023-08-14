package Aula_14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAssistido;

    //Métodos especiais
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisUm() {
        this.totalAssistido += this.totalAssistido;
    }

    public String toString() {
        return "Login: " + login + ", Total de vídeos assistidos: " + totalAssistido + ", Experiencia: " + getExperiencia();
    }
}
