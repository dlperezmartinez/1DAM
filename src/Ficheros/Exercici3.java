package Ficheros;

import java.io.File;
import java.util.Arrays;



/*
 * M�todes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 * 
 * M�todes de la classe ARRAYS
 * sort()
 * 
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funci� anomenada imprimirLlistaArxius() 
 * Per esborrar les extensions crearem una funci� anomenada llevarExtensionsArxius()
 * 
 */

public class Exercici3 {
	

    /* **************************
     * Reanomenem les carpetes *
     * **************************/

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta dest�. (PER A LA CARPETA DOCUMENTS)       
	
	public static void main (String args[]) {
		
		File docOrigen = new File("Documentos");
		File docDesti =new File("DOCS");

// Comprove que la carpetada DOCUMENTOS esta creada, simplement �s per acotar errors
		
		if(!docOrigen.exists())
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		
// Reanomenem la carpeta Documents
		docOrigen.renameTo(docDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta dest�. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
		
		File fotoOrigen = new File("DOCS/Fotografias");
		File fotoDesti = new File("DOCS/FOTOS");
		fotoOrigen.renameTo(fotoDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta dest�. // (PER A LA CARPETA LIBROS) i canviem el nom
		
		File llibreOrigen = new File("DOCS/Libros");
		File llibreDesti = new File("DOCS/LECTURES");
		llibreOrigen.renameTo(llibreDesti);
		

		/* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
           ********************************************************** */
        
  // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funci� imprimirLlistaArxius()


		
		

// Reanomenem els arxius, llenvant les Extensions cridant a la funci� llevarExtensionsArxius()


		
		

// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funci� imprimirLlistaArxius()


	
		
} // del main()
	

	
/*
 * IMPRIMIR LLISTA ARXIUS
 * 
 */
	
	
/*
 * 
 * LLEVAR EXTENSIONS ARXIUS
 * 	
 */
	
	



} // de la classe
