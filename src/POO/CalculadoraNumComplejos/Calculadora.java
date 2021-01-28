package POO.CalculadoraNumComplejos;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        double real = 0;
        double imaginario = 0;

        //OBJETOS
        System.out.println("\n-CALCULADORA NUMEROS COMPLEJOS-\n");
        System.out.println("Primer numero complejo");
        System.out.print("-Introduce la parte Real: ");
        real = in.nextDouble();
        System.out.print("-Introduce la parte Imaginaria: ");
        imaginario = in.nextDouble();
        NumerosComplejos complejo1 = new NumerosComplejos(real, imaginario);

        System.out.println("Segundo numero complejo");
        System.out.print("-Introduce la parte Real: ");
        real = in.nextDouble();
        System.out.print("-Introduce la parte Imaginaria: ");
        imaginario = in.nextDouble();
        NumerosComplejos complejo2 = new NumerosComplejos(real, imaginario);

        //OPERACIONES
        complejo1.suma(complejo2);
        complejo1.print(complejo2);
    }
}
