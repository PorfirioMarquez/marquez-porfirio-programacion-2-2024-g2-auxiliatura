import java.util.List;

public class ContarPalabras {

    // Función que cuenta las palabras que comienzan con una letra específica
    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.toLowerCase().charAt(0) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        List<String> listaDePalabras = List.of("manzana", "banana", "mora", "melón", "kiwi", "mango");
        char letra = 'm'; // Cambia esta letra según sea necesario

        int cantidad = contarPalabrasConLetra(listaDePalabras, letra);
        System.out.println("Cantidad de palabras que comienzan con '" + letra + "': " + cantidad);
    }
}