import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar objetos al inventario
        inventario.agregarObjeto(new Objeto("Espada", 3.5));
        inventario.agregarObjeto(new Objeto("Escudo", 5.0));
        inventario.agregarObjeto(new Objeto("Poción", 0.5));
        inventario.agregarObjeto(new Objeto("Armadura", 7.0));

        // Filtrar objetos con peso menor a 4
        List<Objeto> objetosLigeros = inventario.filtrarObjetos(objeto -> objeto.getPeso() < 4);
        System.out.println("Objetos ligeros (peso < 4): " + objetosLigeros);

        // Filtrar objetos con nombre que contiene "a"
        List<Objeto> objetosConA = inventario.filtrarObjetos(objeto -> objeto.getNombre().contains("a"));
        System.out.println("Objetos con 'a' en el nombre: " + objetosConA);

        // Filtrar objetos con peso mayor a 5
        List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() > 5);
        System.out.println("Objetos pesados (peso > 5): " + objetosPesados);
    }
}