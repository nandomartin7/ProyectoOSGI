package VisualizarTareas;

import GestionarTareas.GestionarTareasService;
import GestionarTareas.Tarea;

import java.util.List;

public class VisualizarTareasServiceImpl implements VisualizarTareasService{

    private GestionarTareasService gestionarTareasService;

    public VisualizarTareasServiceImpl(GestionarTareasService gestionarTareasService){
        this.gestionarTareasService = gestionarTareasService;
    }
    @Override
    public List<Tarea> listarTareas() {
        return gestionarTareasService.obtenerTareas();
    }

    @Override
    public Tarea buscarTarea(String id) {
        for (Tarea tarea : gestionarTareasService.obtenerTareas()) {
            if (tarea.getId().equals(id)) {
                return tarea;
            }
        }
        return null;
    }
}
