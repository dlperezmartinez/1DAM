package POO.Polimorfismo.Ejercicio6_Vehiculos;

public class Barco extends Acuatico
{
    //ATRIBUTOS
    private boolean motor;

    //CONSTRUCTOR
    public Barco(String matricula, String modelo, double metrosEslora, boolean motor)
    {
        super(matricula, modelo, metrosEslora);
        this.motor = motor;
    }

    //TOSTRING
    @Override
    public String toString()
    {
        return super.toString() + " motor " + motor;
    }
}
