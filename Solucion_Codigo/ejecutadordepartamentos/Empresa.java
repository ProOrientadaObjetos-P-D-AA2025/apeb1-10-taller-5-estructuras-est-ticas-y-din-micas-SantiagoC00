package ejecutadordepartamentos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
     private String nombre;
    private String ruc;
    private String direccion;
    private List<Departamentos> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamentos d) {
        departamentos.add(d);
    }

    public void mostrarDepartamentos() {
        for (Departamentos d : departamentos) {
            System.out.println(d);
        }
    }
}
