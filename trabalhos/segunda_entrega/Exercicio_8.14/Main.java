import java.util.ArrayList;
import java.util.Set;

public class Main {
    public class IntegerSetTestes {
    public static void main(String[] args) {
  
        IntegerSet integerset1 = new IntegerSet();
        IntegerSet sintegerset2 = new IntegerSet();

      
        integerset1.inserirElemento(5);
        integerset1.inserirElemento(10);
        integerset1.inserirElemento(15);

 
        sintegerset2.inserirElemento(10);
        sintegerset2.inserirElemento(20);
        sintegerset2.inserirElemento(25);

       
        System.out.println("Conjunto 1: " + integerset1);
        System.out.println("Conjunto 2: " + sintegerset2);

      
        ArrayList<Boolean> union = integerset1.union(sintegerset2.getGrupo());
        System.out.println("União dos conjuntos: " + union);

      
        Set<Boolean> intersection = integerset1.intersection(sintegerset2.getGrupo());
        System.out.println("Interseção dos conjuntos: " + intersection);

       
        boolean isEqual = integerset1.isEqual(sintegerset2.getGrupo());
        System.out.println("Os conjuntos são iguais? " + isEqual);

        
        integerset1.deletarElemento(5);
        sintegerset2.deletarElemento(20);

        
        System.out.println("Conjunto 1 (atualizado): " + integerset1);
        System.out.println("Conjunto 2 (atualizado): " + sintegerset2);

        
        isEqual = integerset1.isEqual(sintegerset2.getGrupo());
        System.out.println("Os conjuntos são iguais? " + isEqual);
    }
}

}
