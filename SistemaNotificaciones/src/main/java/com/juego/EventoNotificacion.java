package main.java.com.juego;
//interfaz funcional notificaciones de eventos 
@FunctionalInterface
public interface EventoNotificacion {
    void notificar(String mensaje);
}