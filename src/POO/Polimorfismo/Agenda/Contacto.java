package POO.Polimorfismo.Agenda;

public class Contacto
{
    //ATRIBUTOS
    private String nombre, telefono;

    //CONSTRUCTOR
    public Contacto(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    //TOSTRING

    @Override
    public String toString() {
        return nombre + " " + telefono;
    }
}
