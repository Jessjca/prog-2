package pagina_275;
import javax.swing.JOptionPane;

public class MainRetangulo {

    public static void main(String[] args){
        ClasseRetangulo cr = new ClasseRetangulo();

        float escolhaComprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero do comprimento: "));
        cr.setComprimento(escolhaComprimento);

        float escolhaLargura = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero da largura: "));
        cr.setLargura(escolhaLargura);

        cr.calcularArea();
        cr.calcularPerimentro();
    }
}
