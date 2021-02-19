package POO.Polimorfismo.Ejercicio3_Mascotas;

public abstract class Aves extends Mascotas
{
    //ATRIBUTOS
    protected String pico;
    protected boolean vuela;

    //CONSTRUCTOR
    public Aves()
    {

    }

    public Aves(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela)
    {
        super(nombre, estado, fechaNacimiento, edad);
        this.pico = pico;
        this.vuela = vuela;
    }

    //MÉTODOS

    @Override
    public String muestra()
    {
        return super.muestra() +
                "\nPico: " + pico +
                "\nVuela: " + vuela;
    }

    public abstract void volar();
}
