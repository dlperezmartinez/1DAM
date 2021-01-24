package POO.POO3.ejercicio2;

import java.util.Scanner;

public class Persona 
{
	//CONSTRUCTOR
	Scanner in = new Scanner(System.in);
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona()
	{
		this.dni = "Unknown";
		this.nombre = "Anonimo";
		this.apellidos = "Anonimo";
		this.edad = 0;
	}

	public Persona(String dni, String nombre, String apellidos, int edad)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	//GETTER Y SETTERS
	//dni
	public String getDni() { return dni; }
	public void setDni(String dni) { this.dni = dni; }

	//nombre
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	//apellidos
	public String getApellidos() { return apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }

	//edad
	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }
}
