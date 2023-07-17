import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntegerSet {
    private boolean[] grupo = new boolean[100];

    public IntegerSet() {
        for (int i = 0; i < grupo.length; i++) {
            grupo[i] = false;
        }
    }

    public boolean[] getGrupo() {
        return grupo;
    }

    public void setGrupo(boolean[] grupo) {
        this.grupo = grupo;
    }

    public boolean inserirElemento(int j) {
        if (grupo[j] == true) {
            System.out.println("O número " + j + " já está no conjunto.");
            return false;
        }
        grupo[j] = true;
        return true;
    }

    public boolean deletarElemento(int j) {
        if (grupo[j] == false) {
            System.out.println("Este elemento foi deletado.");
            return false;
        }
        grupo[j] = false;
        return true;
    }

    public ArrayList<Boolean> union(boolean a[]) {
        ArrayList<Boolean> union = new ArrayList<>();
        for (boolean i : grupo) {
            union.add(i);
        }
        for (boolean j : a) {
            if (!union.contains(j)) {
                union.add(j);
            }
        }
        return union;
    }

    public Set<Boolean> intersection(boolean a[]) {
        Set<Boolean> intersection = new HashSet<>();
        for (boolean i : grupo) {
            for (boolean j : a) {
                if (i == j) {
                    intersection.add(i);
                }
            }
        }
        return intersection;
    }

    public boolean isEqual(boolean a[]) {
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i] != a[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntegerSet: [");
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i]) {
                sb.append(i);
                sb.append(", ");
            }
        }
        if (sb.length() > 12) {
            sb.setLength(sb.length() - 2); // Remove a vírgula e o espaço após o último elemento
        }
        sb.append("]");
        return sb.toString();
    }
}
