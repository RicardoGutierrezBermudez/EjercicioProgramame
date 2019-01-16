package dam.m11.ej2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Un elefante se balanceaba sobre la tela de una araña. Como veía que no se caía, fue a llamar a otro elefante. 
 * Dos elefantes se balanceaban sobre la tela de una araña. Como veían que no se caían, fueron a llamar a otro elefante. 
 * Tres elefantes se balanceaban...

 * Pero ¿hasta cuándo? ¿Cuántos elefantes pueden llegar a balancearse encima de una tela de araña antes de que se rompa? 
 * La canción no arroja ninguna luz sobre este particular, pero quizá tú puedas ayudarnos.

 * Entrada Cada caso, leído de la entrada estándar, consiste en dos líneas. La primera contiene el peso máximo soportado 
 * por la tela de araña. La segunda contiene los pesos de cada elefante, separados por espacio, en el orden en el que van 
 * llegando, y termina con un 0. Todos los números son enteros positivos menores que 109. La entrada acaba también con un 0, 
 * que no deberá procesarse.

 * Salida Para cada caso de prueba, el programa indicará, en la salida estándar, el número de elefantes que pudieron 
 * balancearse en la tela, antes de que esta se rompiera o de que no hubiera más elefantes dispuestos a arriesgarse.
 * Los elefantes se van incorporando a la diversión por estricto orden de llegada.
 * @author 21856675
 *
 */
public class Elefante {

	private static Scanner sc;
	private static int max;
	private static StringTokenizer peso;
	
	public static void main(String[] args) {
		
		pesoMax();
		
		sumaPesos();
		
		comprobarElefantes();
		
	}

	private static void comprobarElefantes() {
		String elefante;
		int pesoElefante;
		int suma = 0;
		int contElef = 0;
		for (int i = 0; i < peso.countTokens(); i++) {
			while(peso.hasMoreTokens()) {
				elefante = peso.nextToken();
				pesoElefante = Integer.parseInt(elefante);		
				suma = suma + pesoElefante;
				if(suma <= max) {
					contElef++;
				}
			}
		}
		
		System.out.println("La cantidad de elefantes que puede soportar la tela es: " + contElef);
		
	}

	private static void sumaPesos() {
		System.out.println("Introduce los pesos de los elefantes separados por espacios: ");
		peso = new StringTokenizer(sc.nextLine(), " ");
		
	}

	private static void pesoMax() {
		sc = new Scanner(System.in);
		System.out.println("Introduce el peso máximo que soportará la tela de araña: ");
		max = Integer.parseInt(sc.nextLine());
		
	}

}
