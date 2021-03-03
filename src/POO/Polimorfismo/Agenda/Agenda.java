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
        System.out.print("Introduce el nombre: ");
        String nombre = in.next();

        System.out.print("Introduce el número de teléfono: ");
        String telefono = in.next();

        //Validación previa
        boolean esta = true;
        for (Contacto n : contactos)
        {//TODO tengo que hacer que este metodo no valide, sino que llame al metodo buscar para ello
            if (nombre.equals(n.getNombre()))
            {
                esta = false;
            }
            else
            {
                System.out.println("debug");
                contactos.add(new Contacto(nombre, telefono)); //Crea el contacto y lo añade a la agenda
            }
        }
        return esta;
    }

    public boolean eliminarContacto() //ELIMINA UN CONTACTO
    {
        boolean ok;
        //Busca el contacto
        boolean existe = buscarContacto();

        if (existe) //Borra el contacto
        {
            for (Contacto n : contactos)
            {
                contactos.remove(gestor.getNombre()); //Busca el contacto y lo elimina
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
        System.out.println("\n-LISTA DE CONTACTOS-");

        int i = 1;

        for (Contacto n : contactos)
        {
            System.out.println("\n" + i + "- " + n.toString());
            i++;
        }
    }




}
