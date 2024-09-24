package UsoFinalYProtected.Ejercicio;

public class ClasePadre {
    protected int valor = 42; // Variable protegida
    protected String nombre = "Nombre de la clase padre";

    // Método protegido
    protected void mostrarNombre() {
        System.out.println(nombre);
    }
}

class SubClase extends ClasePadre {
    // Método final
    final void mostrarValor() {
        // Podemos acceder al método de la clase padre desde una subclase
        // por su modificador de acceso ya que es protected en la superclase
        super.mostrarNombre();
    }
}