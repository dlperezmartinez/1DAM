package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    static void muestraRuta(File file) throws FileNotFoundException {
        if (!file.exists()) //Comprueba si existe el file
        {
            throw new FileNotFoundException("Ruta no encontrada");
        }

        if (file.isFile()) //Comprueba si es un archivo
        {
            System.out.println("El nombre del archivo es: " + file.getName());
        } else if (file.isDirectory()) //Si no comprueba si es un directorio
        {
            File[] files = file.listFiles();

            Arrays.sort(files);

            for (File n : files) {
                if (n.isFile()) {
                    System.out.println("[A] " + n.getName());
                } else if (n.isDirectory()) {
                    System.out.println("[*] " + n.getName());
                }
            }
        }
    }
        public static void main (String[]args)
        {
            Scanner in = new Scanner(System.in);
            String ruta = "";

            do {
                try {
                    System.out.print("Introduce ruta: ");
                    ruta = in.nextLine();

                    if (!ruta.equals("")) {
                        File file = new File(ruta);
                        muestraRuta(file);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } while (!ruta.equals(""));
        }
    }

