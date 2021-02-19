package POO.Herencia.Ejercicio2_Empleados;

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
