public class Date {
    private int month;   // Mês
    private int day;     // Dia
    private int year;    // Ano

    // Construtor que inicializa as variáveis de instância
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Método para configurar o mês
    public void setMonth(int month) {
        this.month = month;
    }

    // Método para recuperar o mês
    public int getMonth() {
        return month;
    }

    // Método para configurar o dia
    public void setDay(int day) {
        this.day = day;
    }

    // Método para recuperar o dia
    public int getDay() {
        return day;
    }

    // Método para configurar o ano
    public void setYear(int year) {
        this.year = year;
    }

    // Método para recuperar o ano
    public int getYear() {
        return year;
    }

    // Método para exibir a data no formato mês/dia/ano
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
