package pagina_275;

public class ClasseRetangulo {
    float comprimento;
    float largura;
    float perimetro;
    float area;

    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float c) {
        if(c > 0.0 && c < 20){        // maiores que 0,0 e menores que 20
            this.comprimento = c;
        }else{
            System.out.println("Escreva um número entre 0 e 20.");
        }

    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float l) {
        if(l > 0.0 && l < 20){        // maiores que 0,0 e menores que 20
            this.largura = l;
        }else{
            System.out.println("Escreva um número entre 0 e 20.");
        }
    }

        public void calcularPerimentro() {
        perimetro = 2 * comprimento + 2 * largura;
        System.out.println("O perimentro do retangulo é igual a: " + perimetro);
    }

    public void calcularArea() {
        area = comprimento * largura;
        System.out.println("A área do retangulo é igual a: " + area);
    }
}
