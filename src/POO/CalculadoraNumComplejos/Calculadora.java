package POO.CalculadoraNumComplejos;

public class Calculadora
{

    //ATRIBUTOS
    private NumerosComplejos operando1, operando2, resultado; //Almacena los DOS números complejos y el resultado de la operación.
    private  char operador; //Se utiliza para determinar el operador en el print
    //private double resultado; //Resultado real y resultado imaginario.

    //CONSTRUCTOR
    public Calculadora()
    {
        this.operando1 = new NumerosComplejos();
        this.operando2 = new NumerosComplejos();
        this.resultado = new NumerosComplejos();
        this.operador = ' ';
    }

    public NumerosComplejos suma(NumerosComplejos c1, NumerosComplejos c2)
    {
        this.operando1 = c1;
        this.operando2 = c2;
        this.operador = '+';

        double resReal, resImaginario;

        resReal = c1.getReal() + c2.getReal(); //Las dos partes reales
        resImaginario = c1.getIm() + c2.getIm(); //Las dos partes imaginarias
        resultado = new NumerosComplejos(resReal, resImaginario); //Resultado
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "operando1=" + operando1 +
                + operador +
                ", operando2=" + operando2 +
                ", resultado=" + resultado +
                '}';
    }
}
