package POO.CalculadoraNumComplejos;

public class Calculadora
{

    //ATRIBUTOS
    private NumerosComplejos operando1, operando2, resultado;
    private double resDenominador; //Almacena los DOS números complejos y el resultado de la operación.
    private  char operador; //Se utiliza para determinar el operador en el print
    //private double resultado; //Resultado real y resultado imaginario.

    //CONSTRUCTOR
    public Calculadora()
    {
        this.operando1 = new NumerosComplejos();
        this.operando2 = new NumerosComplejos();
        this.resultado = new NumerosComplejos();
        this.resDenominador = 0;
        this.operador = ' ';
    }

    //METODOS
    //suma
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

    //resta
    public NumerosComplejos resta(NumerosComplejos c1, NumerosComplejos c2)
    {
        this.operando1 = c1;
        this.operando2 = c2;
        this.operador = '-';

        double resReal, resImaginario;

        resReal = c1.getReal() - c2.getReal(); //Las dos partes reales
        resImaginario = c1.getIm() - c2.getIm(); //Las dos partes imaginarias
        resultado = new NumerosComplejos(resReal, resImaginario); //Resultado
        return resultado;
    }

    //multiplicación
    public NumerosComplejos multiplicacion(NumerosComplejos c1, NumerosComplejos c2)
    {
        this.operando1 = c1;
        this.operando2 = c2;
        this.operador = '*';

        double resReal, resImaginario;

        resReal = c1.getReal() * c2.getReal() - c1.getIm() * c2.getIm(); //Las dos partes reales
        resImaginario = c1.getReal() * c2.getIm() + c1.getIm() * c2.getReal(); //Las dos partes imaginarias
        resultado = new NumerosComplejos(resReal, resImaginario); //Resultado
        return resultado;
    }

    //división
    public NumerosComplejos division(NumerosComplejos c1, NumerosComplejos c2)
    {
        this.operando1 = c1;
        this.operando2 = c2;
        this.operador = '/';

        double resReal, resImaginario;

        resReal = c1.getReal() * c2.getReal() + c1.getIm() * c2.getIm(); //Las dos partes reales
        resImaginario = c1.getIm() * c2.getReal() - c1.getReal() * c2.getIm(); //Las dos partes imaginarias
        resDenominador = c2.getReal() * c2.getReal() + c2.getIm() * c2.getIm(); //Resultado del denominador.
        resultado = new NumerosComplejos(resReal, resImaginario); //Resultado
        return resultado;
    }

    //print resultado (numero complejo resultado)
    public String print(NumerosComplejos c1, NumerosComplejos c2)
    {
        if (operador == '/')
        {
            return c1.print() + operador + c2.print()+ "=" + resultado.print() + operador + resDenominador;
        }
        else
        {
            return c1.print() + operador + c2.print() + "=" + resultado.print();
        }
    }

    //suma vector
    public NumerosComplejos sumaVector (NumerosComplejos v[])
    {
        for (int i = 0; i < v.length; i++)
        {
            int j = 1;
            resultado = suma(v[0], v[j]);
        }
        return resultado;
    }
}
