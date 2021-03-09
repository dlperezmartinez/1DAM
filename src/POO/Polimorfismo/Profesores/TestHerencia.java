package POO.Polimorfismo.Profesores;

public class TestHerencia
{
    public static void main(String[] args)
    {
        //INSTANCIAS
        ListaProfesores lista1 = new ListaProfesores();

        //Generador de profes
        for (int i = 1; i < 10; i++)
        {
            lista1.añadirProfesor(new Profesor("Profe" + i, "DNI" + i, "Teléfono" + i, (int)(Math.random()*50+18), "Asignatura" + i));
        }

        lista1.listarProfesores();

    }
}
