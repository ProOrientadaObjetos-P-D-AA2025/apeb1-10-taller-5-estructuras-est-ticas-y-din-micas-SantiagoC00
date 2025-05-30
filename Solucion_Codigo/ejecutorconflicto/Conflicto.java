
package ejecutorconflicto;

import java.util.ArrayList;
import java.util.List;

public class Conflicto {
    String nombre;
    List<String> paises;
    List<EventoConflicto> eventos;
    String estado;

    public Conflicto(String nombre, List<String> paises) {
        this.nombre = nombre;
        this.paises = paises;
        this.eventos = new ArrayList<>();
        this.estado = "Activo";
    }

    public void agregarEvento(EventoConflicto evento) {
        eventos.add(evento);
        evaluarEstado();
    }

    private void evaluarEstado() {
        int batallas = 0;
        int batallasPrimerMundo = 0;
        int paisesTotal = paises.size();

        for (EventoConflicto e : eventos) {
            if (e.esBatalla) {
                batallas++;
                if (e.usaNuclear) batallasPrimerMundo++;
            }
        }

        double porcentaje = (batallas * 1.0 / paisesTotal);
        if (porcentaje >= 0.5 || batallasPrimerMundo > 0) {
            estado = "Guerra Mundial";
        } else if (porcentaje >= 0.3) {
            estado = "Convocar ONU";
        }
    }

    public void mostrarResumen() {
        System.out.println("Conflicto: " + nombre);
        System.out.println("Estado: " + estado);
        for (EventoConflicto e : eventos) {
            System.out.println(" - Evento: " + e.nombre + " | " + e.fecha + " | " + e.ubicacion);
        }
    }
}