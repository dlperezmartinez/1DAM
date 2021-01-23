package POO.POO2.ejercicio3;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//IN
		Scanner in = new Scanner(System.in);
		//VARIABLES
		int menu = 0;
		String numero;
		
		//OBJETOS
		Rectangulo uno = new Rectangulo();
		Rectangulo dos = new Rectangulo();
		
		//OPERACIONES
		//Rectangulo uno.
		System.out.println("\nRECTANGULO UNO\n");
		
		//Definir atributos
		uno.x1 = 0;
		uno.y1 = 0;
		uno.x2 = 5;
		uno.y2 = 5;
		
		//calculos
		uno.lado1 = uno.x2 - uno.x1;
		uno.lado2 = uno.y2 - uno.y1;
		
		//metodos
		uno.coordenadas();
		uno.area();
		uno.perimetro();
		
		//Rectangulo dos.
		System.out.println("\nRECTANGULO DOS\n");
		
		//Definir atributos
		dos.x1 = 7;
		dos.y1 = 9;
		dos.x2 = 2;
		dos.y2 = 3;
		
		//calculos
		dos.lado1 = dos.x2 - dos.x1;
		dos.lado2 = dos.y2 - dos.y1;

		//métodos
		dos.coordenadas();
		dos.area();
		dos.perimetro();
		
	}
}


























