package POO.Almacen;

import java.util.Scanner;

public class Gestor
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        int menu = 0; //Para el menu
        Articulo almacen [] = new Articulo[100]; //Vector almacen.

        //INICIO DE ALMACEN
        for (int i = 0; i < almacen.length; i++)
        {
            almacen[i] = null;
        }

        //MENU
        switch (menu)
        {
            case 1://LISTADO
            case 2://ALTA
                for(int i = 0; i < almacen.length; i++)
                {
                    if ( almacen [i] == null)
                    {
                        almacen [i] = new Articulo();
                        almacen [i].setCodigo(in.nextLine());
                        almacen [i].setDescripcion(in.nextLine());
                        almacen [i].setPrecioCompra(in.nextDouble());
                        almacen [i].setPrecioVenta(in.nextDouble());
                        almacen [i].setStock(in.nextInt());

                        break;
                    }



                }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:


                break;
        }
        //OPERACIONES

    }
}
