public class MainAutomovil
{
    public static void main(String[] args)
    {
        //Desde la "plantilla" ClaseIdentidadAutomovil instanciamos nuevos objetos desde el constructor sobrecargado
        //Primer Objeto
        ClaseIdentidadAutomovil Nissan = new ClaseIdentidadAutomovil("Tsuru","Nissan");

        //Una vez que el objeto está "creado" podemos asignar sus atributos.
        Nissan.setCilindrada(2.0f);
        Nissan.setColor(Color.NEGRO);
        Nissan.setTipo(TipoAuto.SEDAN);

        //Imprimimos el objeto volswagen con los atributos asignados en la plantilla ClaseIdentidadAutomovil
        System.out.println(Nissan.detalle());

        //Podemos crear cuantos objetos de la plantilla ClaseIdentidadAutomovil queramos.
        System.out.println("-----------\r\nNuevo auto\r\n-----------");
        ClaseIdentidadAutomovil Volkswagen = new ClaseIdentidadAutomovil();
        Volkswagen.setTipo(TipoAuto.COUPÉ);

        //Una vez que el objeto está "creado" podemos asignar sus atributos.
        Volkswagen.setNombre("Vocho");
        Volkswagen.setCilindrada(2.6f);
        Volkswagen.setColor(Color.AZUL);
        Volkswagen.setFabricante("VolksWagen");

        //Imprimimos el objeto volswagen con los atributos asignados en la plantilla ClaseIdentidadAutomovil
        System.out.println(Volkswagen.detalle());

        System.out.println(Volkswagen.acelerar(3000));
        System.out.println(Nissan.frenar());

        System.out.println(Volkswagen.acelerarFrenar(5000));
        System.out.println(Nissan.acelerarFrenar(6000));

        System.out.println("Kilometros por litro que consume el auto: "+ Nissan.consumoGas(300, 0.6f) + " litros de gasolina");
        System.out.println("Kilometros por litro que consume el auto: "+ Nissan.consumoGas(300, 60) + " litros de gasolina");
        
        TipoAuto tipoVolkswagen = Volkswagen.getTipo();
        System.out.println("tipo de auto Volkswagen: " + tipoVolkswagen.getNombre());
        System.out.println("tipoVolkswagen.getDescripcion() = " + tipoVolkswagen.getDescripcion());
    }
}
