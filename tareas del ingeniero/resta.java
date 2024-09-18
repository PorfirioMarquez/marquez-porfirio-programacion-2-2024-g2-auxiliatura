public class Operaciones {

    // Métodos para operaciones aritméticas fundamentales
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    // Clase interna para operaciones vectoriales
    public static class Vector2D {
        private double x;
        private double y;

        public Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Sobrecarga de métodos para operaciones vectoriales
        public Vector2D sumar(Vector2D otro) {
            return new Vector2D(this.x + otro.x, this.y + otro.y);
        }

        public Vector2D restar(Vector2D otro) {
            return new Vector2D(this.x - otro.x, this.y - otro.y);
        }

        public Vector2D multiplicar(Vector2D otro) {
            return new Vector2D(this.x * otro.x, this.y * otro.y);
        }

        @Override
        public String toString() {
            return "(" + x + "i, " + y + "j)";
        }
    }

    public static void main(String[] args) {
        // Ejemplos de uso de operaciones aritméticas
        System.out.println("Suma: " + sumar(5, 3));
        System.out.println("Resta: " + restar(5, 3));
        System.out.println("Multiplicación: " + multiplicar(5, 3));
        System.out.println("División: " + dividir(5, 3));

        // Ejemplo de uso de operaciones vectoriales
        Vector2D vector1 = new Vector2D(3, 4);
        Vector2D vector2 = new Vector2D(1, 2);

        System.out.println("Vector1 + Vector2 = " + vector1.sumar(vector2));
        System.out.println("Vector1 - Vector2 = " + vector1.restar(vector2));
    }
}