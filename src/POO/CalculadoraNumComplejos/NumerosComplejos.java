package POO.CalculadoraNumComplejos;

public class NumerosComplejos
{
    //ATRIBUTOS
    private double real;
    private double im;

    //VARIABLES
    private double resRe, resIm; //Resultado real y resultado imaginario.

    //CONSTRUCTOR
    public NumerosComplejos(double x, double y)
    {
        this.real = x;
        this.im = y;
    }

    //METODOS
    public void suma(NumerosComplejos c)
    {
        resRe = this.real + c.real;
        resIm = this.im + c.im;
    }

    public void print (NumerosComplejos c)
    {
        System.out.println("(" + this.real + " + " + this.im + "i) + " + "(" + c.real + " + " + c.im + "i) " + " = (" + resRe + " + " + resIm + "i)");
    }
}
