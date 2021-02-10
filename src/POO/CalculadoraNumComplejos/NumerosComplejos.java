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
    //print NumerosComplejos
    public String print () //Imprime un NumeroComplejo con su estructura tipica
    {
        return "(" + String.format("%.2f", this.real) + " , " + String.format("%.2f", this.im) + "i)";
    }
}


