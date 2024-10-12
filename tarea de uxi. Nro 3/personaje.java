public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    // Constructor
    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    // Método para mostrar el estado del personaje
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosDeVida);
    }

    // Método para recibir daño
    public void recibirDaño(int daño) {
        if (daño > 0) {
            puntosDeVida -= daño;
            if (puntosDeVida < 0) {
                puntosDeVida = 0;  // Los puntos de vida no pueden ser negativos
            }
            System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
        }
    }

    // Método para curar al personaje
    public void curar() {
        puntosDeVida += 20;
        System.out.println(nombre + " ha sido curado. Puntos de vida aumentados en 20.");
    }

    // Main para probar la clase
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guerrero", 5, 100);

        personaje.mostrarEstado();
        personaje.recibirDaño(30);
        personaje.mostrarEstado();
        personaje.curar();
        personaje.mostrarEstado();
    }
}