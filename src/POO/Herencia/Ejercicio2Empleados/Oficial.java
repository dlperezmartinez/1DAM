package POO.Herencia.Ejercicio2Empleados;

public class Oficial extends Operario
{
    //CONSTRUCTOR
    public Oficial(String nombre) {
        super(nombre);
    }

    //PRINT
    @Override
    public String toString()
    {
        return super.toString() + "-> Oficial";
    }
}
