package POO.Polimorfismo.Ejercicio3_Mascotas;

import java.util.ArrayList;

public class GestorMascotas
{
    public static void main(String[] args)
    {
        Inventario inventario = new Inventario();
        //INSTANCIAS
        Mascotas Kira = new Perro("Kira", "Vivo", "25345324", 2, "Pitbull", false);
        Mascotas Wendy = new Gato("Wendy", "Vivo", "53245", 7, "Naranja, blanco y marrón", false);
        Aves Jack = new Loro("Jack", "Vivo", "2354", 3, "Pico de loro", true, "Me lo invento", true);
        Aves Paco = new Canario("Paco", "Vivo", "34543252", 6, "Pico de canario", false, "Amarillo", true);

        //OPERACIONES
        //Insertar animales en inventario
        inventario.insertarMascota(Kira);
        inventario.insertarMascota(Wendy);
        inventario.insertarMascota(Jack);
        inventario.insertarMascota(Paco);

        //Mostrar datos
        inventario.mostrarListaMascotas();

        inventario.mostarDatosMascota(Kira);

        inventario.mostrarDatosTodasMascotas();

        inventario.eliminarMascota(Jack);

        inventario.mostrarListaMascotas();

    }
}
