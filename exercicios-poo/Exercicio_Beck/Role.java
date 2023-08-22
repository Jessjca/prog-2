package Exercicio_Beck;

public class Role implements Bolar{
    private String beck;

    public Role(String beck) {
        this.beck = beck;
    }

    @Override
    public void bolandoBeck(String beck) {
        this.beck = beck;
    }
}
