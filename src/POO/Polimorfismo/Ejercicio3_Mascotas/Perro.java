package POO.Polimorfismo.Ejercicio3_Mascotas;

public class Perro extends Mascotas
{
    //ATRIBUTOS
    private String raza;
    private boolean pulgas;

    //CONSTRUCTOR
    public Perro()
    {

    }

    public Perro(String nombre, String estado, String fechaNacimiento, int edad, String raza, boolean pulgas)
    {
        super(nombre, estado, fechaNacimiento, edad);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //MÉTODOS
    @Override
    public String muestra()
    {
        return super.muestra() +
                "\nRaza: " + raza +
                "\nPulgas: " + pulgas;
    }

    @Override
    public String habla()
    {
        return "Wuf wuf!";
    }
}
