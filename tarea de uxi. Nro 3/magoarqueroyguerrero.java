// Clase base Personaje
public class Personaje {
    private String nombre;
    private int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Salud: " + salud);
    }
}

// Subclase Mago
class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int salud, int mana) {
        super(nombre, salud);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " ha lanzado un hechizo.");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

// Subclase Arquero
class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int salud, int destreza) {
        super(nombre, salud);
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println(getNombre() + " ha disparado una flecha.");
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}

// Subclase Guerrero
class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(getNombre() + " ha realizado un ataque.");
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}

// Clase principal para probar las subclases
public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Gandalf", 100, 200);
        Arquero arquero = new Arquero("Legolas", 90, 150);
        Guerrero guerrero = new Guerrero("Aragorn", 120, 180);

        mago.mostrarInfo();
        mago.lanzarHechizo();
        System.out.println("Mana: " + mago.getMana());

        arquero.mostrarInfo();
        arquero.dispararFlecha();
        System.out.println("Destreza: " + arquero.getDestreza());

        guerrero.mostrarInfo();
        guerrero.atacar();
        System.out.println("Fuerza: " + guerrero.getFuerza());
    }
}
import java.util.Random;

abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract void atacar(Personaje enemigo);

    public void mostrarEstado() {
        System.out.println(nombre + " - Vida: " + vida + " | Nivel: " + nivel);
    }
}

class Mago extends Personaje {

    public Mago(String nombre, int vida, int nivel) {
        super(nombre, vida, nivel);
    }

    @Override
    public void atacar(Personaje enemigo) {
        Random random = new Random();
        int danio = random.nextInt(11) + 10; // Daño entre 10 y 20
        System.out.println(nombre + " lanza un hechizo y causa " + danio + " de daño a " + enemigo.nombre);
        enemigo.vida -= danio;
    }
}

class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida, int nivel) {
        super(nombre, vida, nivel);
    }

    @Override
    public void atacar(Personaje enemigo) {
        Random random = new Random();
        int danio = random.nextInt(11) + 10; // Daño entre 10 y 20
        System.out.println(nombre + " ataca con su espada y causa " + danio + " de daño a " + enemigo.nombre);
        enemigo.vida -= danio;
    }
}

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Creación de los personajes
        Mago mago = new Mago("Gandalf", 100, random.nextInt(10) + 1);
        Guerrero guerrero = new Guerrero("Conan", 100, random.nextInt(10) + 1);

        // Simulación del combate
        System.out.println("¡Comienza el combate entre el Mago y el Guerrero!");
        
        while (mago.estaVivo() && guerrero.estaVivo()) {
            // El mago ataca
            mago.atacar(guerrero);
            guerrero.mostrarEstado();
            
            // Verificar si el guerrero sigue vivo
            if (!guerrero.estaVivo()) {
                System.out.println("¡" + guerrero.nombre + " ha sido derrotado! " + mago.nombre + " gana el combate.");
                break;
            }
            
            // El guerrero ataca
            guerrero.atacar(mago);
            mago.mostrarEstado();

            // Verificar si el mago sigue vivo
            if (!mago.estaVivo()) {
                System.out.println("¡" + mago.nombre + " ha sido derrotado! " + guerrero.nombre + " gana el combate.");
                break;
            }
        }
    }
}