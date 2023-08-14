public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 70.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.65f, 71.9f, 1, 3, 4);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.67f, 78.9f, 6, 5, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.75f, 80.9f, 5, 2, 1);
        l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.55f, 100f, 4, 2, 5);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.80f, 96f, 1, 2, 1);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();


    }
}
