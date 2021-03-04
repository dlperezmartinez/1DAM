package POO.Polimorfismo.Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda
{
    //INSTANCIAS
    Gestor gestor = new Gestor();

    //SCANNER
    Scanner in = new Scanner(System.in);

    ArrayList<Contacto> contactos;

    //CONSTRUCTOR
    public Agenda()
    {
        contactos = new ArrayList<>();
    }

    /*public Agenda(ArrayList<Contacto> contactos)
    {
        this.contactos = contactos;
    }*/

    //MÉTODOS
    public boolean añadirContacto() //AÑADE UN CONTACTO
    {
        boolean ok;

        //Busca el contacto
        boolean existe = buscarContacto();

        if (existe)
        {
            System.out.println("Ese nombre ya existe...");

            ok = false;
        }
        else
        {
            System.out.print("Introduce número: ");
            String telefono = in.next();

            contactos.add(new Contacto(gestor.getNombre(), telefono));

            ok = true;
        }

        return ok;
    }

    public boolean eliminarContacto() //ELIMINA UN CONTACTO
    {
        boolean ok;

        //Busca el contacto
        boolean existe = buscarContacto();

        if (existe) //Borra el contacto
        {
            for (Contacto n : contactos) //Busca el contacto y lo elimina
            {
                if (contactos.equals(gestor.getNombre())) ;
                {
                    contactos.remove(n);
                }
            }

            ok = true; //Se ha eliminado CON éxito
        }
        else
        {
            ok = false; //Se ha eliminado SIN éxito
        }

        return ok;
    }

    public boolean buscarContacto() //BUSCA UN CONTACTO
    {
        //Petición de nombre
        gestor.solicitarNombre();

        //Validación
        for (Contacto n : contactos)
        {
            if (gestor.getNombre().equals(n.getNombre())) //Busca el nombre en la agenda
            {
                return true; //búsqueda CON exito
            }
            else
            {
                return false; //búsqueda SIN exito
            }
        }
        return false;
    }

    public void listar()
    {
        System.out.println("\n-LISTA DE CONTACTOS-\n");

        int i = 1;

        for (Contacto n : contactos)
        {
            System.out.println("" + i + "- " + n.toString());
            i++;
        }
    }




}
