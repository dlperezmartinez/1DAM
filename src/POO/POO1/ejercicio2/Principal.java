package POO1.ejercicio2;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//CONSTRUCTOR
		Scanner in = new Scanner(System.in);
		
		//OBJETOS
		Persona uno = new Persona();
		Persona dos = new Persona();
		
		//OPERACIONES
		uno.datos();
		uno.persona();
		
		dos.datos();
		dos.persona();
	}

}
