import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfile {
    private String nome;
    private LocalDate dataNascimento;
    private double peso; // em quilogramas
    private int altura; // em centímetros
    
    public HealthProfile(String nome, LocalDate dataNascimento, double peso, int altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimento.getYear();
        
        if (dataAtual.getMonthValue() < dataNascimento.getMonthValue() ||
            (dataAtual.getMonthValue() == dataNascimento.getMonthValue() && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }
        
        return idade;
    }
    
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }
    
    public String calcularFaixaAlvoFrequenciaCardiaca() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int faixaInferior = (int) (frequenciaMaxima * 0.5);
        int faixaSuperior = (int) (frequenciaMaxima * 0.85);
        return faixaInferior + " - " + faixaSuperior;
    }
    
    public double calcularIMC() {
        double alturaEmMetros = altura / 100.0;
        return peso / (alturaEmMetros * alturaEmMetros);
    }
    
    public String getStatusIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
    
    public void exibirPerfilSaude() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Status IMC: " + getStatusIMC());
        System.out.println("Frequência Cardíaca Máxima: " + calcularFrequenciaCardiacaMaxima());
        System.out.println("Faixa Alvo Frequência Cardíaca: " + calcularFaixaAlvoFrequenciaCardiaca());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a data de nascimento (formato: yyyy-mm-dd): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (em cm): ");
        int altura = scanner.nextInt();
        
        HealthProfile healthProfile = new HealthProfile(nome, dataNascimento, peso, altura);
        
        System.out.println("\nPerfil de Saúde:");
        healthProfile.exibirPerfilSaude();
        
        scanner.close();
    }
}
