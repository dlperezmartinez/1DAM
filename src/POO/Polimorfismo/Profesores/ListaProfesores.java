package POO.Polimorfismo.Profesores;

import java.util.ArrayList;

public class ListaProfesores
{
    ArrayList<Profesor> profesores;

    public ListaProfesores() {
        profesores = new ArrayList<>();
    }

    //MÉTODOS
    public void añadirProfesor(Profesor profesor)
    {
        profesores.add(profesor);
    }

    public void listarProfesores()
    {
        int i = 1;

        for (Profesor n : profesores)
        {
            System.out.println(i + "- " + n.getNombre());
            i++;
        }
    }


}
