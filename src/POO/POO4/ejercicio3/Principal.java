package POO.POO3.ejercicio3;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//IN
		Scanner in = new Scanner(System.in);

		//VARIABLES
		int x1, y1, x2, y2;

		//OBJETOS
		Rectangulo uno = new Rectangulo();

		//GETTERS Y SETTERS
		System.out.println("Introduce las coordenadas del Rectangulo con este orden (x1,y1) (x2,y2)");
		uno.setX1(in.nextInt());
		uno.setY1(in.nextInt());
		uno.setX2(in.nextInt());
		uno.setY2(in.nextInt());
		uno.setLado1();
		uno.setLado2();

		x1 = uno.getX1();
		y1 = uno.getY1();
		x2 = uno.getX2();
		y2 = uno.getY2();

		if (uno.continuar) //Comprobaciones: Si se NO se cumple la condición if de Rectangulo funciona el resto del programa.
		{
			uno.coordenadas();
			System.out.print("Area: " + uno.area());
			System.out.println();
			System.out.print("Perimetro: " + uno.perimetro());
		}
	}
}


























