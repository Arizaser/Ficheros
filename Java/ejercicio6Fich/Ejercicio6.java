package ejercicio6Fich;

import java.io.*;

import utiles.Teclado;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author ariza
 *
 */

public class Ejercicio6 {
	public static void main(String[] args) throws IOException {
		
		String fichero = Teclado.leerCadena("Dime el nombre del fichero");
		String palabra = Teclado.leerCadena("Dime la palabra que quieres contar");
		int cont = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero + ".txt"));
			String linea = "";

			while (linea != null) {
				if (linea.equals(palabra)) {
					cont++;
				}
				linea = br.readLine();
			}
			br.close();
			System.out.println("La palabra se repite "+cont+" veces");

		} catch (FileNotFoundException e) {
			System.err.println("Ese archivo no existe");
		}

	}
}