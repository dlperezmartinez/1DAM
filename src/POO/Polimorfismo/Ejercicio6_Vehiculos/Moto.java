package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Moto extends Terrestre
{
    //ATRIBUTOS
    private String color;

    //CONSTRUCTOR
    public Moto(String matricula, String modelo, int numRuedas, String color)
    {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " color " + color;
    }
}
