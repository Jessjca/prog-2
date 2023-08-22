package exercicios_slide.Adapter;

public class AdaptadorDeTomada extends TomadaDoisPinos{

    private TomadaDeTresPinos objetoTomadaDeTresPinos;

    public AdaptadorDeTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.objetoTomadaDeTresPinos = objetoTomadaDeTresPinos;
    }
}
