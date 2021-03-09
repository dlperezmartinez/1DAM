package POO.Polimorfismo.Profesores;

public class ProfesorTitular extends Profesor
{
    //ATRIBUTOS
    private boolean esTitular;

    //CONSTRUCTOR
    public ProfesorTitular(String nombre, String DNI, String telefono, int edad, String asignatura) {
        super(nombre, DNI, telefono, edad, asignatura);
        this.esTitular = true;
    }
}
