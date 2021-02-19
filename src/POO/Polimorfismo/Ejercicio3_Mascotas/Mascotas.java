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

    //GETTERS Y SETTERS
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
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
