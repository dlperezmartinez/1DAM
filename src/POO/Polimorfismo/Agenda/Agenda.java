package POO.Polimorfismo.Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda
{
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
        //Petición de nombre
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = in.next();

        //Validación previa
        for (Contacto n : contactos)
        {
            if (nombre.equals(n.getNombre())) //Busca el nombre en la agenda
            {
                contactos.remove(n);

                return true; //busqueda CON exito
            }
            else
            {
                return false; //busqueda SIN exito
            }
        }
        return false;
    }

    public boolean buscarContacto() //BUSCA UN CONTACTO
    {
        //Petición de nombre
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = in.next();

        //Validación previa
        for (Contacto n : contactos)
        {
            if (nombre.equals(n.getNombre())) //Busca el nombre en la agenda
            {
                return true; //busqueda CON exito
            }
            else
            {
                return false; //busqueda SIN exito
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
