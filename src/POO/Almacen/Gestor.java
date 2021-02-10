package POO.Almacen;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Gestor
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        int menu = 0; //Para el menu
        boolean continuar = true; //Para el while

        ArrayList<Articulo> almacen = new ArrayList<>(); //Vector almacen.

        //INICIO DE ALMACEN


        //MENU
        while (continuar)
        {
            System.out.println("\n-ALMACEN-\n");

            System.out.println("| LISTADO | ALTA | BAJA | MODIFICAR | ENTRADA DE MERCANCÍA | SALIDA DE MERCANCÍA | SALIR |");
            System.out.println("|    1    |  2   |   3  |     4     |          5           |          6          |   7   |");
            System.out.println("|");
            System.out.println("V");
            menu = in.nextInt();

            switch (menu)
            {
                case 1://LISTADO

                    for (Articulo n : almacen)
                    {
                        System.out.println(n.toString());
                    }

                    break;
                case 2://ALTA
                    System.out.println("\n-GESTOR DE ALTAS-\n");
                    System.out.println("Introduce los datos del articulo");

                    in.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = in.nextLine();

                    System.out.print("Código: ");
                    String codigo = in.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = in.nextLine();

                    System.out.print("Precio de compra: ");
                    double precioCompra = in.nextDouble();

                    System.out.print("Precio de venta: ");
                    double precioVenta = in.nextDouble();

                    System.out.print("Stock: ");
                    int stock = in.nextInt();

                    almacen.add(new Articulo(nombre, codigo, descripcion, precioCompra, precioVenta, stock));

                    break;
                case 3: //BAJA
                    boolean continuar2 = true;

                    while(continuar2)
                    {
                        System.out.println("\n-GESTOR DE BAJAS-\n");

                        System.out.println("¿Quieres borrar por nombre o por código?\n");
                        System.out.println("| CÓDIGO | NOMBRE | CANCELAR |");
                        System.out.println("|   1    |    2   |     3    |");
                        System.out.println("|");
                        System.out.println("V");
                        menu = 0; //RESET
                        menu = in.nextInt();

                        switch (menu)
                        {
                            case 1: //CÓDIGO
                                in.nextLine(); //BUG
                                System.out.print("Código: ");
                                codigo = in.nextLine();

                                for(Articulo n : almacen) //Busca el código en el almacen y si está lo borra
                                {
                                    if (n.getCodigo().equals(codigo))
                                    {
                                        System.out.println("Artículo " + n.getNombre() + " con código " + n.getCodigo() + " ha sido borrado con éxito.");
                                        almacen.remove(n);

                                        continuar2 = false;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("No se ha encontrado el artículo");
                                    }
                                }

                                break;
                            case 2: //NOMBRE
                                System.out.print("Nombre: ");
                                nombre = in.nextLine();

                                for(Articulo n : almacen) //Busca el nombre en el almacen y si está lo borra
                                {
                                    if (n.getNombre().equals(nombre))
                                    {
                                        System.out.println("Artículo " + n.getNombre() + " con código " + n.getCodigo() + " ha sido borrado con éxito.");
                                        almacen.remove(n);

                                        continuar2 = false;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("No se ha encontrado el artículo");
                                    }
                                }

                                break;
                            case 3: //CANCELAR
                                continuar2 = false;
                                break;
                            default:
                                System.out.println("Introduce números entre 1 y 3 inclusive. Gracias.");

                                break;
                        }
                    }
                    System.out.println("");

                    break;
                case 4: //MODIFICACIÓN
                    System.out.println("PROXIMAMENTE");
                    break;
                case 5: //ENTRADA DE MERCANCÍA
                    in.nextLine();//BUG
                    System.out.println("\n-ENTRADA DE MERCANCÍA\n");

                    System.out.print("Código del articulo: ");
                    codigo = in.nextLine();

                    for(Articulo n : almacen) //Busca el código en el almacen y si está lo borra
                    {
                        if (n.getCodigo().equals(codigo))
                        {
                            System.out.println("Articulo encontrado");
                            System.out.print("Cantidad de articulos: ");
                            n.setStock(n.getStock() + in.nextInt()); //Suma la cantidad introducida por teclado
                        }
                        else
                        {
                            System.out.println("No se ha encontrado el articulo");
                        }
                    }




                    break;
                case 6: //SALIDA DE MERCANCÍA
                    in.nextLine();//BUG
                    System.out.println("\n-SALIDA DE MERCANCÍA\n");

                    System.out.print("Código del articulo: ");
                    codigo = in.nextLine();

                    for(Articulo n : almacen) //Busca el código en el almacen y si está lo borra
                    {
                        if (n.getCodigo().equals(codigo))
                        {
                            System.out.println("Articulo encontrado");
                            System.out.print("Cantidad de articulos: ");

                            int cantidadRestar = in.nextInt();

                            if (n.getStock() - cantidadRestar < 0 )
                            {
                                System.out.println("No hay suficientes articulos");
                            }
                            else
                            {
                                n.setStock(n.getStock() - cantidadRestar); //Resta la cantidad introducida por teclado
                            }
                        }
                        else
                        {
                            System.out.println("No se ha encontrado el articulo");
                        }
                    }
                case 7://SALIR
                    continuar = false;
                    break;
                default:


                    break;
            }
        }
        //OPERACIONES

    }
}
