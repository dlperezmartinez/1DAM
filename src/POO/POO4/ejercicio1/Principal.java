package POO.POO4.ejercicio1;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) 
	{
		//SCANNER
		Scanner in = new Scanner(System.in);

		//VARIABLES
		int x,y;

		//OBJETOS
		Punto p = new Punto ();

		//INTRODUCCIÓN DE DATOS
		System.out.println("Introduce las coordenadas (primero X y luego Y)");
		p.setXY(in.nextInt(), in.nextInt());

		x = p.getCoordenadaX();
		y = p.getCoordenadaY();

		//MOSTRAR
		p.imprime();
		System.out.println("Cuantas posiciones quieres deplazar? (primero X y luego Y)");
		p.desplaza(in.nextInt(), in.nextInt());
		p.imprime();
		//p.distancia(p);

	}

}
