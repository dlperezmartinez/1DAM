package Ficheros.EjerciciosIntroductorios;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter ExitFile = null;
        String frase;
        String fraseAlReves = "";

        System.out.println("Introduce una frase");
        try
        {
            ExitFile = new PrintWriter("frase.txt");

            frase = in.nextLine().toLowerCase().replace(" ", "");

            for (int i = (frase.length() - 1); i >= 0; i--)
            {
                fraseAlReves += frase.charAt(i);
            }

            if (frase.equals(fraseAlReves))
            {
                System.out.println("\nPALINDROMO DETECTADO\n");
            }
            else
            {
                System.out.println("No se ha detectado ningún palindromo... :c");
            }

            ExitFile.println(fraseAlReves);
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Carácter o carácteres no válidos");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            ExitFile.close();
        }
    }
}
