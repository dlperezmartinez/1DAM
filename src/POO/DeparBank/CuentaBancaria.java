package POO.DeparBank;

public class CuentaBancaria
{
    //ATRIBUTOS
    private final String iban;
    private final String titular;
    private float saldo;
    private String movimientos[];

    Movimientos movimiento = new Movimientos();

    //VARIABLES
    int contador = 0;

    public CuentaBancaria(String titular, String iban)
    {
        this.iban = iban;
        this.titular = titular;
        saldo = 0;
        movimientos = new String[100];
    }

    //GETTERS Y SETTERS
    //Getters
    public String getIban ()
    {
        return iban;
    }

    public String getTitular () {
        return titular;
    }

    public float getSaldo () {
        return saldo;
    }

    public String[] getMovimientos () {
        return movimientos;
    }
    //Setters
    public void setMovimientos (String[]movimientos){
        this.movimientos = movimientos;
    }

    //METODOS
    public void ingreso ( float cantidad ) //Metodo para ingresar dinero
    {
        this.saldo += cantidad;
        movimiento.ingreso(cantidad);
        movimiento.saldo(this.saldo);
        movimiento.setComprobante(1);
        movimiento.setContador(1);
    }

    public void retirada ( float cantidad ) //Metodo para retirar dinero
    {
        this.saldo -= cantidad;
        movimiento.retirada(cantidad);
        movimiento.saldo(this.saldo);
        movimiento.setComprobante(-1);
        movimiento.setContador(1);
    }

    public void mostrarMovimientos()
    {
        movimiento.mostrarMovimientos();
    }
}

