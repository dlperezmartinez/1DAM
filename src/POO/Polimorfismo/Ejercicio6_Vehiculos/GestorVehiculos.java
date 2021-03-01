package POO.Polimorfismo.Ejercicio6_Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorVehiculos
{
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
                case 3: //AGREGAR VEHICULO TODO
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
