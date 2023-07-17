package Aula_08;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[1];

        pessoa[0] = new Pessoa("Jessica", 22, "Mulher");
        pessoa[1] = new Pessoa("Karina", 19, "Mulher");

        livro[0] = new Livro("George Owrell", "1984", 200, false, pessoa[1]);
        livro[0].abrir();
        livro[0].folhear(98);
        
        System.out.println(livro[0].detalhes());;
    }
}
