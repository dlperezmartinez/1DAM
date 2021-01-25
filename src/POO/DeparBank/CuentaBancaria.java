package POO.DeparBank;

public class CuentaBancaria
{
    //ATRIBUTOS
    private final String iban;
    private final String titular;
    private float saldo;
    private String movimientos[];

    //VARIABLES
    int contador = 0;

    public CuentaBancaria(String titular, String iban)
    {
        this.iban = iban;
        this.titular = titular;
        saldo = 0;
        movimientos = new String[100];

    public CuentaBancaria()
    {
        this.iban = "Unknown";
        this.titular = "Unknown";
        saldo = 0;
        movimientos = new String[100];
    }

    //GETTERS Y SETTERS
    //Getters
    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public String[] getMovimientos() {
        return movimientos;
    }
    //Setters
    public void setMovimientos(String[] movimientos) {
        this.movimientos = movimientos;
    }

    //METODOS
    public float ingreso (float cantidad, float saldo)
    {
        saldo += cantidad;
        return saldo;
    }

    public float retirada(float cantidad, float saldo)
    {
        saldo -= cantidad;
        return saldo;
    }

    public void mostrarMovimientos()
    {
        for (int i = 0; i < contador; i++)
        {
            System.out.println(i + ". " + movimientos[0]);
        }
    }

}
