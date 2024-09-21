import java.util.Scanner;

public class ValidarFecha {

    public static boolean validarFecha(String fecha) {
        try {
            String[] partes = fecha.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int año = Integer.parseInt(partes[2]);

            if (1 <= dia && dia <= 31 && 1 <= mes && mes <= 12) {
                // Verificar días en cada mes
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    return false;
                }
                if (mes == 2) {
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        return dia <= 29; // Año bisiesto
                    } else {
                        return dia <= 28; // No bisiesto
                    }
                }
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una fecha en formato día/mes/año (ej. 15/10/2023): ");
        String fecha = scanner.nextLine();

        if (validarFecha(fecha)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }

        scanner.close();
    }
}