package Excepciones.TryCatchFinally.DeparBankv2;

public class Movimientos //Esta clase sirve para registrar todos los movimientos que hace el usuario, guarda los ingresos, las retiradas y el saldo que queda en ese movimiento
{
    //ATRIBUTOS
    private float saldo[] = new float[100]; //Almacena saldos
    private float ingreso[] = new float[100]; //Almacena ingresos
    private float retirada[] = new float[100];//Almacena retiradas
    private int comprobante[] = new int[100]; //Se utiliza para indexar ingresos(1) y retiradas(-1)

    public Movimientos()
    {

    }

    //VARIABLES
    private int contador = 0;

    //SETTERS
    public void ingreso(float ingreso)
    {
        this.ingreso[contador] = ingreso;
    }
    public void retirada(float retirada)
    {
        this.retirada[contador] = retirada;
    }
    public void saldo(float saldo)
    {
        this.saldo[contador] = saldo;
    }
    public void setContador(int contador) {
        this.contador += contador;
    }
    public void setComprobante(int comprobante) {
        this.comprobante[contador] = comprobante;
    }

    //METODOS
    public void mostrarMovimientos () //Metodo para mostrar los movimientos de ingresos y retiros de dinero
    {
        for (int i = 0; i < contador; i++)
        {
            if (this.comprobante[i] == 1)
            {
                System.out.println(i + ". Ingreso de " + this.ingreso[i] + " Saldo: " + this.saldo[i]);
            }
            else
            {
                System.out.println(i + ". Retirada de " + this.retirada[i] + " Saldo: " + this.saldo[i]);
            }
        }
    }

}
