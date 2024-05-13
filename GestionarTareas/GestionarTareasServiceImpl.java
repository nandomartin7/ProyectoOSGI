package GestionarTareas;

import java.util.ArrayList;
import java.util.List;

public class GestionarTareasServiceImpl implements GestionarTareasService{
    private List<Tarea> tareas = new ArrayList<>();

    @Override
    public void crearTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public void eliminarTarea(String id) {
        tareas.removeIf(tarea -> tarea.getId().equals(id));
    }

    @Override
    public void actualizarTarea(Tarea tareaActualizada) {
        for (int i = 0; i< tareas.size(); i++){
            if (tareas.get(i).getId().equals(tareaActualizada.getId())){
                tareas.set(i,tareaActualizada);
                break;
            }
        }
    }

    @Override
    public List<Tarea> obtenerTareas() {
        return new ArrayList<>(tareas);
    }
}
