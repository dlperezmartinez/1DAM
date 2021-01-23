package POO.POO1.ejercicio1;

public class Principal {

	public static void main(String[] args) 
	{
		Punto uno = new Punto();
		Punto dos = new Punto();
		Punto tres = new Punto();
		
		uno.nombrePunto = "uno";
		uno.coordenadaY=5;
		uno.coordenadaX=5;
		uno.setCoordenadaY();
		uno.setCoordenadaX();
		
		dos.nombrePunto = "dos";
		dos.coordenadaY=10;
		dos.coordenadaX=10;
		dos.setCoordenadaY();
		dos.setCoordenadaX();
		
		tres.nombrePunto = "tres";
		tres.coordenadaY=-3;
		tres.coordenadaX=7;
		tres.setCoordenadaY();
		tres.setCoordenadaX();
	}

}
