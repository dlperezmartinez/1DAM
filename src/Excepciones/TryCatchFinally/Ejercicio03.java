package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double vector[] = new double[5];

        System.out.println("Vector creado...\n");

        for (int i = 0; i < vector.length; i++)
        {
            try {

                System.out.print("Introduce valor: ");
                vector[i] = in.nextDouble();

            } catch (InputMismatchException exception) {

                System.out.println("Valor introducido no válido.");
                in.next();
                i--;

            }
        }
    }
}
