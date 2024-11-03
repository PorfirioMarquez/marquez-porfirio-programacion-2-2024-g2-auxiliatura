import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {
    private List<Objeto> objetos;

    public Inventario() {
        objetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public List<Objeto> filtrarObjetos(FiltroObjeto filtro) {
        return objetos.stream()
                      .filter(filtro::filtrar)
                      .collect(Collectors.toList());
    }
}