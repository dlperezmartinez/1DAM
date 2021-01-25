package POO.POO4.ejercicio2;

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
		String noEs = "No es "; //Se utiliza para los metodos esMayorEdad y esJubilado

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

		//METODOS
		uno.imprime();
		if (uno.esMayorEdad(edad)) //Comprueba si es mayor de edad
		{
			noEs = "Es ";
		}
		System.out.println(noEs + "mayor de edad.");
		noEs = "No es "; //Reset

		if (uno.esJubilado(uno.getEdad())) //Comprueba si es jubilado
		{
			noEs = "Es ";
		}
		System.out.println(noEs + "jubilado.");

		System.out.print("La diferencia es: " + uno.diferenciaEdad(uno));
	}
}
