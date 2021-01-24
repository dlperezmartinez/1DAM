package POO.POO3.ejercicio3;

import java.util.Scanner;

public class Rectangulo 
{
	//IN
	Scanner in = new Scanner(System.in);
	
	//ATRIBUTOS
	private int x1;
	private int x2;
	private int y1;
	private int y2;

	private int lado1;
	private int lado2;

	public boolean continuar = true; //Para las comprobaciones

	public Rectangulo ()
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.lado1 = 0;
		this.lado2 = 0;
	}

	public Rectangulo (int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.lado1 = lado1;
		this.lado2 = lado2;

		if (x1 > x2 || y1 > y2)
		{
			continuar = false;
			System.out.println("(x1,y1) no puede ser MAYOR a (x2,y2)");
		}
	}

	//GETTERS Y SETTERS
	//x1
	public int getX1() {return x1;}
	public void setX1(int x1){this.x1 = x1;}
	//x2
	public int getX2() {return x2;}
	public void setX2(int x2){this.x2 = x2;}
	//y1
	public int getY1() {return y1;}
	public void setY1(int y1){this.y1 = y1;}
	//y2
	public int getY2() {return y2;}
	public void setY2(int y2){this.y2 = y2;}

	public void setLado1(){this.lado1 = x2 - x1;}
	public void setLado2(){this.lado2 = y2 - y1;}

	//METODOS
	public void coordenadas ()
	{
		System.out.println("Coordenadas (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
	}

	//AREA
	public int area ()
	{
		int area = lado1 * lado2;
		return area;
	}
	
	public int perimetro ()
	{
		int perimetro = lado1 + lado2;
		return perimetro;
	}
}





























