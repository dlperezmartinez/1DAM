package POO.Herencia.Ejercicio2_Empleados;

public class Empleado
{
    //ATRIBUTOS
    protected String nombre;

    //CONSTRUCTOR
    public Empleado()
    {

    }

    public Empleado(String nombre)
    {
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS
    //getters
    public String getNombre() {
        return nombre;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //PRINT

    @Override
    public String toString()
    {
        return "Empleado " + nombre;
    }
}
