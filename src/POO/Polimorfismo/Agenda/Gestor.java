package POO.Polimorfismo.Agenda;

import java.util.Scanner;

public class Gestor
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //INSTANCIAS
        Agenda agenda1 = new Agenda();

        //VARIABLES
        String consinS = "CON"; //Se utiliza para cambiar el mensaje final dependiendo si el metodo devuelve true o false
        boolean consinB = true;
        String operacion = "";

        //OPERACIONES
        boolean continuar = true;
        while (continuar)
        {
            System.out.println("|-------------------AGENDA--------------------|");
            System.out.println("| LISTAR | BUSCAR | AÑADIR | ELIMINAR | SALIR |");
            System.out.println("|    1   |   2    |   3    |    4     |   5   |");
            System.out.println("|");
            System.out.println("V");
            int menu;
            menu = in.nextInt();

            switch (menu)
            {
                case 1: //LISTAR
                    operacion = "Listado ";

                    consinB = true;
                    agenda1.listar();
                    break;
                case 2: //BUSCAR
                    operacion = "Buscado ";

                    consinB = agenda1.buscarContacto();
                    break;
                case 3: //AÑADIR
                    operacion = "Añadido ";

                    consinB = agenda1.añadirContacto();
                    break;
                case 4: //ELIMINAR
                    operacion = "Eliminado ";

                    consinB = agenda1.eliminarContacto();
                    break;
                case 5: //SALIR
                    continuar = false;

                    System.out.println("\nCERRANDO AGENDA...\n");
                    break;
                default :
                    System.out.println("Introduce solo números del 1 al 5 inclusive.");
                    break;
            }

            if (consinB) //Se útiliza para determinar el mensaje del RESULTADO DE LA OPERACIÓN
            {
                consinS = "CON";
            }
            else
            {
                consinS = "SIN";
            }

            if (continuar)
            {
                System.out.println(operacion + consinS + " exito."); //RESULTADO DE LA OPERACIÓN
            }
        }
    }
}
