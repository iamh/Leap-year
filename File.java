/**
 * <h2>La clase File se utiliza para los metodos de leer y escribir en un archivo de texto.<h2>
 *@author Israel Hernández
 *@version 16/02/2018
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File {
	
	//Metodos publicos
	/**
	 * Leer un archivo de texto y agregar cada valor en el array de tipo String
	 * @param entryAddress
	 * PARAMETRO DE ENTRADA CON VALOR PATH DE ENTRADA
	 * @param a[]
	 * PARAMETRO DE ENTRADA QUE ES UN ARRAY, AGREGAMOS EN CADA POSICIÓN EL VALOR
	 * SI ES TIPO NUMÉRICO CONCATENADO DE UN TEXTO (BISIESTO/NO BISISESTO).
	 * @param n
	 * PARAMETRO DE ENTRADA CON VALOR 0
	 * @return n
	 * El tamaña del array
		 */
	
	public int readFile(String entryAddress, String[] a, int n) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(entryAddress));
			String bfReader;
			String info;
			while ((bfReader = bf.readLine()) != null) {
				if (Methods.isNumeric(bfReader)) {
					if (Methods.isBisiesto(bfReader)) {
						a[n] = bfReader+";Bisiesto/";
						n++;
					} else  {
						a[n] = bfReader+";NO Bisiesto/";
						n++;
					}
				}
			}
		} catch (Exception e) {}
		return n;
	}
	
	/**
	 * Recibe un array y sus valores se escriben en un fichero de texto.
	 * @param exitAddress
	 * PARAMETRO DE ENTRADA CON VALOR PATH DE SALIDA
	 * @param a[]
	 * PARAMETRO DE ENTRADA QUE ES UN ARRAY CON VALORES DE AÑOS BISIESTOS/NO BISIESTOS
	 * SE RECORRE EL ARRAY Y CADA VALOR SE ESCRIBE EN EL ARCHIVO.
	 */
	
	public void writeFile(String exitAddress, String[] a, int n) {
		try {
			FileWriter f = new FileWriter(exitAddress);
			for (int i = 0; i <= n-1; i++) {
				f.write(a[i]);
			}
			
			f.close();
		} catch (Exception e) {}
	}
	
}
