package co.edu.unipiloto.interactiveapp;

import java.util.ArrayList;
import java.util.List;

public class tipoProyecto {
    List<String> getProyectos(String tipoProyecto) {
        List<String> proyectos = new ArrayList<>();

        switch (tipoProyecto) {
            case "Infraestructura":
                proyectos.add("Parques");
                proyectos.add("Zonas verdes");
                proyectos.add("Vías");
                proyectos.add("Transporte Público");
                proyectos.add("Puentes");
                proyectos.add("Ciclovías");
                proyectos.add("Infraestructura Deportiva");
                proyectos.add("Vivienda Social");
                break;
            case "Recreación":
                proyectos.add("Parques Temáticos");
                proyectos.add("Zonas de Juegos");
                proyectos.add("Senderos Peatonales");
                proyectos.add("Ciclovías Recreativas");
                proyectos.add("Parques Acuáticos");
                proyectos.add("Instalaciones Deportivas");
                proyectos.add("Centros Comunitarios");
                proyectos.add("Zonas Turísticas");
                break;
            case "Educación":
                proyectos.add("Escuelas y Colegios");
                proyectos.add("Bibliotecas Públicas");
                proyectos.add("Centros de Capacitación");
                proyectos.add("Laboratorios Tecnológicos");
                proyectos.add("Museos y Galerías");
                break;
            case "Salud":
                proyectos.add("Hospitales");
                proyectos.add("Centros de Salud Comunitaria");
                proyectos.add("Clínicas Especializadas");
                proyectos.add("Centros de Rehabilitación");
                proyectos.add("Áreas de Recreación Terapéutica");
                break;
            case "Cultura":
                proyectos.add("Teatros");
                proyectos.add("Auditorios");
                proyectos.add("Centros Culturales");
                proyectos.add("Espacios para Exposiciones");
                proyectos.add("Rutas Culturales");
                break;
            case "Desarrollo Social":
                proyectos.add("Centros de Atención a la Comunidad");
                proyectos.add("Proyectos de Vivienda Social");
                proyectos.add("Comedores Comunitarios");
                proyectos.add("Programas de Empleo Local");
                proyectos.add("Proyectos de Inclusión Social");
                break;
            case "Medio Ambiente":
                proyectos.add("Energía Renovable");
                proyectos.add("Sistemas de Gestión de Residuos");
                proyectos.add("Reciclaje y Compostaje");
                proyectos.add("Conservación de Áreas Naturales");
                proyectos.add("Restauración Ecológica");
                break;
            case "Tecnología e Innovación":
                proyectos.add("Redes de Internet Públicas");
                proyectos.add("Centros de Innovación");
                proyectos.add("Espacios de Co-Working");
                proyectos.add("Plataformas de E-Gobierno");
                break;
            default:
                proyectos.add("Error en la seleccion de proyecto");
                break;
        }
        return proyectos;
    }
}
