package Trabajo2HundeLaFlota;

import java.util.Scanner;

public class HundeLaFlota
{
    /**************************************** FUNCIONES GENERALES *******************************/
    public static int disparo(char vectorDisparado[][], boolean jugador, int vidas, int tamanoIndiceY, int tamanoIndiceX)
    {
        Scanner in = new Scanner(System.in);
        boolean disparado = false;
        int pY = 0;
        int pX = 0;

        while (disparado == false)
        {
            if (jugador)
            {
                System.out.println("A que coordenada disparas?");
                System.out.print("Letra: ");
                char charpY = in.next().charAt(0); //Ajuste para que el jugador pueda introducir letras en lugar de números.
                pY = Character.getNumericValue(charpY);
                pY -= 10; //-10 por que A = 10, B = 12 y así sucesivamente.
                //System.out.println(pY);
                System.out.print("Numero: ");
                pX = in.nextInt();
            }
            else
            {
                pY = (int) (0 + Math.random() * (tamanoIndiceY - 0 + 1));
                pX = (int) (0 + Math.random() * (tamanoIndiceX - 0 + 1));

            }

            if (pY > tamanoIndiceY || pY < 0 || pX > tamanoIndiceX || pX < 0) //Si la posición seleccionada no está en el rango disponible volverá a pedir coordenadas
            {
                System.out.println("No puedes disparar a esa coordenada");
            }
            else
            {
                if (vectorDisparado[pY][pX] == ('A' | 'X'))
                {
                    if (jugador)
                    {
                        System.out.println("No puedes disparar a esa coordenada");
                    }
                }
                else
                {
                    if (vectorDisparado[pY][pX] == '-') //AGUA
                    {
                        vectorDisparado[pY][pX] = 'A';
                    }
                    else if (vectorDisparado[pY][pX] != '-') //TOCADO
                    {
                        vectorDisparado[pY][pX] = 'X';
                        vidas--; //Resta el número de vidas
                    }

                    disparado = true;
                }
            }
        }
        return vidas;
    }

    /********************************************************************************************/

    /**************************************** INSERTADOR DE BARCOS ******************************/
    //INSERTADOR LANCHA
    public static void insertarLancha(char vector[][], int cantidadInsertados, int tamanoIndiceY, int tamanoIndiceX)
    {
        for (int i = 0; i < cantidadInsertados; i++)
        {
            //Generador de indices aleatorios
            int indice1 = (int) (0 + Math.random() * (tamanoIndiceY - 0 + 1));
            int indice2 = (int) (0 + Math.random() * (tamanoIndiceX - 0 + 1));

            if (vector[indice1][indice2] == '-') //Comprueba que no hayan otros barcos en la posición.
            {
                vector[indice1][indice2] = 'L'; //Guarda el barco.
            }
            else
            {
                --i; //Si ya hay un barco en esa posición alarga el bucle.
            }
        }
    }

    //INSERTADOR BUQUE
    public static void insertarBuque(char vector[][], int cantidadInsertados, int tamanoIndiceY, int tamanoIndiceX)
    {
        for (int i = 0; i < cantidadInsertados; i++)
        {
            //Generador de indices aleatorios
            int indice1 = (int) (0 + Math.random() * (tamanoIndiceY - 0 + 1));
            int indice2 = (int) (0 + Math.random() * ((tamanoIndiceX - 2) - 0 + 1));

            if (vector[indice1][indice2] == '-' & vector[indice1][indice2 + 1] == '-' & vector[indice1][indice2 + 2] == '-') //Comprueba que no hayan otros barcos en la posición.
            {
                vector[indice1][indice2] = 'B'; //Guarda el barco.
                vector[indice1][indice2 + 1] = 'B';
                vector[indice1][indice2 + 2] = 'B';
            }
			/*else if (vector[indice1][indice2] == '-' & vector[indice1][indice2 - 1] == '-' & vector[indice1][indice2 - 2] == '-') //Comprueba que no hayan otros barcos en la posición. INVERTIDO
			{
					vector[indice1][indice2] = 'B'; //Guarda el barco.
					vector[indice1][indice2 - 1] = 'B';
					vector[indice1][indice2 - 2] = 'B';
			}*/
            else
            {
                --i; //Si ya hay un barco en esa posición alarga el bucle.
            }
        }
    }

    //INSERTADOR ACORAZADO
    public static void insertarAcorazado(char vector[][], int cantidadInsertados, int tamanoIndiceY, int tamanoIndiceX)
    {
        for (int i = 0; i < cantidadInsertados; i++)
        {
            //Generador de indices aleatorios
            int indice1 = (int) (0 + Math.random() * (tamanoIndiceY - 0 + 1));
            int indice2 = (int) (0 + Math.random() * ((tamanoIndiceX - 3) - 0 + 1));

            if (vector[indice1][indice2 & indice2 + 1 & indice2 + 2 & indice2 + 3] == '-') //Comprueba que no hayan otros barcos en la posición.
            {
                vector[indice1][indice2] = 'Z'; //Guarda el barco.
                vector[indice1][indice2 + 1] = 'Z';
                vector[indice1][indice2 + 2] = 'Z';
                vector[indice1][indice2 + 3] = 'Z';
            }
			/*else if (vector[indice1][indice2 & indice2 - 1 & indice2 - 2 & indice2 - 3] == '-') //Comprueba que no hayan otros barcos en la posición. INVERTIDO
			{
					vector[indice1][indice2] = 'Z'; //Guarda el barco.
					vector[indice1][indice2 - 1] = 'Z';
					vector[indice1][indice2 - 2] = 'Z';
					vector[indice1][indice2 - 3] = 'Z';
			}*/
            else
            {
                --i; //Si ya hay un barco en esa posición alarga el bucle.
            }
        }

    }

    //INSERTADOR PORTAAVIONES
    public static void insertarPortaaviones(char vector[][], int cantidadInsertados, int tamanoIndiceY, int tamanoIndiceX)
    {
        for (int i = 0; i < cantidadInsertados; i++)
        {
            //Generador de indices aleatorios
            int indice1 = (int) (0 + Math.random() * ((tamanoIndiceY - 4) - 0 + 1));
            int indice2 = (int) (0 + Math.random() * (tamanoIndiceX - 0 + 1));

            if (vector[indice1 & indice1 + 1 & indice1 + 2 & indice1 + 3 & indice1 + 4][indice2] == '-') //Comprueba que no hayan otros barcos en la posición.
            {
                vector[indice1][indice2] = 'P'; //Guarda el barco.
                vector[indice1 + 1][indice2] = 'P';
                vector[indice1 + 2][indice2] = 'P';
                vector[indice1 + 3][indice2] = 'P';
                vector[indice1 + 4][indice2] = 'P';
            }
			/*else if (vector[indice1 & indice1 - 1 & indice1 - 2 & indice1 - 3 & indice1 - 4][indice2] == '-') //Comprueba que no hayan otros barcos en la posición. INVERTIDO
			{
					vector[indice1][indice2] = 'P'; //Guarda el barco.
					vector[indice1 - 1][indice2] = 'P';
					vector[indice1 - 2][indice2] = 'P';
					vector[indice1 - 3][indice2] = 'P';
					vector[indice1 - 4][indice2] = 'P';
			}*/
            else
            {
                --i; //Si ya hay un barco en esa posición alarga el bucle.
            }

        }

    }

    /********************************************************************************************/

    /**************************************** TABLERO JUGADOR ***********************************/
    //CREA EL TABLERO JUGADOR
    public static void crearTableroJugador(char vector[][])
    {
        for (int i = 0; i < vector.length; i++)
        {
            for ( int j = 0; j < vector[i].length; j++)
            {
                vector[i][j] = '-';
            }
        }

    }

    //MUESTRA EL TABLEROJUGADOR (EN ESTE CASO SI QUE SE MUESTRA LA POSICIÓN DE LOS BARCOS)
    public static void mostrarTableroJugador(char vector[][])
    {
        char letraIndice = 'A';

        System.out.println();
        System.out.println("_________________________________________________________________________________________________");
        System.out.println();
        System.out.print(" ");

        for (int i = 0; i < vector[0].length; i++) //Imprime el indicador del indice X teniendo en cuenta la cantidad de columnas que se van a generar.
        {
            System.out.print(" " + i);
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++)
        {
            System.out.print(letraIndice + " ");

            for ( int j = 0; j < vector[i].length; j++)
            {
                System.out.print(vector[i][j] + " "); //Imprime cada posición.
            }

            System.out.println();

            letraIndice++;
        }

        System.out.println("\nTU TABLERO\n");
    }
    /********************************************************************************************/

    /**************************************** TABLERO IA ****************************************/
    //CREA EL TABLEROIA
    public static void crearTableroIA(char vector[][])
    {
        for (int i = 0; i < vector.length; i++)
        {
            for ( int j = 0; j < vector[i].length; j++)
            {
                vector[i][j] = '-';
            }
        }

    }

    //MUESTRA EL TABLERO VISIBLE DE LA IA (POSICIONES DE LOS BARCOS)
    public static void mostrarTableroIA(char vector[][], boolean chetos)
    {
        char letraIndice = 'A';

        if (chetos)
        {
            System.out.println("CHETOS");
        }

        System.out.println("\nTABLERO ENEMIGO\n");
        System.out.print(" ");

        for (int i = 0; i < vector[0].length; i++) //Imprime el indicador del indice X teniendo en cuenta la cantidad de columnas que se van a generar.
        {
            System.out.print(" " + i);
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++)
        {
            System.out.print(letraIndice + " ");

            for ( int j = 0; j < vector[i].length; j++)
            {
                if (chetos)
                {
                    System.out.print(vector[i][j] + " "); //Imprime cada posición.
                }
                else
                {
                    if (vector[i][j] == ('L') ||(vector[i][j] =='B')||(vector[i][j] =='Z')||(vector[i][j] =='P'))
                    {
                        System.out.print("- ");
                    }
                    else
                    {
                        System.out.print(vector[i][j] + " ");
                    }
                }
            }

            System.out.println();
            letraIndice++;
        }

    }
    /********************************************************************************************/

    public static void main(String[] args)
    {
        //CONSTRUCTOR
        Scanner in = new Scanner(System.in);

        //VARIABLES
        char tableroIA[][];//Este es el tablero que guarda las posiciones de los barcos.
        char tableroJugador[][];

        boolean chetos = true; //LAS TRAMPAS ÚTIL MIENTRAS SE DESARROLLA EL JUEGO.
        boolean juego = true; //Para que se ejecute el juego una y otra vez
        boolean continuar = true; //Para que si alguien no introduce 1 o 2 se repita la pregunta.
        int sino = 0; //Para los switches de elegir sí o no.

        int controlDeTamano = 0; //Variable para el control del tamaño en el modo Personalizado
        int vidasIA = 0;
        int vidasJugador = 0;

        //tamaño del tablero
        int tamanoTableroY = 0;
        int tamanoTableroX = 0;

        //cantidad de barcos
        int cantidadLanchas = 0;
        int cantidadBuques = 0;
        int cantidadAcorazados = 0;
        int cantidadPortaaviones = 0;

        while (juego) //bucle para que se repita una y otra vez
        {
            //PANTALLA INICIO
            System.out.println("\n-HUNDIR LA FLOTA EL VIDEOJUEGO-\n");
            System.out.println("Pulsa una INTRO para continuar");
            in.nextLine();

            //SELECTOR DIFICULTAD
            System.out.println("\nSELECCIONA UNA DIFICULTAD\n");
            System.out.println("| FACIL | MEDIO | DIFICIL | PERSONALIZADO |");
            System.out.println("|   1   |   2   |    3    |       4       |");
            System.out.println("|");
            System.out.println("V");
            int seleccion = in.nextInt();

            switch (seleccion)
            {
                case 1:
                    //ASIGNACIÓN DEL TAMAÑO DE LOS TABLEROS
                    tamanoTableroY = 10;
                    tamanoTableroX = 10;

                    //INSERTADORES DE BARCOS
                    cantidadPortaaviones = 1;
                    cantidadAcorazados = 1;
                    cantidadBuques = 3;
                    cantidadLanchas = 5;

                    break;
                case 2:
                    //ASIGNACIÓN DEL TAMAÑO DE LOS TABLEROS
                    tamanoTableroY = 10;
                    tamanoTableroX = 10;

                    //INSERTADORES DE BARCOS
                    cantidadPortaaviones = 1;
                    cantidadAcorazados = 1;
                    cantidadBuques = 1;
                    cantidadLanchas = 2;

                    break;
                case 3:
                    //ASIGNACIÓN DEL TAMAÑO DE LOS TABLEROS
                    tamanoTableroY = 10;
                    tamanoTableroX = 10;

                    //INSERTADORES DE BARCOS
                    cantidadPortaaviones = 0;
                    cantidadAcorazados = 0;
                    cantidadBuques = 1;
                    cantidadLanchas = 1;

                    break;
                case 4:
                    //INSTRUCCIONES PARA DEFINIR EL TAMAÑO DEL TABLERO
                    System.out.println("\n-PERSONALIZADO-\n");
                    System.out.println("Introduce el tamaño del tablero");
                    System.out.print("Eje Y: ");
                    tamanoTableroY = in.nextInt(); //Pide eje Y
                    System.out.print("Eje X: ");
                    tamanoTableroX = in.nextInt(); //Pide eje X

                    controlDeTamano = tamanoTableroY * tamanoTableroX; //Establecida la cantidad de posiciones ocupadas por los barcos.

                    //INSERTADORES DE BARCOS
                    System.out.println("\nAhora introduce los barcos que quieres en el tablero\n");
                    while (controlDeTamano > 0)
                    {
                        //Los if's son para que no haya posibilidad de que se salgan del índice los barcos (si un barco no cabe no pide que introduzcas cuantos barcos de ese tipo quieres)
                        if(tamanoTableroY >= 5 && tamanoTableroX >= 1 && controlDeTamano > 5)
                        {
                            System.out.print("Portaaviones: ");//Debajo pide el número de barcos.
                            cantidadPortaaviones = in.nextInt();

                            controlDeTamano -= (cantidadPortaaviones * 5);
                            if (controlDeTamano <= 0)
                            {
                                break;
                            }
                        }

                        if(tamanoTableroY >= 1 && tamanoTableroX >= 4 && controlDeTamano > 4)
                        {
                            System.out.print("Acorazados: ");//Debajo pide el número de barcos.
                            cantidadAcorazados = in.nextInt();

                            controlDeTamano -= (cantidadAcorazados * 4);
                            if (controlDeTamano <= 0)
                            {
                                break;
                            }
                        }

                        if(tamanoTableroY >= 1 && tamanoTableroX >= 3 && controlDeTamano > 3)
                        {
                            System.out.print("Buques: ");//Debajo pide el número de barcos.
                            cantidadBuques = in.nextInt();

                            controlDeTamano -= (cantidadBuques * 3);
                            if (controlDeTamano <= 0)
                            {
                                break;
                            }
                        }

                        //En el caso de las lanchas da igual el tamaño del tablero.
                        if(controlDeTamano > 1)
                        {
                            System.out.print("Lanchas: ");//Debajo pide el número de barcos.
                            cantidadLanchas = in.nextInt();

                            controlDeTamano -= cantidadLanchas;
                            if (controlDeTamano <= 0)
                            {
                                break;
                            }
                        }
                        break;
                    }

                    break; //Rompe el bucle sí o sí una vez pasado por todos los barcos (Quizás más limpio con for?)
                default:
                    System.out.println("Por favor, introduce un numero del 1 al 4 inclusive");
                    break;

            }

            //CREACIÓN DE TABLEROS
            tableroIA = new char[tamanoTableroY][tamanoTableroX];
            crearTableroIA(tableroIA);

            tableroJugador = new char[tamanoTableroY][tamanoTableroX];
            crearTableroJugador(tableroJugador);

            //INSERTADORES DE BARCOS
            //tableroIA
            insertarPortaaviones(tableroIA, cantidadPortaaviones, (tamanoTableroY - 1), (tamanoTableroX - 1)); //El tamaño de los tableros hay que ajustarlos para que no se salga del índice
            insertarAcorazado(tableroIA, cantidadAcorazados, (tamanoTableroY - 1), (tamanoTableroX - 1));
            insertarBuque(tableroIA, cantidadBuques, (tamanoTableroY - 1), (tamanoTableroX - 1));
            insertarLancha(tableroIA, cantidadLanchas, (tamanoTableroY - 1), (tamanoTableroX - 1));
            //tableroJugador
            insertarPortaaviones(tableroJugador, cantidadPortaaviones, (tamanoTableroY - 1), (tamanoTableroX - 1));
            insertarAcorazado(tableroJugador, cantidadAcorazados, (tamanoTableroY - 1), (tamanoTableroX - 1));
            insertarBuque(tableroJugador, cantidadBuques, (tamanoTableroY - 1), (tamanoTableroX - 1));
            insertarLancha(tableroJugador, cantidadLanchas, (tamanoTableroY - 1), (tamanoTableroX - 1));

            //BLOQUE DE JUEGO
            //VIDAS
            vidasIA = (cantidadPortaaviones * 5) + (cantidadAcorazados * 4) + (cantidadBuques * 3) + cantidadLanchas;
            vidasJugador =  (cantidadPortaaviones * 5) + (cantidadAcorazados * 4) + (cantidadBuques * 3) + cantidadLanchas;

            //CHETOS SÍ O NO
            continuar = true; //Reset

            while (continuar)
            {
                System.out.println("Quieres activar las trampas?");
                System.out.println("| SI | NO |");
                System.out.println("|  1 |  2 |");
                System.out.println("|");
                System.out.println("V");
                sino = 0; //Reset
                sino = in.nextInt();

                switch(sino)
                {
                    case 1:
                        chetos = true;
                        continuar = false;
                        break;
                    case 2:
                        chetos = false;
                        continuar = false;
                        break;
                    default:
                        System.out.println("Introduce 1 o 2 por favor...");
                        break;
                }
            }

            //TURNOS
            while (vidasIA > 0 && vidasJugador > 0)
            {
                //MOSTRAR VIDAS
                System.out.println("Vidas IA: " + vidasIA);
                System.out.println("Tus vidas: " + vidasJugador);

                //MOSTRAR TABLEROS
                mostrarTableroIA(tableroIA, chetos);
                mostrarTableroJugador(tableroJugador);

                //DISPARO DE JUGADOR
                vidasIA = disparo(tableroIA, true, vidasIA, (tamanoTableroY - 1), (tamanoTableroX - 1));

                //DISPARO DE IA
                if (vidasIA > 0)  //Para que si gana el jugador no dispare la IA.
                {
                    vidasJugador = disparo(tableroJugador, false, vidasJugador, (tamanoTableroY - 1), (tamanoTableroX - 1));
                }
            }

            if (vidasIA == 0)
            {
                //MOSTRAR TABLEROS
                mostrarTableroIA(tableroIA, chetos);
                mostrarTableroJugador(tableroJugador);

                System.out.println("\nENHORABUENA HAS GANADO\n");
            }

            if (vidasJugador == 0)
            {
                System.out.println("\nHAS PERDIDO, PRUEBA OTRA VEZ C:\n");
            }

            //CONTINUAR??
            continuar = true; //Reset necesario para la segunda partida y en adelante

            while (continuar)
            {
                System.out.println("Quieres volver a jugar?");
                System.out.println("| SI | NO |");
                System.out.println("|  1 |  2 |");
                System.out.println("|");
                System.out.println("V");
                sino = 0; //Reset
                sino = in.nextInt();

                switch(sino)
                {
                    case 1:
                        continuar = false;
                        break;
                    case 2:
                        System.out.println("\nGRACIAS POR JUGAR\n");
                        juego = false;
                        continuar = false;
                        break;
                    default:
                        System.out.println("Introduce 1 o 2 por favor...");
                        break;
                }
            }
        }

    }

}
