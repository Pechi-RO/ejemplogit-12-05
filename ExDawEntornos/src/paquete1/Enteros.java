
/*
Esto es un anotacion java,
package determina en que paquete esta la clase, en este caso paquete 1
 */
package paquete1;
//Esto es otra forma de hacer una anotacion java, nombre de la clase, Enteros
public class Enteros {
	/**
	 *  Metodo para generar el factorial de un numero, siendo el nombre del metodo "r_factorial"
	 * @param n el parametro sera cualquiera menos 0
	 * @return resultado
	 * el resultado sera el factorial
	 */

public static int r_factorial(int n) {
	/*
	Generacion de la variable resultado
	 */
		int resultado;
// un if para evitar problemas con el numero 0
		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		/*
		Generamos la variable resultado que sera el valor a retornar
		 */
		return resultado;
}

	/**Otra forma de hacer el factorial
	 * @param n el numero a paritr del que calcularemos el factorial
	 * @return factorial
	 */
//Seguimos realizando el factorial a partir del resultado anterior
public static int factorial(int n) {
		int resultado;

		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		/*
		Este nuevo resultado lo usaremos en metodos posteriores
		 */
		return resultado;
}

	/**Recogemos el resultado en orden inverso
	 * @param cadena una cadena vacia
	 * @return una cadena String con el factorial en orden inverso
	 */
//Generamos el resultado al reves
public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
}

	/**averiguamos si hay numero capicua
	 * @param n numero a comprobar
	 * @return true o false segun si es o no
	 */
/*
Identificamos si hay un capicua en la cadena
 */
public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}

	/**Comprobamos si el numero es divisible por otros
	 * @param multiplo multiplo d ela operacion
	 * @param divisor divisor de la operacion
	 * @return retorna si es divisible o no
	 */
//Identificamos los numeros divisibles con el resultado
public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}

	/**Comprobamos si el numero es multiplo
	 * @param mult posible multiplo
	 * @param divisor divisor del posible multiplo
	 * @return resultado true/false
	 */
//Identificamos los multiplos del numero
public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
}
//Identificamos si el numero es primo o no

	/**comprobamos si el numero es primo o no
	 * @param n posible primo
	 * @return resultado true/false
	 */
public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
}

	/**mostramos cantidad de numeros primos
	 * @param n
	 * @return nº de primos
	 */
/*
Contamos el numero de numeros  primos
 */
public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
}

	/**en un vector recogemos los numeros primos hasta el numero que demos
	 * @param n numero limite
	 * @return nº de primos
	 */
public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
}

	/**identificamos los n primeros numeros primos
	 * @param n cantidad de nº primos a contar
	 * @return
	 */
//Identificamos los n primeros numeros primos y los metemos en un vector
public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}
}
