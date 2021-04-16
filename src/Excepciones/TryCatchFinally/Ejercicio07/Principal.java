package Excepciones.TryCatchFinally.Ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        boolean continuar = true; int menu; //Se utiliza para el menu

        //INSTANCIAS
        System.out.println("\n-REGISTRADOR DE GATOS-\n");

        //MENU
        while (continuar)
        {
            System.out.println("|--------------------------MENU--------------------------|");
            System.out.println("|                                                        |");
            System.out.println("| REGISTRAR GATO | MODIFICAR GATO | LISTAR GATOS | SALIR |");
            System.out.println("|        1       |        2       |      3       |   4   |");
            System.out.println("|");
            System.out.println("V");
            System.out.println("");
            menu = in.nextInt(); //Pide un número para la selección del menú

            switch (menu) {
                case 1:
                    gatos.add(new Gato(in.next()))//TODO esto

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4: //SALIR
                    System.out.println("Gracias por utilizar el REGISTRADOR DE GATOS");
                    continuar = false;

                    break;
                default:
                    System.out.println("Por favor, introduce solo numeros entre 1 y 4 inclusive, gracias.");
                    break;
            }
        }
    }
}
