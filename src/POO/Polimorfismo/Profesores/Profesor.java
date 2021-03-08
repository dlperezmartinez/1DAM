package POO.Polimorfismo.Profesores;

public class Profesor extends Persona
{
    //ATRIBUTOS
    protected String asignatura;

    //CONSTRUCTOR
    public Profesor(String nombre, String DNI, String telefono, int edad, String asignatura) {
        super(nombre, DNI, telefono, edad);
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsignatura: " + asignatura;
    }
}
