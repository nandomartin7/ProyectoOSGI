package GestionarTareas;

import java.util.List;

public interface GestionarTareasService {
    void crearTarea(Tarea tarea);
    void  eliminarTarea(String id);
    void actualizarTarea(Tarea tarea);

    List<Tarea> obtenerTareas();
}
