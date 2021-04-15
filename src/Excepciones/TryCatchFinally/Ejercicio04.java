package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vector[] = new int[(int)(Math.random()*99+1)];
        int posicion = 0;
        boolean continuar = true;

        for (int i = 0; i == vector.length; i++) {
            vector[i] = (int) (Math.random() * 9 + 1);
        }

        System.out.println("Vector creado...");

        while (continuar) {
            try {
                System.out.print("Posición a consultar: ");
                posicion = in.nextInt();

                System.out.println("Valor: " + vector[posicion]);
                System.out.println();
            } catch (InputMismatchException exception) {

                System.out.println("Valor no válido.");

            } catch (RuntimeException exception) {

                System.out.println("Posición no válida.");

            } finally {

                if (posicion < 0) {
                    continuar = false;
                    System.out.println("Fin del programa...");
                }
            }
        }
    }
}
