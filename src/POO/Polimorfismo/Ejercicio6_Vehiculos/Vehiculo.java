package POO.Polimorfismo.Ejercicio6_Vehiculos;

public abstract class Vehiculo
{
    //ATRIBUTOS
    protected final String matricula, modelo;

    //CONSTRUCTOR
    public Vehiculo(String matricula, String modelo)
    {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getMatricula() {
        return matricula;
    }

    //MÉTODOS

    //TOSTRING
    @Override
    public String toString()
    {
        return "matricula " + matricula + " modelo " + modelo;
    }
}
