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

    //GETTERS Y SETTERS
    //getters
    public String getColor() {
        return color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setPeloLargo(boolean peloLargo) {
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
