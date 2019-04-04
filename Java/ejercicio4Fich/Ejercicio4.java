package ejercicio4Fich;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import utiles.Teclado;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author ariza
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> palabras = new ArrayList<String>();
		String fichero = Teclado.leerCadena("Dime el nombre del fichero");
		

		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero + ".txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero + "_sort.txt"));

			
			String linea = "";

			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
			br.close();
			Collections.sort(palabras);

			for (String a : palabras) {
				bw.write(a + " ");
			}
			bw.close();

		} catch (FileNotFoundException e) {
			System.err.println("Ese archivo no existe");
		} catch (IOException e) {
			System.err.println("Fallo al escribir");
		}
	}

}
