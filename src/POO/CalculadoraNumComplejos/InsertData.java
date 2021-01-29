package POO.CalculadoraNumComplejos;

import java.util.Scanner;

public class InsertData
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        double real = 0;
        double imaginario = 0;
        NumerosComplejos resultado; //Almacena el resultado de la operación de DOS NumerosComplejos
        int menu = 0;

        //OBJETOS Y INTRODUCCIÓN DE DATOS
        System.out.println("\n-CALCULADORA NUMEROS COMPLEJOS-\n");
        Calculadora calculadora = new Calculadora();

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
        int tipoOperacion = 0; //Para saber que tipo de operación es
        menu = in.nextInt();

        switch (menu)
        {
            case 1: //SUMA
                resultado = calculadora.suma(complejo1, complejo2);

                break;
            case 2: //RESTA
                resultado = calculadora.resta(complejo1, complejo2);

                break;
            case 3: //MULTIPLICACIÓN
            case 4: //DIVISIÓN
            default:
                break;
        }

        System.out.print(calculadora.print(complejo1, complejo2));
    }
}
