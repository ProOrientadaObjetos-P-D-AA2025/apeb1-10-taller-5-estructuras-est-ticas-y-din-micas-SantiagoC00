package ejecutorfiscalia;

import java.util.Scanner;

public class EjecutorFiscalia {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del caso: ");
        String nombreCaso = sc.nextLine();
        System.out.print("Días desde el inicio: ");
        int dias = sc.nextInt();
        sc.nextLine();

        CasoCorrupto caso = new CasoCorrupto(nombreCaso, dias);

        System.out.print("Cuántas personas implicadas: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre de la persona: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Ocupación: ");
            String ocupacion = sc.nextLine();
            System.out.print("Nivel de implicación (acusado/testigo/víctima): ");
            String implicacion = sc.nextLine();
            System.out.print("Sentencia en años (0 si no aplica): ");
            double sentencia = sc.nextDouble();
            System.out.print("¿Colabora? (true/false): ");
            boolean colabora = sc.nextBoolean();
            sc.nextLine();

            caso.agregarPersona(new PersonaCaso(nombre, edad, ocupacion, implicacion, sentencia, colabora));
        }
        caso.mostrarDetalles();
    }
    
}
