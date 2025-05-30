package ejecutorfiscalia;

import java.util.ArrayList;
import java.util.List;

public class CasoCorrupto {
    String nombreCaso;
    int diasTranscurridos;
    String estado;
    List<PersonaCaso> implicados;

    public CasoCorrupto(String nombreCaso, int diasTranscurridos) {
        this.nombreCaso = nombreCaso;
        this.diasTranscurridos = diasTranscurridos;
        this.implicados = new ArrayList<>();
        actualizarEstado();
    }

    private void actualizarEstado() {
        if (diasTranscurridos > 14) estado = "Urgente";
        else if (diasTranscurridos > 7) estado = "Alerta";
        else estado = "Iniciado";
    }

    public void agregarPersona(PersonaCaso p) {
        implicados.add(p);
    }

    public void mostrarDetalles() {
        System.out.println("Caso: " + nombreCaso + " | Estado: " + estado);
        for (PersonaCaso p : implicados) {
            System.out.println(" - " + p.nombre + ": " + p.evaluacion());
        }
    }
}
