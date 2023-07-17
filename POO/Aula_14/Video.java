package Aula_14;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Métodos especiais
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
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
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //Métodos abstratos da interface
    @Override
    public void like() {
        this.curtidas++;
        System.out.println("Vídeo curtido!");
    }
    @Override
    public void pause() {
        if(this.reproduzindo = true) {
            this.reproduzindo = false;
        }else {
            System.out.println("O vídeo já está pausado!");
        }
        System.out.println("Vídeo pausado!");
    }

    @Override
    public void play() {
        if(this.reproduzindo = false) {
            this.reproduzindo = true;
        }else {
            System.out.println("O vídeo já está reproduzindo!");
        }
        System.out.println("Vídeo está reproduzindo!");
    }

    @Override
    public String toString() {
        return "Video titulo = " + titulo + ", Avaliacao = " + avaliacao + ", Views = " + views + ", Curtidas = " + curtidas
                + ", Reproduzindo = " + reproduzindo;
    }    
}
