package UsoFinalYProtected.Ejercicio;

final public class Constante {
    public final int valor = 42; // Variable final que no puede ser modificada

    // Método final que no puede ser sobrescrito
    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

/*
class SubConstante extends Constante {
    // Error: The type Constante cannot subclass the final Constante
}

*/


// 
class principal {
    public static void main(String[] args) {
        ClasePadre padre = new ClasePadre();
        padre.mostrarNombre();
        padre.valor = 100;
        padre.nombre = "Clase Padre";

        // También podemos acceder a los métodos finales de la superclase
        // Fuera de la subclase pero dentro del mismo paquete
        padre.mostrarNombre();
        
    }
}