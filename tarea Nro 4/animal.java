public abstract class Animal {
    protected String nombre;
    protected int edad;

    // Constructor para inicializar los atributos
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto que será implementado por las clases derivadas
    public abstract void hacerSonido();

    // Método para mostrar la información del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
public class Vaca extends Animal implements Productor {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace 'Muuu'.");
    }

    // Implementación del método producir() de la interfaz Productor
    @Override
    public void producir() {
        System.out.println("La vaca está produciendo leche.");
    }
}

public class Oveja extends Animal implements Productor {

    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("La oveja hace 'Beee'.");
    }

    // Implementación del método producir() de la interfaz Productor
    @Override
    public void producir() {
        System.out.println("La oveja está produciendo lana.");
    }
}

public class Granja {

    public static void main(String[] args) {
        Vaca vaca = new Vaca("Lola", 5);
        Oveja oveja = new Oveja("Dolly", 3);

        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();

        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
    }
}