package POO.POO2.ejercicio2;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		//CONSTRUCTOR
		Scanner in = new Scanner(System.in);
		
		//OBJETOS
		Persona uno = new Persona("20648562N", "Pepe", "Segundo", 54);
		Persona dos = new Persona("46532148A", "Fran", "Garcia", 16);
		Persona desconocida = new Persona();

		//PRINTS
		System.out.println(uno.nombre + " " + uno.apellidos + " con DNI " + uno.dni + " tiene " + uno.edad + " años.");
		System.out.println(dos.nombre + " " + dos.apellidos + " con DNI " + dos.dni + " tiene " + dos.edad + " años.");
		System.out.println(desconocida.nombre + " " + desconocida.apellidos + " con DNI " + desconocida.dni + " tiene " + desconocida.edad + " años.");
	}

}
