package POO.CalculadoraNumComplejos;

public class NumerosComplejos
{
    //ATRIBUTOS
    private double real;
    private double im;

    //CONSTRUCTOR
    public NumerosComplejos()
    {
        this.real = 0;
        this.im = 0;
    }

    public NumerosComplejos(double x, double y)
    {
        this.real = x;
        this.im = y;
    }

    //GETTERS Y SETTERS
    public double getReal() {
        return real;
    }

    public double getIm() {
        return im;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setIm(double im) {
        this.im = im;
    }
    //METODOS

    public String print () //Imprime un NumeroComplejo con su estructura tipica
    {
        return "(" + this.real + " , " + this.im + "i)";
        // + operador[tipoO] + "(" + c.real + " + " + c.im + "i) " + " = (" + resRe + " + " + resIm + "i)"
    }
}
