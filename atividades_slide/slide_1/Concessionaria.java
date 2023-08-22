package atividades_slide.slide_1;

public class Concessionaria {
    public static void main(String[] args) {
        Carro c = new Carro();
        Cliente c1 = new Cliente();

        c1.setNome("Jessica Costa");
        c1.setCpf(02002047666);
        c1.setEndereco("Rua Dois");

        c.setAno(2010);
        c.setCor("Preto");
        c.setModelo("Pálio");

        System.out.println(c.toString());
        System.out.println("----------------");
        System.out.println(c1.toString());
    }
}
