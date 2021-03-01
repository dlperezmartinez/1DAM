package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Terrestre extends Vehiculo
{
    //ATRIBUTOS
    protected final int numRuedas;

    //CONSTRUCTOR
    public Terrestre(String matricula, String modelo, int numRuedas)
    {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " numero de ruedas " + numRuedas;
    }
}
