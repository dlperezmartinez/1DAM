package POO.Herencia.Ejercicio2Empleados;

public class Operario extends Empleado
{
    //CONSTRUCTOR

    public Operario(String nombre) {
        super(nombre);
    }

    //PRINT
    @Override
    public String toString()
    {
        return super.toString() + "-> Operario";
    }
}
