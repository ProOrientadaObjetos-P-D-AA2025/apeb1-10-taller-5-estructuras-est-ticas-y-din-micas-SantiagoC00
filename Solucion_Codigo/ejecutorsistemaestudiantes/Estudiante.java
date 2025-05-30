package ejecutorsistemaestudiantes;

import java.util.Scanner;

public class Estudiante {
     private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void AgregarMateria(Materia materia) {
        this.materia = materia;
    }

    public void Aprobacion (Scanner sc) {
        if (materia == null) {
            System.out.println("El estudiante no tiene una materia registrada.");
            return;
        }

        float porcentaje = materia.obtenerPorcentaje();

        if (porcentaje >= 0.7) {
            System.out.println(nombre + " ha aprobado la materia " + materia.getNombre() + " con un porcentaje de " + (porcentaje * 100) + "%.");
        } else {
            System.out.println(nombre + " no ha aprobado la materia " + materia.getNombre());
            System.out.println("Debe rendir un examen de recuperacion ");

            System.out.print("Ingrese la nota del examen de recuperacion: ");
            float examenRecuperacion = sc.nextFloat();

            float notaAcumulada = materia.getTotal() * (float)0.6 + examenRecuperacion;

            if (notaAcumulada >= (float)7.0) {
                System.out.println("Aprobado despues de la recuperacion " + notaAcumulada);
            } else {
                System.out.println("No aprobo: " + notaAcumulada);
            }
        }
    }
    
}
    
