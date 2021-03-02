package POO.Polimorfismo.Ejercicio6_Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorVehiculos
{
    //SCANNER
    Scanner in = new Scanner(System.in);

    //FUNCIONES
    public void agregarVehiculo()
    {
        boolean continuar = true;
        while (continuar)
        {
            System.out.println("\n-AGREGAR VEHICULO-\n");
            System.out.println("| TERRESTRE | ACUATICO | AEREO | CANCELAR |");
            System.out.println("|     1     |    2     |   3   |     4    |");
            System.out.println("|");
            System.out.println("V");
            int menu;
            menu = in.nextInt();

            switch (menu)
            {
                case 1: //TERRESTRE
                    agregarTerrestre();
                    break;
                case 2: //ACUATICO
                    break;
                case 3: //AEREO
                    break;
                case 4: //CANCELAR
                    continuar = false;
                    break;
                default :
                    System.out.println("Introduce solo números del 1 al 4 inclusive.");
                    break;
            }
        }
    }

    public void agregarTerrestre ()
    {
        boolean continuar = true;
        while (continuar)
        {
            //Variables
            String matricula, modelo;
            int numRuedas;
            boolean aireAcondicionado;

            System.out.println("\n-AGREGAR VEHICULO TERRESTRE-\n");
            System.out.println("| COCHE | MOTO | ATRAS |");
            System.out.println("|   1   |  2   |   3   |");
            System.out.println("|");
            System.out.println("V");
            int menu;
            menu = in.nextInt();

            switch (menu)
            {
                case 1: //COCHE TODO
                    //new Coche(matricula, modelo, numRuedas, aireAcondicionado);
                    break;
                case 2: //MOTO
                    break;
                case 3: //ATRAS
                    continuar = false;
                    break;
                default :
                    System.out.println("Introduce solo números del 1 al 3 inclusive.");
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        //INSTANCIAS
        Vehiculo coche1 = new Coche("1111aaaaaa", "modelo1", 4, true);
        vehiculos.add(coche1);

        //MENÚ
        boolean continuar = true;
        int menu;

        while (continuar)
        {
            System.out.println("| CONSULTAR VEHICULO | LISTA DE VEHICULOS | AGREGAR VEHICULO |");
            System.out.println("|          1         |          2         |         3        |");
            System.out.println("|");
            System.out.println("V");
            menu = in.nextInt();

            switch (menu)
            {
                case 1: //CONSULTAR VEHICULO
                    System.out.print("Introduce la matricula del coche que quieres consultar: ");
                    String matricula = in.next(); //Introducir por teclado la matricula

                    for (Vehiculo n : vehiculos) //Recorre la Array en busca de la matricula
                    {
                        if (n.equals(matricula)) //Si existe imprime sus datos
                        {
                            System.out.println(n.toString());
                        }
                        else //Si no existe da error
                        {
                            System.out.println("Ese vehiculo no figura en nuestra base de datos, disculpa las molestias.");
                        }
                    }

                    break;
                case 2: //LISTA DE VEHICULOS
                    for ( Vehiculo n : vehiculos)
                    {
                        System.out.println(n.getClass().getSimpleName() + " con matricula: " + n.getMatricula());
                    }

                    break;
                case 3: //AGREGAR VEHICULO
                    System.out.println("Intr");

                    break;
                default:
                    break;
            }
        }

        //OPERACIONES
        //System.out.println(coche1.toString());
    }
}
