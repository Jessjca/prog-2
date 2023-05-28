import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // SalaCinema c = new SalaCinema();
        Sessao s = new Sessao();
        Fileira f = new Fileira();
        Assento a = new Assento();

        int escolhaDeSessao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sessao: "));
        s.setSessaoNum(escolhaDeSessao);
        s.escolheSessao();

        int escolhaDeFileira = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da fileira: "));
        f.setFileiraQuantidade(escolhaDeFileira);
        f.escolheFileira();

        int escolhaDeAssento = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do assento: "));
        a.setAssentoQuantidade(escolhaDeAssento);
        a.escolheAssento();

        // System.out.println(s.getSessaoNum());
    }
}