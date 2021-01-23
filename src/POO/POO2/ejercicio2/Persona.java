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
	
	public void datos()
	{
		System.out.println("\n-INTRODUCE TUS DATOS-\n");
		System.out.print("Nombre: ");
		nombre = in.nextLine();
		
		System.out.print("\nApellidos : ");
		apellidos = in.nextLine();
		
		System.out.print("\nDNI : ");
		dni = in.nextLine();
		
		System.out.print("\nEdad : ");
		edad = in.nextInt();
	}
	
	public void persona()
	{
		String esMayor = "es";
		if (edad < 18)
		{
			esMayor = " NO es";
		}
		
		System.out.println("\nPersona: " + nombre + " " + apellidos + " con DNI " + dni + esMayor +" mayor de edad");
	}
}
