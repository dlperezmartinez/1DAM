package POO.Herencia.Ejercicio2_Empleados;

public class Directivo extends Empleado
{
    //CONSTRUCTOR

    public Directivo(String nombre) {
        super(nombre);
    }

    //PRINT
    @Override
    public String toString()
    {
        return super.toString() + "-> Directivo";
    }
}
