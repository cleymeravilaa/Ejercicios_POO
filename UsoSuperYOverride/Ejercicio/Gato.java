package UsoSuperYOverride.Ejercicio;

public class Gato extends Animal {
    public Gato(){
        super.sonido = "El gato esta maullando";
    }

    @Override
    public void hacerSonido(){
        System.out.println(this.sonido);
    }
}
