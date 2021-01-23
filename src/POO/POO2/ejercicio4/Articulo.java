package POO2.ejercicio4;

public class Articulo 
{
	//ATRIBUTOS
	public String nombre;
	public double precio;
	public int iva;
	public int cuantosQuedan;
	public double pvp;
	
	
	public void mostrarArticulo()
	{	
		System.out.println(nombre + " - Precio: " + precio + "€ IVA: " + iva + "% - PVP: " + pvp + "€");
	}
}
