package ENTORNOS.Pseudocódigo;

import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //VARIABLES
        double notaTeoria, notaTrabajos, notaFinal;
        boolean notaPracticas;

        //CÓDIGO
        System.out.println("Introduce tus notas.");
        System.out.print("Nota teoría: ");
        notaTeoria = in.nextDouble();
        System.out.print("Nota practicas: ");
        notaPracticas = in.nextBoolean();
        System.out.print("Nota trabajos: ");
        notaTrabajos = in.nextDouble();

        if (!notaPracticas)
        {
            notaFinal = 4;
        }
        else
        {
            if (notaTeoria < 4.5)
            {
                notaFinal = notaTeoria;
            }
            else
            {
                notaFinal = (notaTeoria + notaTrabajos) / 2;
            }

            if (notaFinal == 10)
            {
                System.out.println("Matricula de Honor");
            }
        }

        System.out.println("Nota final: " + notaFinal);
    }
}
