package Ficheros.EjerciciosIntroductorios.FIBONACCI;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter ExitFile = null;
        Fibonacci f1 = new Fibonacci("fibonacci 1",10);

        //f1.mostrarSerie();

        try {
            ExitFile = new PrintWriter("FIBONACCI.txt");
            ExitFile.println(f1.fibonacci(20));
            ExitFile.flush();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            ExitFile.close();
        }
    }


}
