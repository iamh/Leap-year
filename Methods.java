/**
 * <h2>La clase Methodds se utiliza para realizar operaciones si un texto es tipp num�rico o si un a�o es bisiesto/no bisiesto.<h2>
 *@author Israel Hern�ndez
 *@version 16/02/2018
 *
 */

public class Methods {
	
	//Metodos publicos
	/**
	 * Recibe un String y devuelve true si el valor es tipo num�rico
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
	 * Recibe un String de tipo n�merico, se hace un calculo para saber si el a�o es bisiesto
	 * @param text
	 * PARAMETRO DE ENTRADA CON VALOR DE CADA FILA DEL ARCHIVO DE TEXTO
	 * SE PASA A INTEGER EN UNA VARIABLE A�O INT.
	 * @return boolean
	 */
	
	public static boolean isBisiesto(String text) {
		int a�o = Integer.parseInt(text);
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)))
			return true;
		else 
			return false;
	}

}
