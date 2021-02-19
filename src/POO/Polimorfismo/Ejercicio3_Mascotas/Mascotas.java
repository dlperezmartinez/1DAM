package POO.Polimorfismo.Ejercicio3_Mascotas;

public abstract class Mascotas
{
    //ATRIBUTOS
    protected String nombre, estado, fechaNacimiento;
    protected int edad;

    //CONSTRUCTOR
    public Mascotas()
    {

    }

    public Mascotas(String nombre, String estado, String fechaNacimiento, int edad)
    {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    //MÉTODOS
    public String muestra()
    {
        return  "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nEstado: " + estado +
                "\nFecha de nacimiento: " + fechaNacimiento;
    }

    public void cumpleaños()
    {
        System.out.println("Cumpleaños: " + fechaNacimiento);
    }

    public void morir (boolean morir)
    {
        if (morir)
        {
            this.estado = "Muerto";
        }
        else
        {
            this.estado = "Vivo";
        }
    }

    public abstract String habla();
}
