package POO.Herencia.EquipoFutbol;

public class Masajista extends EquipoFutbol
{
    //ATRIBUTOS
    private String titulacion;
    private int anosExperiencia;

    //CONSTRUCTOR
    public Masajista()
    {
        super();
    }

    public Masajista(int id, int edad, String nombre, String apellidos, String titulacion, int anosExperiencia)
    {
        super(id, edad, nombre, apellidos);

        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    //GETTERS Y SETTERS
    //getters

    //setters

    //METODOS

    //TOSTRING
}
