package Aula_14;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v = new Video();
        Gafanhoto g = new Gafanhoto();

        v.setTitulo("Curso Java POO");
        v.setAvaliacao(10);
        v.like();
        v.setViews(5);
        v.setReproduzindo(true);
        System.out.println(v.toString());

        g.setLogin("Jessjca");
        g.setNome("Jessica Costa");
        g.setExperiencia(2);
        g.ganharExp();
        System.out.println(g.toString());
    }
}
