package Ficheros.CasoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MiniTerminal
{
    public static void main(String[] args) throws FileNotFoundException {
        //VARIABLES
        Scanner in = new Scanner(System.in);
        boolean exit = false; //Se utiliza para salir del programa.
        String input = ""; //Se utiliza para introducir los comandos al terminal.

        //INSTANCIAS
        MiniFileManager fileman = new MiniFileManager();

        //TERMINAL
        System.out.println("\n- MINI TERMINAL -\n");

        do
        {
            System.out.print(":~" + fileman.getRutaActual() + " $"); //Devuelve la ruta actual (Se usa como prompt).
            input = in.nextLine();

            switch (input)
            {
                case "pwd"://TODO


                    break;

                case "cd": //CD TODO


                    break;

                case "ls": //LS
                    fileman.ls(false);

                    break;

                case "ll": //LS PERO CON INFO
                    fileman.ls(true);

                    break;

                case "exit": //SALIR
                    System.out.println("\nSaliendo de la terminal...\n");
                    System.out.println("EXIT");
                    exit = true;

                    break;
            }
        }while(!exit);
    }
}
