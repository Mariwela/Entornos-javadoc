package ejavadoc;

public class ConvertorCelsiusFarenheit {

	/* Clase convierte grados celsius a grados fahrenheit y viceversa
	 * @author Marina Velic
	 * @version 1.2, 03/04/24
	 */
	
	/*
	 * Convertir grados Celsius a Fahrenheit
	 * @param grados Celsius
	 * @return Fórmula para pasar de grados Celsius a Fahrenheit.
	 */
	
	private static double convertirCelsiusAFahrenheit(double tempCelsius) {
		return (tempCelsius*9/5)+32;
	}

	/*
	 * Convertir grados Fahrenheit a Celsius
	 * @param grados Fahrenheit
	 * @return Fórmula para pasar de grados Fahrenheit a Celsius.
	 */
	private static double convertirFahrenheitACelsius(double tempFarenheit) {
		return (tempFarenheit-32)*5/9;
	}
}