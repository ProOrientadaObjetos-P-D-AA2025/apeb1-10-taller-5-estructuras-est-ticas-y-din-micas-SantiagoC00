package sistemadeventas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SistemadeVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Producto> entienda = new ArrayList<>();
        entienda.add(new Producto("Atun Isabel", (float)1.50, 100));
        entienda.add(new Producto("Atun Real", (float)1.40, 110));
        entienda.add(new Producto("Aceite Favorita", (float)4.00, 100));
        entienda.add(new Producto("Fideo Amacay", (float)2.50, 200));
        entienda.add(new Producto("Arroz  Paisanito", (float)3.80, 240));
        entienda.add(new Producto("Pasta Dental Colgate", (float)2.00, 150));
        entienda.add(new Producto("Cerveza Corona", (float)1.75, 450));
        entienda.add(new Producto("Caramelo Icapeb", (float)1.75, 100));
        CarritoDeCompras carrito = new CarritoDeCompras(entienda);
        int opc;
        do{
            opc = carrito.menu();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el Producto: ");
                    String nombreP = sc.nextLine();
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    carrito.AgregarProducto(nombreP, cantidad);
                    break;
                case 2:
                    carrito.MostrarDetalleCompra();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Ingrese el monto pagado: ");
                    float pagadoCliente = sc.nextFloat();
                    System.out.println("Ingrese el descuento:");
                    float descuento = sc.nextFloat();
                    sc.nextLine();
                    carrito.RealizarPago(pagadoCliente, descuento);
                    break;
                default:
                    System.out.println("Opcion Incorrecto");
                    break;
            }
        }while(opc != 0);
        
    
    
    
    
    
    
    
    
    
    }
     
    
}
        