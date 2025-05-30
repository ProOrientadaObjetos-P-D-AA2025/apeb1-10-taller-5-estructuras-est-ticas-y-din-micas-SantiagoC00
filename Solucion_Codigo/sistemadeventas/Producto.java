package sistemadeventas;

public class Producto{
    private String nombreP;
    private float PrecioP;
    private int cantidad;
    
    
    public Producto(String nombreP, float PrecioP, int cantidad){
        this.nombreP = nombreP;
        this.PrecioP = PrecioP;
        this.cantidad= cantidad;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public float getPrecioP() {
        return PrecioP;
    }

    public void setPrecioP(float PrecioP) {
        this.PrecioP = PrecioP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

