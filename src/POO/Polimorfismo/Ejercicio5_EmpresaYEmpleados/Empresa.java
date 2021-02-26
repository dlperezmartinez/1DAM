package POO.Polimorfismo.Ejercicio5_EmpresaYEmpleados;

import java.util.ArrayList;

public class Empresa
{
    //ATRIBUTOS
    private final String nombre, CIF;
    private String telefono, direccion;
    ArrayList<Empleado> empleados;

    //CONSTRUCTOR
    public Empresa(String nombre, String CIF, String telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //MÉTODOS
    public void mostrarInformacion () //Muestra la información de todos los empleados
    {
        for (Empleado n : empleados)
        {
            System.out.println(n.toString());
        }
    }
}
