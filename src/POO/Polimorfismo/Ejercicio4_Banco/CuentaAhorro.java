package POO.Polimorfismo.Ejercicio4_Banco;

public class CuentaAhorro extends CuentaBancaria
{
    //ATRIBUTOS
    private double saldoMinimo;

    //CONSTRUCTOR
    public CuentaAhorro(String IBAN, double saldo, double interesAnualBasico)
    {
        super(IBAN, saldo, interesAnualBasico);
    }

    //MÉTODOS
    public void calcularIntereses()
    {
        this.saldo += this.saldo * (this.interesAnualBasico / 100);
    }
}
