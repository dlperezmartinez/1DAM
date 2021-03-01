package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Submarino extends Acuatico
{
    //ATRIBUTOS
    private boolean profundidadMaxima;

    //CONSTRUCTOR
    public Submarino(String matricula, String modelo, double metrosEslora, boolean profundidadMaxima)
    {
        super(matricula, modelo, metrosEslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " profundidadMaxima " + profundidadMaxima;
    }
}
