public class Date {
    private int dia;     // Dia
    private int mes;   // Mês
    private int ano;    // Ano

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void mostraData() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }
}
