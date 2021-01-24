package POO.POO2.ejercicio2;

import java.util.Scanner;

public class Persona 
{
	//CONSTRUCTOR
	Scanner in = new Scanner(System.in);
	
	public String dni;
	public String nombre;
	public String apellidos;
	public int edad;

	public Persona()
	{
		this.dni = "Unknown";
		this.nombre = "Anonimo";
	}

	public Persona(String dni, String nombre, String apellidos, int edad)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
