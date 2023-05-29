package cinema;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Sessao s = new Sessao();
        Fileira f = new Fileira();
        Assento a = new Assento();

        int escolhaDeSessao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sessao: "));
        s.setSessaoNum(escolhaDeSessao);

        if (escolhaDeSessao > s.sessao.length) {
            s.autentificaSessao();
        } else {
            System.out.println("A sessão escolhida foi a: " + s.escolheSessao());
            int escolhaDeFileira = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da fileira: "));
            f.setFileiraQuantidade(escolhaDeFileira);
            if (escolhaDeFileira > f.fileira.length) {
                f.autentificaFileira();
            } else {
                System.out.println("A fileira escolhida foi a: " + f.escolheFileira());
                int escolhaDeAssento = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do assento: "));
                a.setAssentoQuantidade(escolhaDeAssento);

                if (escolhaDeAssento > a.assento.length) {
                    a.autentificaAssento();
                } else {
                    System.out.println("O assento escolhido foi a: " + a.escolheAssento());
                }
            }
        }
    }
}