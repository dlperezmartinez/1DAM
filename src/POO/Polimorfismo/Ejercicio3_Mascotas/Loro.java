package POO.Polimorfismo.Ejercicio3_Mascotas;

public class Loro extends Aves
{
    //ATRIBUTOS
    private String origen;
    private boolean habla;

    //CONSTRUCTOR
    public Loro() {
    }

    public Loro(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    //MÉTODOS
    @Override
    public String muestra()
    {
        return super.muestra() +
                "\nOrigen: " + origen +
                "\nHabla: " + habla;
    }

    @Override
    public String habla()
    {
        return "Ruaaaa!";
    }

    @Override
    public void volar()
    {
        System.out.println("El LORO sale volando...");
    }
}

