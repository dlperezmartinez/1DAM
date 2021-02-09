package POO.GatoSimple;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);
        //VARIABLES
        String imprimir = " ";
        GatoSimple vectorGatos[] = new GatoSimple[5]; //Vector gatos

        //INSTANCIAS
        GatoSimple gato1 = new GatoSimple();

        GatoSimple gatoHembra = new GatoSimple();
        gatoHembra.setNombre("Wendy");
        gatoHembra.setColor("Blanca, naranja y marron");
        gatoHembra.setSexo("hembra");
        gatoHembra.setEdad(7);
        gatoHembra.setPeso(7.5);

        GatoSimple gatoMacho = new GatoSimple();
        gatoMacho.setSexo("macho");

        GatoSimple gato2 = new GatoSimple();
        GatoSimple gato3 = new GatoSimple();

        //OPERACIONES
        System.out.println("\n-GATO SIMULATOR-\n");

        System.out.println("Primero de todo debes describir a tu gato");
        System.out.print("Nombre: ");
        gato1.setNombre(in.nextLine());

        System.out.print("Color: ");
        gato1.setColor(in.nextLine());

        System.out.print("Sexo: ");
        gato1.setSexo(in.nextLine());

        System.out.print("Edad: ");
        gato1.setEdad(in.nextInt());

        System.out.print("Peso: ");
        gato1.setPeso(in.nextDouble());

        boolean continuar = true;

        while (continuar)
        {
            System.out.println("");
            System.out.println("| MAULLAR | RONRONEAR | COMER | PELEAR |");
            System.out.println("|    1    |     2     |   3   |    4   |");
            System.out.println("|");
            System.out.println("V");

            int menu = in.nextInt();

            switch (menu) {
                case 1: //MAULLAR
                    imprimir = gato1.maullar();

                    break;
                case 2: //RONRONEAR
                    imprimir = gato1.ronronear();

                    break;
                case 3: //COMER
                    String texto = " ";
                    texto = in.nextLine();
                    imprimir = gato1.comer(texto);

                    break;
                case 4: //PELEAR

                    if ((int) (Math.random() * 100 + 0) < 50) {
                        imprimir = gato1.pelear(gatoMacho);
                    } else {
                        imprimir = gato1.pelear(gatoHembra);
                    }

                    break;
                case 5: //SALIR
                    continuar = false;
                    imprimir = " ";

                    break;
                case 6: //VECTOR (oculto)
                    vectorGatos[0] = gato1;
                    vectorGatos[1] = gato2;
                    vectorGatos[2] = gato3;
                    vectorGatos[3] = gatoMacho;
                    vectorGatos[4] = gatoHembra;
                    for (GatoSimple gato : vectorGatos)
                    {
                        System.out.println(vectorGatos);
                    }
                default:
                    System.out.println("Introduce numeros del 1 al 4 inclusive");
                    imprimir = " ";

                    break;
            }
            System.out.println(imprimir);
        }
    }
}
