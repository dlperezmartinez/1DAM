package POO.ArrayLists.Ejercicio1Producto;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal
{
    public static void main(String[] args)
    {
        //INSTANCIAS
        Producto p1 = new Producto("Pepe");
        Producto p2 = new Producto("Jose");
        Producto p3 = new Producto("Paco");
        Producto p4 = new Producto("Eva");
        Producto p5 = new Producto("Lucía");

        ArrayList<Producto> array = new ArrayList<>();

        //OPERACIONES
        //add
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        array.add(p5);

        //visualizar
        Iterator<Producto> it = array.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //remove
        array.remove(0);
        array.remove(1);

        //insertar un nuevo objeto
        array.add(2,p1);

        //visualizar
        it = array.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //borrar todos
        while(it.hasNext())
        {
            it.remove();
        }

        //visualizar
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
