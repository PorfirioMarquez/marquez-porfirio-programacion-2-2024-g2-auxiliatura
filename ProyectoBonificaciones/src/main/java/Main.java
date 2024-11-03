package main.java;

public class Main {
        public static void main(String[] args) {
            // Creación de jugadores
            Jugador jugador1 = new Jugador("Alice", 100);
            Jugador jugador2 = new Jugador("Bob", 150);
    
            // Bonificación fija de 50 puntos
            CalculadoraBonificacion bonificacionFija = puntosBase -> {
                System.out.println("Bonificación fija aplicada a " + puntosBase + " puntos.");
                return 50;
            };
            
            // Bonificación basada en porcentaje del 10%
            CalculadoraBonificacion bonificacionPorcentaje = puntosBase -> {
                int bonificacion = (int) (puntosBase * 0.1);
                System.out.println("Bonificación del 10% aplicada a " + puntosBase + " puntos: " + bonificacion);
                return bonificacion;
            };
    
            // Aplicar bonificaciones
            System.out.println("Puntos iniciales:");
            System.out.println(jugador1);
            System.out.println(jugador2);
    
            jugador1.aplicarBonificacion(bonificacionFija);
            jugador2.aplicarBonificacion(bonificacionPorcentaje);
    
            System.out.println("\nPuntos después de aplicar bonificaciones:");
            System.out.println(jugador1);
            System.out.println(jugador2);
        }
    }
   