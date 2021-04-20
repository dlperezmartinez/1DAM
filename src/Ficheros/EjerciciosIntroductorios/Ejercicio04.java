package Ficheros.EjerciciosIntroductorios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio04
{
    public static void main(String[] args) {
        FileReader FileInput = null;
        int min = 0;
        int max = 0;

        try
        {
            FileInput = new FileReader("numeros.txt");
            BufferedReader Input = new BufferedReader(FileInput);

            String numeros;
            int numero;

            numeros = Input.readLine();
            numero = Integer.parseInt(numeros);

            min = numero;
            max = numero;

            while (Input != null)
            {
                numeros = Input.readLine();
                numero = Integer.parseInt(numeros);

                if (numero < min)
                {
                    min = numero;
                }

                if (numero > max)
                {
                    max = numero;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {

        }
        finally
        {
            try
            {
                if (FileInput != null) {
                    FileInput.close();
                }
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }
}
