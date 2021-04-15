package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numerador, denominador;

        try {

            System.out.println("\nDIVISIÓN (solo números enteros)\n");
            System.out.print("Introduce el numerador:");
            numerador = in.nextInt();
            System.out.print("Introduce el denominador:");
            denominador = in.nextInt();

            double resultado = numerador / denominador;

            System.out.println("\nRESULTADO: " + resultado);

        }
        catch (InputMismatchException exception){

            System.out.println("Valor introducido incorrecto.");

        }
        catch (ArithmeticException resultado) {

            System.out.println("No se puede dividir entre cero.");

        }
    }
}
