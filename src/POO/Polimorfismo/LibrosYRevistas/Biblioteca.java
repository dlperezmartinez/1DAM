package POO.Polimorfismo.LibrosYRevistas;

import java.util.ArrayList;

public class Biblioteca
{
    public static void main(String[] args)
    {
        ArrayList<Articulo> biblioteca = new ArrayList<>();

        //INSTANCIAS
        Libro libroManual = new Libro("M0", "Manual", "111111");
        biblioteca.add(libroManual);

        for (int i = 0; i < 4; i++)
        {
            biblioteca.add(new Libro("Libro" + i, "Titulo" + i, "Año " + Math.random()*100+0));
        }

        for (int i = 0; i < 4; i++)
        {
            biblioteca.add(new Revista("Revista" + i, "Nombre" + i, "Día " + Math.random()*100+0, i));
        }

        //PRINTS
        for (Articulo n : biblioteca)
        {
            System.out.println(n.toString());
        }

        //Prestar un libro
        System.out.println("\nPrestar un libro");
        libroManual.prestado();
        libroManual.prestar();
        libroManual.prestado();
        libroManual.retornar();
        libroManual.prestado();
    }
}
