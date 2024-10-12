abstract class Vehiculo {
    // Atributos
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método abstracto
    public abstract void acelerar();

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}

// Interfaz Turbo
interface Turbo {
    public void activarTurbo();
}

// Clase Coche que extiende Vehiculo
class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    // Implementación del método acelerar
    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }
}

// Clase Moto que extiende Vehiculo e implementa Turbo
class Moto extends Vehiculo implements Turbo {

    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    // Implementación del método acelerar
    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando.");
    }

    // Implementación del método activarTurbo de la interfaz Turbo
    @Override
    public void activarTurbo() {
        System.out.println("La moto " + marca + " " + modelo + " ha activado el turbo.");
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Coche
        Coche coche = new Coche("Toyota", "Supra", 250);
        coche.mostrarInfo();
        coche.acelerar();

        // Crear un objeto Moto
        Moto moto = new Moto("Yamaha", "R1", 299);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}