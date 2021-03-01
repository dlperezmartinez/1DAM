package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Acuatico extends Vehiculo
{
    //ATRIBUTOS
    protected final double metrosEslora;

    //CONSTRUCTOR
    public Acuatico(String matricula, String modelo, double metrosEslora)
    {
        super(matricula, modelo);
        this.metrosEslora = metrosEslora;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " metrosEslora " + metrosEslora;
    }
}
