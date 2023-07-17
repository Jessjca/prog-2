package Aula_10;

public class Main {
    public static void main(String[] args) {
        //Aluno p1 = new Aluno();
        //Professor p2 = new Professor();
        //Funcionario p3 = new Funcionario();
        Bolsista p4 = new Bolsista();
        //Visitante p5 = new Visitante();

        p4.setNome("Jessica");
        p4.setCurso("Sistemas de Informação");
        p4.pagarMensalidade();

        System.out.println(p4.toString());
    }
}
