package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int entero;

        try {

            System.out.println("Introduce un número entero.");
            entero = in.nextInt();
            System.out.println("\nTu valor: " + entero);
        }
        catch (InputMismatchException exception){

            System.out.println("Valor introducido incorrecto.");

        }
    }
}
