package Ficheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        do
        {
            System.out.print("Introduce ruta: ");
            String ruta = in.nextLine();

            try
            {
                File file = new File(ruta);

                //Muestra el nombre del directorio o archivo
                System.out.println("Nombre: " + file.getName());

                //Muestra los nombres de los directorios o archivos que existen dentro del directorio

                File[] files = file.listFiles();

                System.out.println("LISTA");
                for (File n: files)
                {
                    if (n.isDirectory())
                    {
                        System.out.println("[*] " + n);
                    }
                    else if (n.isFile())
                    {
                        System.out.println("[A] " + n);
                    }
                    else
                    {
                        System.out.println("Otro tipo: " + n);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (continuar);
    }
}
