package ejecutorconflicto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjecutorConflicto {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del conflicto: ");
        String nombre = sc.nextLine();

        List<String> paises = new ArrayList<>();
        System.out.print("Cantidad de países involucrados: ");
        int total = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.print("País " + (i + 1) + ": ");
            paises.add(sc.nextLine());
        }

        Conflicto conflicto = new Conflicto(nombre, paises);

        System.out.print("Cantidad de eventos: ");
        int eventos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < eventos; i++) {
            System.out.print("Nombre del evento: ");
            String nombreEv = sc.nextLine();
            System.out.print("Fecha: ");
            String fecha = sc.nextLine();
            System.out.print("Ubicación: ");
            String ubicacion = sc.nextLine();
            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();
            System.out.print("¿Fue batalla? (true/false): ");
            boolean esBatalla = sc.nextBoolean();
            System.out.print("¿Usó armas nucleares? (true/false): ");
            boolean nuclear = sc.nextBoolean();
            System.out.print("% de bajas: ");
            double bajas = sc.nextDouble();
            sc.nextLine();

            conflicto.agregarEvento(new EventoConflicto(nombreEv, fecha, ubicacion, descripcion, esBatalla, nuclear, bajas));
        }

        conflicto.mostrarResumen();   
    }
    
}
