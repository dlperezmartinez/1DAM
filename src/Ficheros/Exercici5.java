package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
/* TODO
public class Exercici5 {
	public static void main(String[] args) {

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
        File fotografies = new File("Documentos/Fotografias");
        File llibres = new File("Documentos/Libros");
        File documents = new File("Documentos");

        boolean resultat = false;

        try {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
        	resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    } // Del main()
	

   /* Crea una funci� anemomenada esborrarTot() que elimine tots els arxius i carpetes d'una ruta,
    * 
    * Si no existeix la ruta mostra una excepci�.
    * Si �s un arxiu l'esborrem
    * Si �s una carpeta, primer eliminem tots els seus arxius, i despr�s, esborre la carpeta
    * 
    */
  


//TODO} // de la classe

