package main.java.com.juego;
//Clase principal para demostrar el uso de la interfaz funcional EventoNotificacion
public class Main {
    public static void main(String[] args) {
        // Crear un evento
        Evento eventoLanzamiento = new Evento("Lanzamiento de Cohete");

        // Registrar notificaciones usando expresiones lambda
        eventoLanzamiento.registrarNotificacion(mensaje -> System.out.println("Notificación 1: " + mensaje));
        eventoLanzamiento.registrarNotificacion(mensaje -> System.out.println("Notificación 2: " + mensaje));

        // Activar el evento para llamar a todas las notificaciones
        eventoLanzamiento.activar();
    }
}