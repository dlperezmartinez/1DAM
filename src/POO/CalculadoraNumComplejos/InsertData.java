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
        NumerosComplejos resultado = new NumerosComplejos(); //Almacena el resultado de la operación de DOS NumerosComplejos
        int menu = 0;
        boolean calc = false;
        NumerosComplejos vector[];

        Calculadora calculadora = new Calculadora();

        //PREMENU
        System.out.println("");
        System.out.println("| CALCULADORA | GENERADOR DE VECTORES |");
        System.out.println("|      1      |           2           |");
        System.out.println("|");
        System.out.println("V");
        menu = in.nextInt();


        switch (menu)
        {
            case 1:
                calc = true;

                break;
            case 2:
                System.out.print("Inserte tamaño de la lista: ");
                vector = new NumerosComplejos[in.nextInt()];

                for(int i = 0; i < vector.length; i++)
                {
                    vector[i] = new NumerosComplejos(Math.random()*10+0, Math.random()*10+0);
                }

                //Sumatorio
                System.out.println("\n-SUMATORIO-\n");

                int i = 1;
                for (NumerosComplejos n : vector)

                {
                    System.out.println("Numero complejo " + i + ": " +n.print());
                    resultado = calculadora.suma(resultado, n);
                    i++;
                }

                System.out.println("\nSuma total: " + resultado.print());

                //Productorio
                System.out.println("\n-PRODUCTORIO-\n");

                i = 1; //RESET
                resultado = new NumerosComplejos(1,1); //RESET

                for (NumerosComplejos n : vector)
                {
                    System.out.println("Numero complejo " + i + ": " +n.print());
                    resultado = calculadora.multiplicacion(resultado, n);
                    i++;
                }

                System.out.println("\nProductorio total: " + resultado.print());

                break;
            default:


                break;
        }
        menu = 0; //RESET


        //OBJETOS Y INTRODUCCIÓN DE DATOS
        if (calc)
        {
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
            int tipoOperacion = 0; //Para saber que tipo de operación es
            System.out.println("");
            System.out.println("| SUMA | RESTA | MULTIPLICACION | DIVISION |");
            System.out.println("|  1   |   2   |        3       |     4    |");
            System.out.println("|");
            System.out.println("V");
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
                    resultado = calculadora.multiplicacion(complejo1, complejo2);

                    break;
                case 4: //DIVISIÓN
                    resultado = calculadora.division(complejo1, complejo2);

                    break;
                default:
                    break;
            }

            System.out.print(calculadora.print(complejo1, complejo2));
        }
    }
}
