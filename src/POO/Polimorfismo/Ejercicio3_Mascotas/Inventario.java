package POO.Polimorfismo.Ejercicio3_Mascotas;

import java.util.List;
import java.util.ArrayList;

public class Inventario
{
    private ArrayList<Mascotas> mascotas = new ArrayList<>();

    //MÉTODOS
    public void insertarMascota(Mascotas m)
    {
        mascotas.add(m);
        System.out.println("\nMascota añadida...\n");
    }

    public void mostrarListaMascotas ()
    {
        System.out.println("\n-LISTA MASCOTAS-\n");

        for (Mascotas n : mascotas)
        {
            System.out.println(n.getNombre() + ": " + n.getClass().getSimpleName());
        }

    }

    public void mostarDatosMascota (Mascotas nombre)
    {
        System.out.println("\n-DATOS MASCOTA-\n");

        for (Mascotas n : mascotas)
        {
            if (n.equals(nombre))
            {
                System.out.println(n.muestra());
            }
        }
    }

    public void mostrarDatosTodasMascotas ()
    {
        System.out.println("\n-LISTA DATOS MASCOTAS-\n");

        for (Mascotas n : mascotas)
        {
            System.out.println(n.muestra());
        }
    }

    public void eliminarMascota(Mascotas nombre)
    {
        mascotas.remove(nombre);
        System.out.println("\nMascota eliminada...\n");
    }

}
