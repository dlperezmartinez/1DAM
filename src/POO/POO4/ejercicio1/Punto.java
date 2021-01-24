package POO.POO3.ejercicio1;

public class Punto 
{
	private int coordenadaY;
	private int coordenadaX;

	public Punto(int x, int y)
	{
		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	public Punto()
	{
		this.coordenadaX = 0;
		this.coordenadaY = 0;
	}

	public int getCoordenadaX()
	{
		return coordenadaX;
	}

	public int getCoordenadaY()
	{
		return coordenadaY;
	}

	public void setCoordenadaX(int x) {this.coordenadaX = x; }

	public void setCoordenadaY(int y)
	{
		this.coordenadaY = y;
	}
}
