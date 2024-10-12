public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private Inventario inventario; // Inventario del personaje
    // Constructor
    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.inventario = new Inventario(); // Inicializa un inventario vacío
    }
    // Método para mostrar el estado del personaje
        public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosDeVida);
        inventario.mostrarItems(); // Mostrar el inventario junto con el estado
    }
    // Método para recibir daño
    public void recibirDaño(int daño) {        if (daño > 0) {
            puntosDeVida -= daño;
            if (puntosDeVida < 0) {
                puntosDeVida = 0;
                // Los puntos de vida no pueden ser negativos
            System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
        }
    }
    // Método para curar al personaje
    public void curar() {
        puntosDeVida += 20;
        System.out.println(nombre + " ha sido curado. Puntos de vida aumentados en 20.");
    }

    // Método para añadir un ítem al inventario del personaje
    public void agregarItemAlInventario(String item) {
        inventario.agregarItem(item);
    }
}