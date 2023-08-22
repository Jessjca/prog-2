package exercicios_slide.Factory_Method;

public class Pizza {
    private String sabor;

    protected Pizza(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String toString() {
        return "Sabor: " + this.sabor;
    }
    
}
