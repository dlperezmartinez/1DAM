package POO.POO3.ejercicio2;

import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args) 
	{
		//CONSTRUCTOR
		Scanner in = new Scanner(System.in);

		//VARIABLES
		String dni;
		String nombre;
		String apellidos;
		int edad;

		//OBJETOS
		Persona uno = new Persona();
		Persona dos = new Persona();
		Persona desconocida = new Persona();

		//SETTERS
		uno.setDni("00000001A");
		uno.setNombre("Paco");
		uno.setApellidos("Francis");
		uno.setEdad(90);

		//GETTERS
		dni = uno.getDni();
		nombre = uno.getNombre();
		apellidos = uno.getApellidos();
		edad = uno.getEdad();

		//PRINTS
		System.out.println(nombre + " " + apellidos + " con DNI " + dni + " tiene " + edad + " años.");
	}
}
