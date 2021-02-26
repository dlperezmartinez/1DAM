package POO.Polimorfismo.Ejercicio5_EmpresaYEmpleados;

public class Programa
{
    public static void main(String[] args)
    {
        //INSTANCIAS
        //Empresas
        Empresa empresa1 = new Empresa("Empresa1", "E23JL345L43", "234432243", "Calle 1 sitio1");

        //Empleados
        Empleado empleado11 = new Empleado("Empleado11", "23435465N", "134234243", "Calle11 sitio11", 23, 1500);
        Empleado empleado111 = new Empleado("Empleado111", "23435465V", "134234243", "Calle111 sitio111", 24, 1300);
        Empleado empleado1111 = new Empleado("Empleado1111", "23435465B", "134234243", "Calle1111 sitio1111", 26, 1800);

        //OPERACIONES
        empresa1.mostrarInformacion();
    }
}
