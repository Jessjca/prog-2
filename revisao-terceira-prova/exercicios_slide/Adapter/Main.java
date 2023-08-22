package exercicios_slide.Adapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TomadaDoisPinos tomada = new TomadaDoisPinos();
        TomadaDeTresPinos tomada3 = new TomadaDeTresPinos();

        tomada3.ligandoTomadaDeTresPinos();
        tomada.ligandoTomadaDeDoisPinos();

        ArrayList<TomadaDoisPinos> equipamentos = new ArrayList<>();
        equipamentos.add(tomada);
        equipamentos.add(tomada3);

        for(TomadaDoisPinos tomadaDoisPinos : equipamentos) {
            tomadaDoisPinos.ligandoTomadaDeDoisPinos();
        }

        
    }
}
