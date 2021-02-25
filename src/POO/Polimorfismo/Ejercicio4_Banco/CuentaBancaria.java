package POO.Polimorfismo.Ejercicio4_Banco;

public class CuentaBancaria
{
    //ATRIBUTOS
    private String IBAN;
    private double saldo;

    //GETTERS Y SETTERS


    //MÉTDOS
    public void consultarDatos() //Muestra los datos de la cuenta IBAN Y SALDO
    {
        System.out.println("\n-CONSULTA DE DATOS-\n");
        System.out.println("IBAN: " + this.IBAN);
        System.out.println("Saldo: " + this.saldo);
    }

    public void ingresar (double cantidad) //Añade saldo a la cuenta
    {
        this.saldo += cantidad;
        System.out.println("Saldo añadido...");
    }

    public void retirar (double cantidad) //Añade saldo a la cuenta
    {
        this.saldo -= cantidad;
        System.out.println("Saldo retirado...");
    }

    public void transferencia (CuentaBancaria origen, double cantidad, CuentaBancaria destino)
    {

    }
}
