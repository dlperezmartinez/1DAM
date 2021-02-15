package POO.Herencia.EquipoFutbol;

public class Futbolista extends EquipoFutbol
{
    //ATRIBUTOS
    private int dorsal;
    private String demarcacion;

    //CONSTRUCTOR
    public Futbolista()
    {
        super();
    }

    public Futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion)
    {
        super(id, edad, nombre, apellidos);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //GETTERS Y SETTERS
    //getters

    //setters

    //METODOS

    //TOSTRING
}
