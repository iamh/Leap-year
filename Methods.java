/**
 * <h2>La clase Methodds se utiliza para realizar operaciones si un texto es tipp numérico o si un año es bisiesto/no bisiesto.<h2>
 *@author Israel Hernández
 *@version 16/02/2018
 *
 */

public class Methods {
	
	//Metodos publicos
	/**
	 * Recibe un String y devuelve true si el valor es tipo numérico
	 * @param text
	 * PARAMETRO DE ENTRADA CON VALOR DE CADA FILA DEL ARCHIVO DE TEXTO
	 * @return boolean
	 */
	
	public static boolean isNumeric(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	
	/**
	 * Recibe un String de tipo númerico, se hace un calculo para saber si el año es bisiesto
	 * @param text
	 * PARAMETRO DE ENTRADA CON VALOR DE CADA FILA DEL ARCHIVO DE TEXTO
	 * SE PASA A INTEGER EN UNA VARIABLE AÑO INT.
	 * @return boolean
	 */
	
	public static boolean isBisiesto(String text) {
		int año = Integer.parseInt(text);
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			return true;
		else 
			return false;
	}

}
