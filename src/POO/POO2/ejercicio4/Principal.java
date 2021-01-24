package POO.POO2.ejercicio4;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//IN
		Scanner in = new Scanner(System.in);

		//OBJETOS
		Articulo articulo1 = new Articulo(in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextInt());
//Las restricciones ya las hace el tipo de variable, no?
		//MOSTRAR
		articulo1.mostrarArticulo();
	}

}
