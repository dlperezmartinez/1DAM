package Excepciones.TryCatchFinally.Ejercicio06;

import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {
        ArrayList<Gato> gatos = new ArrayList<>();
        //INSTANCIAS
        try
        {
        Gato gato1 = new Gato ("Wendy", 7);
        Gato gato2 = new Gato ("Meico", 4);
        //Gato gato3 = new Gato ("w", -3);
        Gato gato4 = new Gato ("Bichito", 0);

        gatos.add(gato1);
        gatos.add(gato2);
        //gatos.add(gato3);
        gatos.add(gato4);

        gato4.setEdad(-2);
        //gato3.setNombre("Gato");
        gato2.setNombre("W");

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        //PRINT
        for (Gato n: gatos)
        {
            System.out.println(n.toString());
        }
    }

}
