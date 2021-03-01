package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Avion extends Aereo
{
    //ATRIBUTOS
    private double tiempoVuelo;

    //CONSTRUCTOR
    public Avion(String matricula, String modelo, int numeroAsientos, double tiempoVuelo)
    {
        super(matricula, modelo, numeroAsientos);
        this.tiempoVuelo = tiempoVuelo;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " tiempoVuelo " + tiempoVuelo;
    }
}
