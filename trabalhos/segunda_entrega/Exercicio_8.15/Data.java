public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static final String[] mes_nomes = {
            "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
            "Novembro", "Dezembro"
    };

    // Construtor com três valores inteiros (MM/DD/YYYY)
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor com uma String e dois valores inteiros (June 14, 1992)
    public Data(String mesNome, int dia, int ano) {
        this.dia = dia;
        this.mes = getMesNome(mesNome);
        this.ano = ano;
    }

    // Construtor com dois valores inteiros (DDD YYYY)
    public Data(int diaDoAno, int ano) {
        this.ano = ano;
        setmesAnddia(diaDoAno);
    }

    // Método privado para obter o número do mês com base no nome do mês
    private int getMesNome(String mesNome) {
        for (int i = 1; i <= 12; i++) {
            if (mes_nomes[i].equalsIgnoreCase(mesNome)) {
                return i;
            }
        }
        return 0; // Se o nome do mês não for válido
    }

    // Método privado para configurar o mês e o dia com base no número do dia do ano
    private void setmesAnddia(int diaDoAno) {
        int[] diasNoMes = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Verifica se é um ano bissexto
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            diasNoMes[2] = 29;
        }

        int mes = 1;
        int dia = diaDoAno;

        while (dia > diasNoMes[mes]) {
            dia -= diasNoMes[mes];
            mes++;
        }

        this.mes = mes;
        this.dia = dia;
    }

    // Método para gerar a saída da data no formato MM/DD/YYYY
    public String toStringMMDDYYYY() {
        return String.format("%02d/%02d/%04d", mes, dia, ano);
    }

    // Método para gerar a saída da data no formato June 14, 1992
    public String toStringmesdiaano() {
        return String.format("%s %02d, %04d", mes_nomes[mes], dia, ano);
    }

    // Método para gerar a saída da data no formato DDD YYYY
    public String toStringDDDYYYY() {
        int diaDoAno = getDiaDoAno();
        return String.format("%03d %04d", diaDoAno, ano);
    }

    // Método privado para obter o número do dia do ano
    private int getDiaDoAno() {
        int[] diasNoMes = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Verifica se é um ano bissexto
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            diasNoMes[2] = 29;
        }

        int diaOfano = 0;

        for (int i = 1; i < mes; i++) {
            diaOfano += diasNoMes[i];
        }

        diaOfano += dia;

        return diaOfano;
    }
}
