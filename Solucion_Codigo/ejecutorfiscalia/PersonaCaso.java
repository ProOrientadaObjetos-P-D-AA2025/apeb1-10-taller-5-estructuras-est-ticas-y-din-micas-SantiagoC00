package ejecutorfiscalia;
class PersonaCaso {
    String nombre;
    int edad;
    String ocupacion;
    String implicacion;
    boolean colabora;
    double sentencia;

    public PersonaCaso(String nombre, int edad, String ocupacion, String implicacion, double sentencia, boolean colabora) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.implicacion = implicacion;
        this.sentencia = sentencia;
        this.colabora = colabora;
    }

    public String evaluacion() {
        if (implicacion.equals("acusado") && colabora) {
            if (sentencia < 1) {
                return nombre + " puede pagar fianza (máx 50% del daño económico).";
            }
            return nombre + " se acoge a reducción de pena por colaboración.";
        }
        return nombre + " sin beneficios legales.";
    }
}


