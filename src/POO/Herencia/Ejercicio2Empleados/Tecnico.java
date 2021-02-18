package POO.Herencia.Ejercicio2Empleados;

public class Tecnico extends Operario
{
    //CONSTRUCTOR
    public Tecnico(String nombre) {
        super(nombre);
    }

    //PRINT
    @Override
    public String toString()
    {
        return super.toString() + "-> Tecnico";
    }
}
