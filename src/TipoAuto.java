public enum TipoAuto
{
    SEDAN("Sedan", "Auto Pequeño", 4),
    PICKUP("Camioneta", "Auto mediand", 2),
    COUPÉ("Coupé", "Auto Pequeño", 2),
    DEPORTIVO("Deportivo", "Auto Pequeño", 2);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAuto(String nombre, String descripcion, int numeroPuertas)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
