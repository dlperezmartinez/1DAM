package POO.Polimorfismo.Ejercicio3_Mascotas;

import java.util.ArrayList;

public class GestorMascotas
{
    public static void main(String[] args)
    {
        //INSTANCIAS
        Mascotas Kira = new Perro("Kira", "Vivo", "25345324", 2, "Pitbull", false);
        Mascotas Wendy = new Gato("Wendy", "Vivo", "53245", 7, "Naranja, blanco y marrón", false);
        Mascotas Jack = new Loro("Jack", 3, "Pico de loro", true, "Me lo invento", true);
        Mascotas Paco = new Canario();

        ArrayList<Mascotas> mascotas = new ArrayList<>();

        mascotas.add(Kira);
        mascotas.add(Wendy);
        mascotas.add(Jack);
        mascotas.add(Paco);

        //OPERACIONES
        Kira.habla();

        Wendy.cumpleaños();

        Jack.morir(true);
        Jack.muestra();

        Paco.volar();

    }
}
