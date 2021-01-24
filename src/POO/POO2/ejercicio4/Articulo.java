package POO.POO2.ejercicio4;

public class Articulo 
{
	//ATRIBUTOS
	public String nombre;
	public float precio;
	public float iva;
	public float pvp;
	public int cuantosQuedan;

	public Articulo(String nombre, float precio, float iva, int cuantosQuedan)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.pvp = (precio * ((iva/100) + 1));
		this.cuantosQuedan = cuantosQuedan;

	}

	public void mostrarArticulo()
	{	
		System.out.println(nombre + " - Precio: " + precio + "€ IVA: " + iva + "% - PVP: " + pvp + "€");
	}
}
