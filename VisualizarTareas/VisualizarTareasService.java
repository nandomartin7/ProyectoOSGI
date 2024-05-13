package VisualizarTareas;

import GestionarTareas.Tarea;
import java.util.List;
public interface VisualizarTareasService {
    List<Tarea> listarTareas();
    Tarea buscarTarea(String id);
}
