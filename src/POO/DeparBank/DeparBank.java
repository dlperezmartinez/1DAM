package POO.DeparBank;

import java.util.Scanner;

public class DeparBank
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        String nombre = "";
        String iban = "";
        int menu = 0;
        int idCuenta = 0; //para la creación de cuentas
        boolean continuar = true;

        //OBJETOS
        System.out.print("Introduce tu nombre y apellidos: ");
        nombre = in.nextLine();

        System.out.print("Introduce tu IBAN: ");
        iban = in.nextLine();

        System.out.println();
        CuentaBancaria cuenta = new CuentaBancaria(nombre, iban);
        System.out.println();

        //MENU
        while (continuar)
        {
            System.out.println("|-----------------------------------MENU----------------------------------|");
            System.out.println("|                                                                         |");
            System.out.println("| CREAR CUENTA | MOSTRAR DATOS | INGRESAR | RETIRAR | MOVIMIENTOS | SALIR |");
            System.out.println("|       1      |       2       |    3     |    4    |      5      |   6   |");
            System.out.println("|");
            System.out.println("V");
            System.out.println("");
            menu = in.nextInt(); //Pide un número para la selección del menú

            switch (menu) {
                case 1:
                    System.out.println("Opcion disponible proximamente");

                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo: " + cuenta.getSaldo());

                    break;
                case 3:
                    System.out.print("Cantidad a ingresar: ");
                    cuenta.ingreso(in.nextFloat());

                    break;
                case 4:
                    System.out.print("Cantidad a retirar: ");
                    cuenta.retirada(in.nextFloat());

                    break;
                case 5:
                    cuenta.mostrarMovimientos();

                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestros servicios Sr/Sra " + cuenta.getTitular());
                    continuar = false;

                    break;
                default:
                    System.out.println("Por favor, introduce solo numeros entre 1 y 6 inclusive, gracias.");
                    break;
            }
        }
    }
}
