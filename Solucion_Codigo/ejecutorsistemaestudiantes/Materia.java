package ejecutorsistemaestudiantes;
public class Materia{
    private String nombre;
    private float[] notas;
   public Materia(String nombre, float[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public float obtenerPorcentaje() {
        float total = getTotal();
        return total / 10;
    }

    public float getTotal() {
        return notas[0] + notas[1] + notas[2];
    }
}
