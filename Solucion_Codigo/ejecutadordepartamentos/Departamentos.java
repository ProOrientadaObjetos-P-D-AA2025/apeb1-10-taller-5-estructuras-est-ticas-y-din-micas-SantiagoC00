 
package ejecutadordepartamentos;


public class Departamentos {
    private String nombre;
    private int empleados;
    private double produccion;
    private char categoria;

    public Departamentos(String nombre, int empleados, double produccion) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.produccion = produccion;
        asignarCategoria();
    }

    private void asignarCategoria() {
        if (empleados > 20 && produccion > 1000000) {
            categoria = 'A';
        } else if (empleados >= 20 && produccion >= 1000000) {
            categoria = 'B';
        } else if (empleados >= 10 && produccion >= 500000) {
            categoria = 'C';
        } else {
            categoria = 'N'; // No categorizado
        }
    }
    public String toString() {
        return "\nDepartamento: " + nombre + "\nEmpleados: " + empleados + "\nProducción: " 
                + produccion + "\nCategoría: " + categoria;
    }
}
