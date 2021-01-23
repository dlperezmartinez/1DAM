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





























