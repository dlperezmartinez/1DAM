package Excepciones.TryCatchFinally.Ejercicio06;

public class Gato
{
    //ATRIBUTOS
    private String nombre;
    private int edad;

    //CONSTRUCTOR
    public Gato(String nombre, int edad) throws Exception {

        if (nombre.length() < 3)
        {
            throw new Exception("El nombre debe tener al menos 3 carácteres.");
        }

        if (edad < 0)
        {
            throw new Exception("La edad no puede ser negativa");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) throws Exception {
        this.nombre = nombre;

        if (nombre.length() < 3)
        {
            throw new Exception("El nombre debe tener al menos 3 carácteres.");
        }
    }

    public void setEdad(int edad) throws Exception {
        this.edad = edad;

        if (edad < 0)
        {
            throw new Exception("La edad no puede ser negativa");
        }
    }

    //PRINT

    @Override
    public String toString() {
        return "Gato" + "nombre=" + nombre + "edad=" + edad;
    }
}
