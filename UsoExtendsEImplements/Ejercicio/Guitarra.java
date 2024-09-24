package UsoExtendsEImplements.Ejercicio;

public class Guitarra extends Instrumento implements Afinable {
    @Override
    public void afinar(){
        System.out.println("Afinando guitarra");
    } 

    @Override
    public void tocar(){
        System.out.println("Tocando guitarra");
    }
}
