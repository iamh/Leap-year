/**
 * <h2>La clase Main para realizar las pruebas, envios/recibir parametros.<h2>
 *@author Israel Hernández
 *@version 16/02/2018
 *
 */

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		File file = new File();
		String[] arrayString = new String[100];
		int n = 0;
		
		n = file.readFile(args[0], arrayString, n);
		
		Arrays.sort(arrayString, 0, n);
		
		file.writeFile(args[1], arrayString, n);
	}

}
