package POO.Polimorfismo.Profesores;

public class Persona
{
    //ATRIBUTOS
    protected String nombre, DNI, telefono;
    protected int edad;

    //CONSTRUCTOR
    public Persona(String nombre, String DNI, String telefono, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + nombre +
                "\nDNI: " + DNI +
                "\nTelefono: " + telefono +
                "\nEdad: " + edad;
    }
}
