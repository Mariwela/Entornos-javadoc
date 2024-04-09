package ejavadoc;

public class Calculadora {

	/*
	 * Suma dos números enteros.
	 * 
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return La suma de los dos números enteros.
	 * @thtow IllegalArgumentException si alguno de los números es negativo.
	 * 
	 */
	public static int sumar(int a,int b) {
		if (a<0 || b<0) {
			throw new IllegalArgumentException("Los números deben ser positivos");
		}
		return a+b;
	}
	/*
	 * Resta dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return La resta de los dos números enteros.
	 */
	public static int restar(int a,int b) {
		return a-b;
	}
	/*
	 * Multiplica dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return La multiplicación de los dos números enteros.
	 */
	public static int multiplicar(int a,int b) {
		return a*b;
	}
	/*
	 * Resta dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return La diferencia entre dos números.
	 */
	public static int dividir(int a,int b) {
		if (b==0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
		return a/b;
	}

}
