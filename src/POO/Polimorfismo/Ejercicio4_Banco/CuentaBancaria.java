package POO.Polimorfismo.Ejercicio4_Banco;

public abstract class CuentaBancaria
{
    //ATRIBUTOS
    protected String IBAN;
    protected double saldo;
    protected double interesAnualBasico;

    //CONSTRUCTOR
    public CuentaBancaria(String IBAN, double saldo, double interesAnualBasico) {
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.interesAnualBasico = interesAnualBasico;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    //MÉTDOS
    public void consultarDatos() //Muestra los datos de la cuenta IBAN Y SALDO
    {
        System.out.println("\n-CONSULTA DE DATOS-\n");
        System.out.println("IBAN: " + this.IBAN);
        System.out.println("Saldo: " + this.saldo);
    }

    private void añadir (double cantidad) //Este método es llamado por los dos siguientes para las operaciones de ingresar y retirar dinero
    {
        this.saldo += cantidad;
    }

    public void ingresar (double cantidad) //Añade saldo a la cuenta
    {
        añadir(cantidad);
        System.out.println("Saldo añadido...");
    }

    public void retirar (double cantidad) //Añade saldo a la cuenta
    {
        añadir(-cantidad);
        System.out.println("Saldo retirado...");
    }

    public void transferencia (double cantidad, CuentaBancaria destino) //Retira dinero de la cuenta ORIGEN y la añade al DESTINO
    {
        retirar(cantidad);
        destino.ingresar(cantidad);
    }

    protected abstract void calcularIntereses ();
}
