package POO.POO2.ejercicio3;

import java.util.Scanner;

public class Rectangulo 
{
	//IN
	Scanner in = new Scanner(System.in);
	
	//ATRIBUTOS
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	public double area;
	public double perimetro;
	public double lado1;
	public double lado2;
	public boolean continuar = true;
	
	public Rectangulo (int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.lado1 = x2 - x1;
		this.lado2 = y2 - y1;

		if (x1 > x2 || y1 > y2)
		{
			continuar = false;
			System.out.println("(x1,y1) no puede ser MAYOR a (x2,y2)");
		}
	}

	public void coordenadas ()
	{
		System.out.println("Coordenadas (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
	}
	
	public void area ()
	{
		area = lado1 * lado2;
		System.out.println("Area: " + area);
	}
	
	public void perimetro()
	{
		perimetro = lado1 + lado2;
		System.out.println("Perimetro: " + perimetro);
	}
}





























