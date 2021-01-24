package POO.POO3.ejercicio4;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args)
	{
		//IN
		Scanner in = new Scanner(System.in);

		//OBJETOS
		Articulo articulo1 = new Articulo();

		//GETTERS Y SETTERS
		articulo1.setNombre("Pantalla");
		articulo1.setPrecio(456);
		articulo1.setIva(21);
		articulo1.setPvp();
		//mostrar
		System.out.println("\n-ARTICULO-\n");
		System.out.print("Nombre: " + articulo1.getNombre());
		System.out.print("\nPrecio: " + articulo1.getPrecio());
		System.out.print("\nIVA: " + articulo1.getIva() + "%");
		System.out.print("\nPVP: " + articulo1.getPvp());
	}

}
