package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Aereo extends Vehiculo
{
    //ATRIBUTOS
    protected final int numeroAsientos;

    //CONSTRUCTOR
    public Aereo(String matricula, String modelo, int numeroAsientos)
    {
        super(matricula, modelo);
        this.numeroAsientos = numeroAsientos;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " numeroAsientos " + numeroAsientos;
    }
}
