package POO.Polimorfismo.Ejercicio3_Mascotas;

public class Canario extends Aves
{
    private String color;
    private boolean canta;

    //CONSTRUCTOR
    public Canario()
    {

    }

    public Canario(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela, String color, boolean canta)
    {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    //GETTERS Y SETTERS
    //getters
    public String getColor() {
        return color;
    }

    public boolean isCanta() {
        return canta;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    //MÉTODOS
    @Override
    public String muestra()
    {
        return super.muestra() +
                "\nColor: " + color +
                "\nCanta: " + canta;
    }

    @Override
    public String habla()
    {
        return "Pio!";
    }

    @Override
    public void volar()
    {
        System.out.println("El CANARIO sale volando...");
    }
}
