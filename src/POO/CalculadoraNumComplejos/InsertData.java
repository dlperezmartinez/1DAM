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
        boolean calc = false;
        NumerosComplejos vector[] = new NumerosComplejos[5];

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
                //Instancias manuales
                resultado = new NumerosComplejos();
                NumerosComplejos c0 = new NumerosComplejos((double)Math.random()*100+0, (double)Math.random()*100+0);
                NumerosComplejos c1 = new NumerosComplejos((double)Math.random()*100+0, (double)Math.random()*100+0);
                NumerosComplejos c2 = new NumerosComplejos((double)Math.random()*100+0, (double)Math.random()*100+0);
                NumerosComplejos c3 = new NumerosComplejos((double)Math.random()*100+0, (double)Math.random()*100+0);
                NumerosComplejos c4 = new NumerosComplejos((double)Math.random()*100+0, (double)Math.random()*100+0);

                vector[0] = c0;
                vector[1] = c1;
                vector[2] = c2;
                vector[3] = c3;
                vector[4] = c4;
                resultado = vector[0];

                c0.print();
                for(int i = 1; i < vector.length; i++)
                {
                    resultado = calculadora.suma(resultado, vector[i]);
                }

                resultado.print();


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
