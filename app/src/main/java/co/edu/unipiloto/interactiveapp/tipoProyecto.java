package co.edu.unipiloto.interactiveapp;

import java.util.ArrayList;
import java.util.List;

public class tipoProyecto {
    List<String> getProyectos(String projectType) {
        List<String> proyectos = new ArrayList<>();
        if (projectType.equals("Infraestructura")) {
            proyectos.add("Parques");
            proyectos.add("Zonas verdes");
            proyectos.add("Vías");
        } else if (projectType.equals("Recreación")) {
            proyectos.add("Ciclovías");
            proyectos.add("Parques");
            proyectos.add("Centros deportivos");
        }
        return proyectos;
    }
}
