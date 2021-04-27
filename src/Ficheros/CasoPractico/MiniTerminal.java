package Ficheros.CasoPractico;

import java.io.*;
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
            input = in.nextLine(); //Envía en forma de String lo introducido en terminal.

            //MENÚ
            String[] orden = input.split(" "); //Recoge el input y lo parte

            switch (orden[0])
            {
                case "pwd"://TODO


                    break;

                case "cd": //CD TODO
                    try
                    {
                        fileman.cd(orden[1]);
                    } catch (FileNotFoundException e)
                    {
                        e.printStackTrace();
                    }

                    break;

                case "ls": //LS
                    try
                    {
                        fileman.ls(false);
                    }
                    catch (FileNotFoundException e)
                    {
                        e.printStackTrace();
                    }

                    break;

                case "ll": //LS PERO CON INFO
                    try
                    {
                        fileman.ls(true);
                    }
                    catch (FileNotFoundException e)
                    {
                        e.printStackTrace();
                    }

                    break;

                case "mkdir": //MKDIR
                    try
                    {
                        fileman.mkdir(orden[1]);
                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }

                    break;

                case "rm": //RM
                    try
                    {
                        fileman.rm(orden [1]);
                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }

                    break;

                case "exit": //SALIR
                    System.out.println("\nSaliendo de la terminal...\n");
                    //System.out.println("EXIT");
                    exit = true;

                    break;
            }
        }while(!exit);
    }
}