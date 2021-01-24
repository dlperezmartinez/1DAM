package POO.POO2.ejercicio3;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//IN
		Scanner in = new Scanner(System.in);

		//OBJETOS
		System.out.println("Introduce las coordenadas del Rectangulo con este orden (x1,y1) (x2,y2)");
		Rectangulo uno = new Rectangulo(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

		if (uno.continuar) //Si se NO se cumple la condición if de Rectangulo funciona el resto del programa.
		{
			uno.coordenadas();
			uno.area();
			uno.perimetro();
		}
	}
}


























