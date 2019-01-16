package dam.m11.ej1;

import java.util.Scanner;

public class LukeYoSoyTuPadre {

	private static Scanner sc;
	private static int numPersonajes; 
	private static String personajes;
	private static String parentesco;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		cantidadPersonajes();
		
		introducirPersonaje();
		
		sc.close();

	}

	private static void cantidadPersonajes() {
		
		System.out.println("Introduce la cantidad de personajes de la saga que quieres comprobar: ");
		numPersonajes = Integer.parseInt(sc.nextLine());
	}

	private static void introducirPersonaje() {
		
		for(int i = 0; i < numPersonajes; i++) {
			System.out.println("Introduce un nombre de un personaje de la saga: ");
			personajes = sc.nextLine();
			System.out.println("Este es el personaje que has elegido " + personajes);
			System.out.println("Introduce ahora el parentesco: ");
			parentesco = sc.nextLine();
			System.out.println("Este es el personaje que has elegido " + parentesco);
			
			if ("Luke".equals(personajes) && "padre".equals(parentesco)) {
				System.out.println("TOP SECRET");
			} else {
				System.out.println(personajes + " yo soy tu " + parentesco);
			}
			
		}
		
	}

}
