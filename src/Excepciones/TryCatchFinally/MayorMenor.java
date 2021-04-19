package Excepciones.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorMenor
{
    public static void main(String[] args) {
        //VARIABLES
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        int numero = (int)(Math.random()*499+1);
        int intentos = 0;

        while (continuar)
        {
            System.out.println("Chetos: " + numero);
            System.out.print("Escribe un número: ");
            try
            {
                if ( in.nextInt() == numero)
                {
                    System.out.println("ENHORABUENA, HAS ACERTADO!");
                    intentos++;
                    continuar = false;
                }
                else
                {
                    intentos++;
                }
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Caracteres no válidos.");
                intentos++;
                in.next();
            }
        }

        System.out.println("Cantidad de intentos: " + intentos);
    }
}
