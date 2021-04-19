package Excepciones.TryCatchFinally.Ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        boolean continuar = true; int menu; //Se utiliza para el menu

        //INSTANCIAS
        System.out.println("\n-REGISTRADOR DE GATOS-\n");

        //MENU
        while (continuar)
        {
            System.out.println("|--------------------------MENU--------------------------|");
            System.out.println("|                                                        |");
            System.out.println("| REGISTRAR GATO | MODIFICAR GATO | LISTAR GATOS | SALIR |");
            System.out.println("|        1       |        2       |      3       |   4   |");
            System.out.println("|");
            System.out.println("V");
            System.out.println("");
            menu = in.nextInt(); //Pide un número para la selección del menú

            switch (menu) {
                case 1: //REGISTRAR GATO
                    System.out.print("Introduce nombre: ");
                    String nombre = in.next();
                    System.out.print("Introduce edad: ");
                    int edad = in.nextInt();

                    try
                    {
                        gatos.add(new Gato(nombre, edad));
                    }
                    catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case 2: //MODIFICAR GATO
                    System.out.println("Introduce el nombre del gato que quieres modificar");

                    for (Gato n: gatos)
                    {
                        if (in.next().equals(n.getNombre()))
                        {
                            try //Cambio de nombre
                            {
                                System.out.print("Introduce nuevo nombre: ");
                                n.setNombre(in.next());
                            }
                            catch (Exception ex)
                            {
                                System.out.println(ex.getMessage());
                            }

                            try //Cambio de edad
                            {
                                System.out.print("Introduce nueva edad: ");
                                n.setEdad(in.nextInt());
                            }
                            catch (Exception ex)
                            {
                                System.out.println(ex.getMessage());
                            }

                            break;
                        }
                        else //No existe el gato
                        {
                            System.out.println("No existe ese gato.");

                            break;
                        }
                    }


                    break;
                case 3: //LISTAR GATOS
                    System.out.println(gatos.toString());

                    break;
                case 4: //SALIR
                    System.out.println("Gracias por utilizar el REGISTRADOR DE GATOS");
                    continuar = false;

                    break;
                default:
                    System.out.println("Por favor, introduce solo numeros entre 1 y 4 inclusive, gracias.");
                    break;
            }
        }
    }
}
