package POO.POO3.ejercicio1;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) 
	{
		//SCANNER
		Scanner in = new Scanner(System.in);

		int x,y;

		Punto p = new Punto ();

		System.out.print("Introduce coordenada X: ");
		p.setCoordenadaX(in.nextInt());
		System.out.print("Introduce coordenada Y: ");
		p.setCoordenadaY(in.nextInt());

		x = p.getCoordenadaX();
		y = p.getCoordenadaY();

		System.out.println("Coordenadas del punto: X " + x + " Y " + y);
	}

}
