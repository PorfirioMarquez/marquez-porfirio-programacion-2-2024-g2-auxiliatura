import java.util.Random;

class Personaje {
    String nombre;
    int vida;
    int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Vida: " + vida + " | Nivel: " + nivel);
    }
}

class Mago extends Personaje {
    public Mago(String nombre, int vida, int nivel) {
        super(nombre, vida, nivel);
    }

    public int lanzarHechizo() {
        Random random = new Random();
        return 10 + random.nextInt(11); // Daño aleatorio entre 10 y 20
    }
}

class Guerrero extends Personaje {
    public Guerrero(String nombre, int vida, int nivel) {
        super(nombre, vida, nivel);
    }

    public int atacar() {
        Random random = new Random();
        return 10 + random.nextInt(11); // Daño aleatorio entre 10 y 20
    }
}

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Crear personajes
        Mago mago = new Mago("Mago", 100, random.nextInt(100) + 1);
        Guerrero guerrero = new Guerrero("Guerrero", 100, random.nextInt(100) + 1);

        System.out.println("¡Empieza el combate!");

        // Simular combate
        while (mago.estaVivo() && guerrero.estaVivo()) {
            // Turno del mago
            int danioMago = mago.lanzarHechizo();
            guerrero.recibirDanio(danioMago);
            System.out.println("El mago lanza un hechizo y causa " + danioMago + " de daño.");
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            // Verificar si el guerrero sigue vivo
            if (!guerrero.estaVivo()) {
                System.out.println("¡El mago ha ganado el combate!");
                break;
            }

            // Turno del guerrero
            int danioGuerrero = guerrero.atacar();
            mago.recibirDanio(danioGuerrero);
            System.out.println("El guerrero ataca y causa " + danioGuerrero + " de daño.");
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            // Verificar si el mago sigue vivo
            if (!mago.estaVivo()) {
                System.out.println("¡El guerrero ha ganado el combate!");
                break;
            }

            System.out.println("----------------------------------");
        }
    }
}