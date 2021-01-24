package POO.POO4.ejercicio4;

public class Articulo 
{
	//ATRIBUTOS
	private String nombre;
	private float precio;
	private float iva;
	private float pvp;
	private int cuantosQuedan;

	public Articulo ()
	{
		this.nombre = "Unknown";
		this.precio = 0;
		this.iva = 0;
		this.pvp = 0;
		this.cuantosQuedan = 0;
	}

	public void mostrarArticulo()
	{	
		System.out.println(nombre + " - Precio: " + precio + "€ IVA: " + iva + "% - PVP: " + pvp + "€");
	}

	//GETTERS Y SETTERS
	//nombre
	public String getNombre(){return nombre;}
	public void setNombre(String nombre){this.nombre = nombre;}
	//precio
	public float getPrecio(){return precio;}
	public void setPrecio(float precio){this.precio = precio;}
	//iva
	public float getIva() {return iva;}
	public void setIva(float iva) {this.iva = iva;}
	//pvp
	public float getPvp() {return pvp;}
	public void setPvp() {this.pvp = precio * ((iva/100) + 1);}
}
