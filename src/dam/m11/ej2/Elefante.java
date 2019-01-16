package dam.m11.ej2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Un elefante se balanceaba sobre la tela de una ara�a. Como ve�a que no se ca�a, fue a llamar a otro elefante. 
 * Dos elefantes se balanceaban sobre la tela de una ara�a. Como ve�an que no se ca�an, fueron a llamar a otro elefante. 
 * Tres elefantes se balanceaban...

 * Pero �hasta cu�ndo? �Cu�ntos elefantes pueden llegar a balancearse encima de una tela de ara�a antes de que se rompa? 
 * La canci�n no arroja ninguna luz sobre este particular, pero quiz� t� puedas ayudarnos.

 * Entrada Cada caso, le�do de la entrada est�ndar, consiste en dos l�neas. La primera contiene el peso m�ximo soportado 
 * por la tela de ara�a. La segunda contiene los pesos de cada elefante, separados por espacio, en el orden en el que van 
 * llegando, y termina con un 0. Todos los n�meros son enteros positivos menores que 109. La entrada acaba tambi�n con un 0, 
 * que no deber� procesarse.

 * Salida Para cada caso de prueba, el programa indicar�, en la salida est�ndar, el n�mero de elefantes que pudieron 
 * balancearse en la tela, antes de que esta se rompiera o de que no hubiera m�s elefantes dispuestos a arriesgarse.
 * Los elefantes se van incorporando a la diversi�n por estricto orden de llegada.
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
		System.out.println("Introduce el peso m�ximo que soportar� la tela de ara�a: ");
		max = Integer.parseInt(sc.nextLine());
		
	}

}
