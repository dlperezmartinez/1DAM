package POO.Encapsulacion.Examenes;

import java.util.ArrayList;

public class ControlExamenes
{
    public static void main(String[] args)
    {
        //VARIABLES
        ArrayList<Examen> listaExamenes = new ArrayList<>();

        //INSTANCIAS
        Examen e1 = new Examen("INF4", "Programación", new Fecha(02, 02, 2021), new Hora(11, 20));
        Examen e2 = new Examen("INF1", "BBDD", new Fecha(22, 02, 2021), new Hora(11, 20));
        Examen e3 = new Examen("INF2", "Entornos", new Fecha(12, 02, 2021), new Hora(11, 20));
        Examen e4 = new Examen("INF3", "Sistemas", new Fecha(02, 03, 2021), new Hora(11, 20));
        Examen e5 = new Examen("INF5", "Lenguaje marcas", new Fecha(07, 04, 2021), new Hora(11, 20));

        //añadir a la lista
        listaExamenes.add(e1);
        listaExamenes.add(e2);
        listaExamenes.add(e3);
        listaExamenes.add(e4);
        listaExamenes.add(e5);

        //CONSULTA
        for (Examen n : listaExamenes)
        {
            System.out.println(n.toString());
        }
    }
}
