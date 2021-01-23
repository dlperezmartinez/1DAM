package POO2.ejercicio4;

public class Principal 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		Articulo articulo1 = new Articulo();
		//Asignación de atributos
		articulo1.nombre = "Pantalla";
		articulo1.precio = 156.53;
		articulo1.iva = 21;
		
		articulo1.pvp = (articulo1.precio +  (articulo1.precio * articulo1.iva) / 100);
		
		articulo1.mostrarArticulo();
	}

}
