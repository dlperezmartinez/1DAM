package POO.Polimorfismo.Ejercicio5_EmpresaYEmpleados;

public class Empleado
{
    //ATRIBUTOS
    private final String nombre, DNI;
    private String telefono, direccion;
    private int edad;
    private double sueldo; //Mensual

    //CONSTRUCTOR
    public Empleado(String nombre, String DNI, double sueldo) //Campos obligatorios
    {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String DNI, String telefono, String direccion, int edad, double sueldo)
    {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    //MÉTODOS
    public double calcularSaldoNeto ()
    {
        double resultado;
        double sueldoAnual = this.sueldo * 12;
        double irpf;

        if (sueldoAnual < 12000) //MENOR a 12000 20% de IRPF
        {
            irpf = 20;
        }
        else if (sueldoAnual < 25000) //ENTRE 12000 y 25000 30% de IRPF
        {
            irpf = 30;
        }
        else //MAYOR a 25000 40% de IRPF
        {
            irpf = 40;
        }

        return resultado = sueldoAnual - (sueldoAnual * (irpf / 100));

        //System.out.println("El sueldo neto de " + this.nombre + " és: " + resultado);

    }

    @Override
    public String toString() {
        return  "\n-EMPLEADO-\n" +
                "\nnombre='" + nombre + '\'' +
                "\nDNI='" + DNI + '\'' +
                "\ntelefono='" + telefono + '\'' +
                "\ndireccion='" + direccion + '\'' +
                "\nedad=" + edad +
                "\nsueldo=" + sueldo;
    }
}
