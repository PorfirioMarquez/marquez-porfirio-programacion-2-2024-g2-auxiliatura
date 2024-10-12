// Clase abstracta Carta
public abstract class Carta {
    // Atributos
    protected int valor;
    protected String palo;

    // Constructor para inicializar los atributos
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método abstracto que será implementado por las clases derivadas
    public abstract void jugar();

    // Método que imprime el valor y el palo de la carta
    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo);
    }
}
// Interfaz Accionable
public interface Accionable {
    // Método abstracto para realizar una acción especial
    void realizarAccion();
}
// Clase CartaNormal que extiende Carta
public class CartaNormal extends Carta {

    // Constructor para inicializar la carta normal
    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método abstracto jugar()
    @Override
    public void jugar() {
        System.out.println("La carta normal " + valor + " de " + palo + " ha sido jugada.");
    }
}
// Clase CartaEspecial que extiende Carta e implementa Accionable
public class CartaEspecial extends Carta implements Accionable {

    // Constructor para inicializar la carta especial
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método abstracto jugar()
    @Override
    public void jugar() {
        System.out.println("La carta especial " + valor + " de " + palo + " ha sido jugada.");
    }

    // Implementación del método realizarAccion() de la interfaz Accionable
    @Override
    public void realizarAccion() {
        System.out.println("La carta especial " + valor + " de " + palo + " realiza una acción especial.");
    }
}