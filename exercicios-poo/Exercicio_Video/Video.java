package Exercicio_Video;

public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private static Video instancia;

    // Método construtor
    private Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Método para obter uma instância única
    public static Video getInstancia() {
        if (instancia == null) {
            instancia = new Video(null);
        }
        return instancia;
    }

    public void setInstancia(Video instancia) {
        Video.instancia = instancia;
    }

    // Métodos implementados da interface
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    // Método toString
    @Override
    public String toString() {
        return "Titulo do vídeo: " + this.getTitulo() + "\n" + "Avaliação do vídeo: " + this.getAvaliacao() + "\n"
                + "Quantidade de views: " +
                this.getViews() + "\n" + "Quantidade de curtidas: " + this.getCurtidas() + "\n";
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
