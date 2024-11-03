// src/Main.java
public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        // Agregando tareas usando expresiones lambda
        aventura.agregarTarea(() -> System.out.println("Recoger madera"));
        aventura.agregarTarea(() -> System.out.println("Construir una fogata"));
        aventura.agregarTarea(() -> System.out.println("Explorar la cueva cercana"));

        // Ejecutando todas las tareas
        aventura.iniciar();
    }
}