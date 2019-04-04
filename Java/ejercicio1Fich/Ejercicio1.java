package ejercicio1Fich;

import java.io.*;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 */

public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			for (int i = 2; i < 500; i++) {
				if(esPrimo(i)) {
					bw.write(i+"\n");
				}
			}
			bw.close();
			System.out.println("Se ha creado correctamente.");
		}
		catch(IOException e){
			System.err.println("Fallo");
		}
		
		
	
}

	static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
}