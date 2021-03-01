package POO.Polimorfismo.Ejercicio5_EmpresaYEmpleados;

import java.util.ArrayList;

public class Empresa
{
    //ATRIBUTOS
    private final String nombre, CIF;
    private String telefono, direccion;
    ArrayList<Empleado> empleados = new ArrayList<>();

    //CONSTRUCTOR
    public Empresa(String nombre, String CIF, String telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getNombre() {
        return nombre;
    }

    //MÉTODOS
    public void agregarEmpleados (Empleado emp)
    {
        empleados.add(emp);
    }

    public void mostrarInformacion () //Muestra la información de todos los empleados
    {
        for (Empleado n : empleados)
        {
            System.out.println(n.toString());
        }
    }

    public void mostrarSueldo ()
    {
        for (Empleado n : empleados)
        {
            System.out.println("\n-SUELDO ANUAL-\n");
            System.out.println("DNI: " + n.getDNI());
            System.out.println("Sueldo bruto: " + n.getSueldo() * 12);
            System.out.println("Sueldo neto: " + n.calcularSaldoNeto());
        }
    }

    public double calcularSueldosBrutos()
    {
        double sueldosBrutos = 0;

        for (Empleado n : empleados)
        {
            sueldosBrutos += n.getSueldo() * 12;
        }
        return sueldosBrutos;
    }

    public double calcularSueldosNetos()
    {
        double sueldosNetos = 0;

        for (Empleado n : empleados)
        {
            sueldosNetos += n.calcularSaldoNeto();
        }
        return sueldosNetos;
    }


}
