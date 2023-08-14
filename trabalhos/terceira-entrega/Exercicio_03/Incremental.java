package EX03;

class Incremental {
    private static Incremental instance;
    private static int count = 0;
    private int numero;

    private Incremental() {
        numero = ++count;
    }

    public static Incremental getInstance() {
        if (instance == null) {
            instance = new Incremental();
        }
        return instance;
    }

    public String toString() {
        return "Incremental " + numero;
    }
}