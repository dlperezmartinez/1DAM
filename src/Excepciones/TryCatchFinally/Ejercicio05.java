package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05
{
    static void imprimePositivo(int p) throws Exception //Imprime el valor p. Lanza una ‘Exception’ si p < 0
    {
        if (p > 0)
        {
            System.out.println("Valor: " + p);
        }
        else
        {
            throw new Exception("El número es negativo.");
        }
    }

    static void imprimeNegativo(int n) throws Exception //Imprime el valor n. Lanza una ‘Exception’ si p >= 0
    {
        if (n < 0)
        {
            System.out.println("Valor: " + n);
        }
        else
        {
            throw new Exception("El número es positivo.");
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        int p, n;

        while (continuar)
        {
            try
            {
                System.out.print("Introduce p: ");
                imprimePositivo(p = in.nextInt());

                System.out.print("Introduce n: ");
                imprimeNegativo(n = in.nextInt());

            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            /*catch (InputMismatchException p)
            {
                System.out.println("Caracter no válido.");
            }*/
        }
    }

}
