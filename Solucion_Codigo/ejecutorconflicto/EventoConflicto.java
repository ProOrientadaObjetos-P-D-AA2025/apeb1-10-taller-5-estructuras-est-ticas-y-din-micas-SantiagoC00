package ejecutorconflicto;


public class EventoConflicto {
    String nombre;
    String fecha;
    String ubicacion;
    String descripcion;
    boolean esBatalla;
    boolean usaNuclear;
    double bajas;

    public EventoConflicto(String nombre, String fecha, String ubicacion, String descripcion, boolean esBatalla, boolean usaNuclear, double bajas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.esBatalla = esBatalla;
        this.usaNuclear = usaNuclear;
        this.bajas = bajas;
    }
}
