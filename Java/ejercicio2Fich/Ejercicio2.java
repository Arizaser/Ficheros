package ejercicio2Fich;

import java.io.*;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.err.println("Fallo");
		}

	}

}
