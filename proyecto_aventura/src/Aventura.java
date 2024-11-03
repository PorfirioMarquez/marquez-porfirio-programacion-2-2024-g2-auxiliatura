// src/Aventura.java
import java.util.ArrayList;
import java.util.List;

public class Aventura {
    private List<Tarea> tareas;

    public Aventura() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void iniciar() {
        for (Tarea tarea : tareas) {
            tarea.ejecutar();
        }
    }
}