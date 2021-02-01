package POO.CalculadoraNumComplejos;

public class VectorNumComp {

    //ATRIBUTOS
    private NumerosComplejos vector;

    //generador de vectores de NumerosComplejos
    public NumerosComplejos generadorVector(NumerosComplejos cvector[])
    {
        for (int i = 0; i < cvector.length; i++)
        {
            cvector[i] = new NumerosComplejos();
        }
        return cvector[cvector.length];
    }
}
