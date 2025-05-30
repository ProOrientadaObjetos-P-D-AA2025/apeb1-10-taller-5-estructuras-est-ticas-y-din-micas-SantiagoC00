package sistemadeventas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CarritoDeCompras {
    //se creo una lista utilizada en el ciclo anterior en cual tiene un inventario
    // ya que pide que verificar si hay en la tienda
    private List<Producto> Compra = new ArrayList<>();
    private List<Producto> productoenTienda;
    Scanner sc = new Scanner(System.in);
    public CarritoDeCompras(List<Producto> productoenTienda){
        this.productoenTienda = productoenTienda;
    
    }
    
    public void AgregarProducto(String nombreP, int cantidad){
        boolean bandera = false;
        for(Producto p : productoenTienda){
            if (p.getNombreP().equals(nombreP) && p.getCantidad() >= cantidad){
                bandera = true;
                Producto nuevo = new Producto(p.getNombreP(), p.getPrecioP(), cantidad);
                Compra.add(nuevo);
                System.out.println("Producto Agregado");
            }else{
                System.out.println("Error... Producto no disponible o sin Stok");
            }
            return;
        }
        
    }
    public float CalcularTotal(){
        float total = 0;
        for(Producto p : Compra){
            total += p.getPrecioP()*p.getCantidad();
        }
        return total;
    }
    public void RealizarPago(float pagadoCliente, float descuento){
        float total1 = CalcularTotal();
        if (total1 > 1000){
            total1 -=(total1 * descuento / 100);
        }
        if(pagadoCliente >= total1){
            System.out.println("Gracias por comprar");
            for(Producto enCarrito : Compra ){
                for(Producto enTienda : Compra ){
                    if(enCarrito.getNombreP().equals(enTienda.getNombreP())){
                        enTienda.setCantidad(enTienda.getCantidad() - enCarrito.getCantidad());
                    }
                }      
            }        
        }else{
            System.out.println("Dinero Faltante: " + (total1 - pagadoCliente));
        }
    }
    public void MostrarDetalleCompra(){
        for(Producto p : Compra){
            System.out.println("\nDETALLE DE LO COMPRADO");
            System.out.println("\nProducto: " + p.getNombreP() + "\nCantidad: " + p.getCantidad());
        }
    }
    public int menu(){
        System.out.println("\nMenu");
        System.out.println("------");
        System.out.println("[1] Agregar Producto");
        System.out.println("[2] Detalle de compra");
        System.out.println("[3] Realizar Pago");
        System.out.println("[0] Salir");
        System.out.println("Seleccion la opcion: ");
        return sc.nextInt();
    }
   
   
   /* public static void leerInventario(){
        File archivo = new File("C:\\Users\\theoc\\Documents\\NetBeansProjects\\SistemadeVentas\\src\\sistemadeventas\\Inventario.txt");
        if (!archivo.exists()) {
            System.out.println("El archivo de entrada no existe.");
            return;
        }
        try(Scanner entrada = new Scanner(archivo)){
            while(entrada.hasNextLine()){
                String[] partes = entrada.nextLine().split(":");
                Inventario.add(partes);
            }
        }catch (FileNotFoundException e){
            System.out.println("\n Error... Archivo no encontrado.");
        }catch (Exception e){
            System.out.println("\nError... " + e.getMessage());
        }
    }
    */
}

