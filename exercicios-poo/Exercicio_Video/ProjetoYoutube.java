package Exercicio_Video;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] videos = new Video[2];

        videos[0] = Video.getInstancia();
        videos[0].setTitulo("Aula 1 de POO");
        videos[0].setAvaliacao(10);

        videos[1] = Video.getInstancia();
        videos[1].setTitulo("Projeto Banco de Dados");
        videos[1].setAvaliacao(8);

        System.out.println(videos[0].toString());
        System.out.println(videos[1].toString());
    }
}
