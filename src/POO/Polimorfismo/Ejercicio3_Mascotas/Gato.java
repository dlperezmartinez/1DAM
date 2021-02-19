package POO.Polimorfismo.Ejercicio3_Mascotas;

public class Gato extends Mascotas
{
    //ATRIBUTOS
    private String color;
    private boolean peloLargo;

    //CONSTRUCTOR
    public Gato()
    {

    }

    public Gato(String nombre, String estado, String fechaNacimiento, int edad, String color, boolean peloLargo)
    {
        super(nombre, estado, fechaNacimiento, edad);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    //MÉTODOS
    @Override
    public String muestra()
    {
        return super.muestra() +
                "\nColor: " + color +
                "\nPelo largo: " + peloLargo;
    }

    @Override
    public String habla()
    {
        return "Miau miau...";
    }
}
