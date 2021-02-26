package POO.Polimorfismo.Ejercicio4_Banco;

public class Gestor
{
    public static void main(String[] args)
    {
       //INSTANCIAS
        //CuentaCorriente
        CuentaBancaria cuenta1 = new CuentaCorriente("ES210349718590723184", 0, 3);
        CuentaBancaria cuenta2 = new CuentaCorriente("ES21033443", 100, 2);

        //CuentaAhorro
        CuentaBancaria cuenta3 = new CuentaAhorro("ES2103497543153245", 5000, 6);

        //OPERACIONES
        System.out.println("\nMostrar datos de la cuenta1");
        cuenta1.consultarDatos();

        System.out.println("\nIngresar dinero en las cuentas 1 y 2");
        cuenta1.ingresar(500);
        cuenta2.ingresar(1200);

        System.out.println("\nMostrar datos de cuenta1 y cuenta2");
        cuenta1.consultarDatos();
        cuenta2.consultarDatos();

        System.out.println("\nTransferencia desde cuenta1 a cuenta2 de 300");
        cuenta1.transferencia(300, cuenta2);

        System.out.println("\nMostrar datos de cuenta1 y cuenta2");
        cuenta1.consultarDatos();
        cuenta2.consultarDatos();

        System.out.println("\n***************************************************\n");
        System.out.println("\nCalcular intereses de la cuenta de ahorro cuenta3");
        System.out.println("\nPrimero se muestran los datos");
        cuenta3.consultarDatos();
        System.out.println("\nAplicamos los intereses");
        cuenta3.calcularIntereses();
        System.out.println("\nVolvemos a consultar datos");
        cuenta3.consultarDatos();

    }
}
