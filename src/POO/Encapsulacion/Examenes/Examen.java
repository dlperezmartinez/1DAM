package POO.Encapsulacion.Examenes;

public class Examen
{
    //ATRIBUTOS
    private String aula, asignatura;
    private Fecha fecha;
    private Hora hora;

    //CONSTRUCTOR
    public Examen(String aula, String asignatura, Fecha fecha, Hora hora)
    {
        this.aula = aula;
        this.asignatura = asignatura;
        this. fecha = fecha;
        this.hora = hora;
    }

    //GETTERS Y SETTERS
    //getters
    public String getAula() {
        return aula;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    //setters
    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    //METODOS

    @Override
    public String toString() {
        return "Examen{" +
                "aula='" + aula + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }
}
