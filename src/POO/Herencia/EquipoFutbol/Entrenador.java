package POO.Herencia.EquipoFutbol;

public class Entrenador extends EquipoFutbol
{
    //ATRIBUTOS
    private String federacion;

    //CONSTRUCTOR
    public Entrenador()
    {
        super();
    }

    public Entrenador(int id, int edad, String nombre, String apellidos, String federacion)
    {
        super(id, edad, nombre, apellidos);

        this.federacion = federacion;
    }

    //GETTERS Y SETTERS
    //getters

    //setters

    //METODOS

    //TOSTRING
}
