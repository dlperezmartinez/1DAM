package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Helicoptero extends Aereo
{
    //ATRIBUTOS
    private int numeroHelices;

    //CONSTRUCTOR
    public Helicoptero(String matricula, String modelo, int numeroAsientos, int numeroHelices)
    {
        super(matricula, modelo, numeroAsientos);
        this.numeroHelices = numeroHelices;
    }

    //TOOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " numeroHelices " + numeroHelices;
    }
}
