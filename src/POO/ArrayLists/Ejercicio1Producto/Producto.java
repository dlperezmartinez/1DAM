package POO.ArrayLists.Ejercicio1Producto;

public class Producto
{
    //ATRIBUTOS
    String nombre;
    int cantidad;

    //CONSTRUCTOR
    public Producto(String nombre)
    {
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //METODOS

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
