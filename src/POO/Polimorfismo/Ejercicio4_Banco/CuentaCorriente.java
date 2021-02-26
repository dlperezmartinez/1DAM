package POO.Polimorfismo.Ejercicio4_Banco;

public class CuentaCorriente extends CuentaBancaria
{
    //CONSTRUCTOR
    public CuentaCorriente(String IBAN, double saldo, double interesAnualBasico)
    {
        super(IBAN, saldo, interesAnualBasico);
    }

    //MÉTODOS
    public void calcularIntereses()
    {

    }
}
