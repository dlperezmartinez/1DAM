package Ficheros.CasoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class MiniFileManager
{
    //ATRIBUTOS
    private File rutaActual = new File (System.getProperty("user.dir")); //Ruta actual
    //CONTRUCTOR

    //GETTERS Y SETTERS
    //Getters

    public File getRutaActual() {
        return rutaActual;
    }

    //Setters

    //MÉTODOS
    public String pwd (File file) throws FileNotFoundException
    {
        String ruta = "";

        return ruta;
    }

    public void cd(File argumento)
    {

    }

    public void ls(boolean info) throws FileNotFoundException
    {
        if (!this.rutaActual.exists()) //Comprueba si existe el file
        {
            throw new FileNotFoundException("Ruta no encontrada");
        }

        if (this.rutaActual.isFile()) //Comprueba si es un archivo
        {
            System.out.println("El nombre del archivo es: " + this.rutaActual.getName());
        }
        else if (this.rutaActual.isDirectory()) //Si no comprueba si es un directorio
        {
            File[] files = this.rutaActual.listFiles();

            //Arrays.sort(files); //Ordenar TODO primero directorios, después archivos (orden alfabético)

            for (File n: files)
            {
                if (n.isFile())
                {
                    System.out.print("[A] " + n.getName());
                    if (info) //Si info es true muestra también los bytes y la última modificación
                    {
                        System.out.print(" " + n.length() + " bytes" + " Última mod. " + n.lastModified());
                    }
                    System.out.println();
                }
                else if (n.isDirectory())
                {
                    System.out.print("[*] " + n.getName());
                    if (info) //Si info es true muestra también los bytes y la última modificación
                    {
                        System.out.print(" " + n.length() + " bytes" + " Última mod. " + n.lastModified());
                    }
                    System.out.println();
                }
            }
        }
    }
}
