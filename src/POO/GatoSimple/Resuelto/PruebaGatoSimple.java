package POO.GatoSimple.Resuelto;

import java.util.ArrayList;

/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 */
public class PruebaGatoSimple
{
	
  public static void main(String[] args)
  {
    
    GatoSimple garfield = new GatoSimple("Garfield","rojo","siames","macho",5,12);
    
    System.out.println("hola gatito");
    garfield.maulla();
    System.out.println("toma tarta");
    garfield.come("tarta selva negra");
    System.out.println("toma pescado, a ver si esto te gusta");
    garfield.come("pescado");
    
    GatoSimple tom = new GatoSimple("Tom","rojo","siames","macho",5,12);
    
    System.out.println("Tom, toma sopita de verduras");
    tom.come("sopa de verduras");
    
    GatoSimple lisa = new GatoSimple("Lisa","rojo","siames","hembra",5,12);
    
    System.out.println("gatitos, a ver cómo maulláis");
    garfield.maulla();
    tom.maulla();
    lisa.maulla();
    
    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);
    
    
    // Vector de objetos de tipo GatoSimple

    GatoSimple vectorGatos[]=new GatoSimple[4];
    
    vectorGatos[0]=garfield;
    vectorGatos[1]=tom;
    vectorGatos[2]=lisa;
    vectorGatos[3]=new GatoSimple("Any","rojo","siames","hembra",5,12);
    //vectorGatos[4]=new GatoSimple("Samy","rojo","siames","hembra",5,12);
    
    
    System.out.println("\n***** VECTOR DE GATOS ******\n");
    
    for (GatoSimple gato : vectorGatos)
    {
    	System.out.println(gato.toString());
		
	}

    //ARRAYLIST
    ArrayList<GatoSimple> listaGatos = new ArrayList<GatoSimple>();

    listaGatos.add(garfield);
    listaGatos.add(tom);
    listaGatos.add(0, lisa);

    System.out.println("\n-LISTA DE GATOS-\n");

    for (GatoSimple i : listaGatos)
    {
      System.out.println(i.toString());
    }

    //PRUEBA GET
    System.out.println("\n-PRUEBA GET-\n");
    System.out.println(listaGatos.get(0));

    //PRUEBA CLEAR
    listaGatos.clear();

    //PRUEBA ISEMPTY
    System.out.println("\n-PRUEBA ISEMPTY-\n");
    System.out.println(listaGatos.isEmpty());

    //PRUEBA BOOLEAN ADD
    listaGatos.add(lisa);

    //PRUEBA VOID ADD
    listaGatos.add(0, tom);
    listaGatos.add(new GatoSimple("asdf", "sdaf", "asdf", "asdf", 2, 3));
    System.out.println("\n-PRUEBA ADD'S-\n");

    for (GatoSimple i : listaGatos)
    {
      System.out.println(i.toString());
    }


    //PRUEBA SET
    System.out.println("\n-PRUEBA SET-\n");
    listaGatos.set(0, garfield);

    for (GatoSimple i : listaGatos)
    {
      System.out.println(i.toString());
    }

    //PRUEBA CONTAINS
    System.out.println("\n-PRUEBA CONTAINS-\n");

    System.out.println("Contiene tom: " + listaGatos.contains(tom));
    System.out.println("Contiene lisa: " + listaGatos.contains(lisa));

    //PRUEBA INDEXOF
    System.out.println("\n-PRUEBA INDEXOF-\n");

    System.out.println("Contiene tom: " + listaGatos.indexOf(tom));
    System.out.println("Contiene lisa: " + listaGatos.indexOf(lisa));

    //PRUEBA LASTINDEXOF
    System.out.println("\n-PRUEBA LASTINDEXOF-\n");

    System.out.println("Contiene tom: " + listaGatos.lastIndexOf(tom));
    System.out.println("Contiene lisa: " + listaGatos.lastIndexOf(lisa));

    //PRUEBA REMOVE
    System.out.println("\n-PRUEBA REMOVE-\n");

    listaGatos.remove(lisa);
    listaGatos.remove(0);

    for (GatoSimple i : listaGatos)
    {
      System.out.println(i.toString());
    }
  }
}

