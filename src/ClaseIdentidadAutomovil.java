public class ClaseIdentidadAutomovil
{
    //Creamos los atributos que formarán al objeto
   private String nombre;
   private String fabricante;
   private Color color=Color.GRIS;
   private Float cilindrada;
   private Float capacidadTanque = 40.0f;
   private TipoAuto tipo;
   //Creamos un constructor que no recibe parámetros
    public ClaseIdentidadAutomovil()
    {
    }
    //Sobrecargamos el constructor para que reciba dos parámetros(atributos)
    public ClaseIdentidadAutomovil(String nombre, String fabricante)
    {
        this.fabricante=nombre;
        this.nombre=fabricante;
    }
    //Sobrecargamos el constructor para que reciba tres parámetros(atributos)
    public ClaseIdentidadAutomovil(String nombre, String fabricante, Color color)
    {
        this(nombre, fabricante);
        this.color= color;
    }
    //Sobrecargamos el constructor para que reciba cuatro parámetros(atributos)
    public ClaseIdentidadAutomovil(String nombre, String fabricante, Color color, Float cilindrada)
    {
        this(nombre, fabricante, color);
        this.cilindrada=cilindrada;
    }
    //Sobrecargamos el constructor para que reciba los cinco parámetros(atributos)
    public ClaseIdentidadAutomovil(String nombre, String fabricante, Color color, Float cilindrada, Float capacidadTanque)
    {
        this(nombre, fabricante,color, cilindrada);
        this.capacidadTanque=capacidadTanque;
    }

    //Aplicamos el encapsulamiento sobre los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Float getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Float capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    //Creamos un método para imprimir asignar los atributos a los objetos
    public String detalle()
    {
        return "Nombre del auto: "+ this.nombre +
                "\nColor del auto: "+ this.color.getColor() +
                "\nTipo de auto: " + this.getTipo().getNombre()+
                "\ncilindrada del auto: "+ this.cilindrada +
                "\nFabricante del auto: "+ this.fabricante;
    }
    //Creamos métodos que reciban o no parámetros o argumentos
    public String acelerar(int rpm)
    {
        return "El auto " + this.nombre + " Está acelerando a " + rpm + " revoluciones";
    }
    public String frenar()
    {
        return "El auto del fabricante " + this. fabricante + " está frenando!";
    }
    //Creamos un método que realice las dos funciones anteriores
    public String acelerarFrenar(int rpm)
    {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return  this.acelerar(rpm) + "\n" + this.frenar();
    }
    //Creamos un método para calcular el consumo de gasolina
    public Float consumoGas(int km, float porcentajeGasolina)
    {
        return km/(capacidadTanque*porcentajeGasolina);
    }
    //Sobrecargamos el método
    public Float consumoGas(int km, int porcentajeGasolina)
    {
        return km/(capacidadTanque*(porcentajeGasolina/100f));
    }
}
