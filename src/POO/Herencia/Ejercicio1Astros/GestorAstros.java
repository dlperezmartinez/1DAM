package POO.Herencia.Ejercicio1Astros;

import java.util.Scanner;
import java.util.ArrayList;

public class GestorAstros
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);
        //ARRAYLIST
        ArrayList<Astros> astros = new ArrayList<>();

        //INSTANCIAS
        Planetas Jupiter = new Planetas("Jupiter", 32, 43, 50, 23, 32, 43, true);
        Planetas Tierra = new Planetas("Tierra", 21, 32, 7.8, 30, 32 ,32, true);
        Planetas Marte = new Planetas("Marte", 21, 32, 23, 30, 32 ,32, false);
        Satelites Luna = new Satelites("Luna", 321, 34, 2, 34, 43, 43, Tierra);
        Satelites Europa = new Satelites("Europa", 32, 32, 32, 23, 43, 43, Jupiter);
        Satelites cosa = new Satelites("Cosa", 43, 43, 43, 43 ,54, 65, Jupiter);

        //add
        astros.add(Tierra);
        astros.add(Marte);
        astros.add(Luna);
        astros.add(Jupiter);
        astros.add(Europa);
        astros.add(cosa);

        Jupiter.satelites.add(cosa);
        Jupiter.satelites.add(Europa);
        Tierra.satelites.add(Luna);

        //OPERACIONES
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("| LISTAR ASTROS | INFO ASTRO |");
            System.out.println("|       1       |      2     |");

            int menu = in.nextInt();
            switch (menu)
            {
                case 1: //LISTAR ASTROS
                    for (Astros n : astros)
                    {
                        System.out.println(n.getNombre());
                    }

                    break;
                case 2: //INFO ASTRO
                    System.out.print("Introduce el nombre del astro que quieres consultar: ");
                    String nombre = in.next();

                    for (Astros n : astros)
                    {
                        if (n.getNombre().equals(nombre))
                        {
                            n.print();
                        }
                    }

                    break;
                /*case 3:
                    System.out.print("Introduce el nombre del PLANETA al que quieres agregar un SATELITE: ");
                    String nombrePlaneta= in.next();

                    for (Astros n : astros)
                    {
                        if (n.getNombre().equals(nombrePlaneta)) //Comprueba si el planeta existe en la lista
                        {
                            System.out.print("Ahora introduce el  SATELITE: ");
                            String nombreSatelite = in.next();

                            n.agregarSatelite(nombreSatelite);
                        }
                        else
                        {
                            System.out.println("No figura ese planeta...");
                        }
                    }




                    break;*/
            }
        }

    }
}
