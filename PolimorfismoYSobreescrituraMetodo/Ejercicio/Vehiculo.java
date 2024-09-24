package PolimorfismoYSobreescrituraMetodo.Ejercicio;

public class Vehiculo {
    public void mover(){
        System.out.println("El vehiculo se está moviendo");
    }
}

class Avión extends Vehiculo {
    @Override
    public void mover(){
        System.out.println("El avión vuela");
    }
}

class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(); // Se Crea un Vehiculo
        vehiculo.mover(); // Se llama al método mover de la clase Vehiculo

        Vehiculo avión = new Avión(); // Polimorfismo: Se crea una instancia de tipo vehiculo que apunta a un avión
        avión.mover(); // Se llama al método mover de la clase Vehiculo
    }
}
