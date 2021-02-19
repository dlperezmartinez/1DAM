package POO.Polimorfismo.Ejercicio3_Mascotas;

import java.util.ArrayList;

public class GestorMascotas
{
    public static void main(String[] args)
    {
        //INSTANCIAS
        Mascotas Kira = new Perro("Kira", "Vivo", "25345324", 2, "Pitbull", false);
        Mascotas Wendy = new Gato("Wendy", "Vivo", "53245", 7, "Naranja, blanco y marrón", false);
        Aves Jack = new Loro("Jack", "Vivo", "2354", 3, "Pico de loro", true, "Me lo invento", true);
        Aves Paco = new Canario("Paco", "Vivo", "34543252", 6, "Pico de canario", false, "Amarillo", true);
        //TODO preguntar a Jaume

        ArrayList<Mascotas> mascotas = new ArrayList<>();

        mascotas.add(Kira);
        mascotas.add(Wendy);
        mascotas.add(Jack);
        mascotas.add(Paco);

        //OPERACIONES
        System.out.println(Kira.habla());

        Wendy.cumpleaños();

        Jack.morir(true);
        System.out.println(Jack.muestra());

        Paco.volar();

    }
}
