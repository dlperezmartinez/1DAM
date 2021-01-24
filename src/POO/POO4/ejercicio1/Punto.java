package POO.POO4.ejercicio1;

import java.util.Scanner;

public class Punto 
{
	//SCANNER
	Scanner in = new Scanner (System.in);

	//VARIABLES
	private int coordenadaY;
	private int coordenadaX;

	//CONSTRUCTORES
	public Punto()
	{
		this.coordenadaX = 0;
		this.coordenadaY = 0;
	}

	//MÉTODOS
	public void imprime() // Imprime por pantalla las coordenadas.
	{
		System.out.println("Coordenadas del punto: X " + coordenadaX + " Y " + coordenadaY);
	}

	public void setXY(int x, int y) // Modifica ambas coordenadas.
	{
		coordenadaX = x;
		coordenadaY = y;
	}

	public void desplaza(int dx, int dy) // Desplaza el punto la cantidad (dx,dy) indicada
	{
		coordenadaX += dx;
		coordenadaY += dy;
	}

	/*public int distancia(Punto p) // Calcula y devuelve la distancia
	{
		int distancia = Math.sqrt(());
		return distancia;
	}*/

	//GETTERS Y SETTERS
	public int getCoordenadaX()
	{
		return coordenadaX;
	}

	public int getCoordenadaY()
	{
		return coordenadaY;
	}

	public void setCoordenadaX(int x) {this.coordenadaX = x; }

	public void setCoordenadaY(int y)
	{
		this.coordenadaY = y;
	}
}
