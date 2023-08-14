public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
        int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getEmpates() {
        return empates;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNome() {
        return nome;
    }

    private void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Inválido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 83.9){
            this.categoria = "Médio";
        }else{
            this.categoria = "Pesado";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void apresentar(){
        System.out.println("-----------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou " + this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates!");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.categoria);
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
