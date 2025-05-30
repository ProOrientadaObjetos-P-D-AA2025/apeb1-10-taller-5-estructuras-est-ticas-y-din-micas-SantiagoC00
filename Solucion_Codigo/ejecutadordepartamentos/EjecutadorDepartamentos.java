package ejecutadordepartamentos;

import java.util.Scanner;

public class EjecutadorDepartamentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empr = new Empresa("TechSoluciones", "1234567890", "Quito");

        System.out.print("Ingrese la cantidad de departamentos: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del departamento: ");
            String nombre = sc.nextLine();

            System.out.print("Número de empleados: ");
            int empNum = sc.nextInt();

            System.out.print("Producción anual: ");
            double prod = sc.nextDouble();
            sc.nextLine();

            empr.agregarDepartamento(new Departamentos(nombre, empNum, prod));
        }

        empr.mostrarDepartamentos();
    }
    
}
