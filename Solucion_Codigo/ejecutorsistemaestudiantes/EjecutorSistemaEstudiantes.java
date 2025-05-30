package ejecutorsistemaestudiantes;

import java.util.Scanner;

public class EjecutorSistemaEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEs = sc.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        sc.nextLine();

        Estudiante estudiante = new Estudiante(nombreEs, edad);

        System.out.print("Ingrese el nombre de la materia: ");
        String nombre = sc.nextLine();

        float[] notas = new float[3];

        System.out.print("Ingrese la nota de ACD: ");
        notas[0] = sc.nextFloat();

        System.out.print("Ingrese la nota de APE: ");
        notas[1] = sc.nextFloat();

        System.out.print("Ingrese la nota de AA: ");
        notas[2] = sc.nextFloat();

        Materia materia = new Materia(nombre, notas);
        estudiante.AgregarMateria(materia);

        estudiante.Aprobacion(sc);
    }
    
}
