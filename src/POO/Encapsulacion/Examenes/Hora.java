package POO.Encapsulacion.Examenes;

public class Hora
{
    //ATRIBUTOS
    private int hora;
    private int minutos;

    //CONSTRUCTOR
    public Hora (int hora, int minutos)
    {
        this.hora = hora;
        this.minutos = minutos;
    }

    //GETTERS Y SETTERS
    //getters
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    //setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    //METODOS

    @Override
    public String toString() {
        return hora + ":" + minutos ;
    }
}
