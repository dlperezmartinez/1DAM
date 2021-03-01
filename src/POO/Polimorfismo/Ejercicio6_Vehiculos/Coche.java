package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Coche extends Terrestre
{
    //ATRIBUTOS
    private boolean aireAcondicionado;

    //CONSTRUCTOR
    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado)
    {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " aireAcondicionado " + aireAcondicionado;
    }
}
