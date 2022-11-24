public enum Color
{
    ROJO("Rojo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("gris"),
    AMARILLO("Amarillo"),
    NEGRO("Negro"),
    NARANJA("Naranja");
    private final String color;
    Color(String color)
    {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
