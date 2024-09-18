public class Operacion {
    private double x;
    private double y;

    // Constructor
    public Operacion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Suma de dos operaciones
    public Operacion sumar(Operacion other) {
        return new Operacion(this.x + other.x, this.y + other.y);
    }

    // Resta de dos operaciones
    public Operacion restar(Operacion other) {
        return new Operacion(this.x - other.x, this.y - other.y);
    }

    // Multiplicación por escalar
    public Operacion multiplicar(double escalar) {
        return new Operacion(this.x * escalar, this.y * escalar);
    }

    // Multiplicación de dos operaciones (producto punto como ejemplo)
    public double multiplicar(Operacion other) {
        return this.x * other.x + this.y * other.y;
    }

    // División por escalar
    public Operacion dividir(double escalar) {
        if (escalar == 0) {
            throw new ArithmeticException("División por cero no está permitida.");
        }
        return new Operacion(this.x / escalar, this.y / escalar);
    }

    @Override
    public String toString() {
        return "(" + x + "i, " + y + "j)";
    }

    // Método main para demostrar el uso
    public static void main(String[] args) {
        Operacion op1 = new Operacion(3, 5);
        Operacion op2 = new Operacion(2, 4);

        System.out.println("Suma: " + op1.sumar(op2));
        System.out.println("Resta: " + op1.restar(op2));
        System.out.println("Multiplicación por escalar (3): " + op1.multiplicar(3));
        System.out.println("Multiplicación (producto punto): " + op1.multiplicar(op2));
        System.out.println("División por escalar (2): " + op1.dividir(2));
    }
}