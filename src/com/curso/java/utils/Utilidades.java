
package com.curso.java.utils;

import java.util.Scanner;

/**
 * Esta clase contiene métodos de utilidad para obtener la entrada del usuario.
 * Proporciona métodos para obtener tanto la entrada numérica como la de cadena
 * de texto.
 *
 * @author Jose Luis
 * @version 1.0
 */
public class Utilidades {

	/**
	 * Este método solicita al usuario una pregunta y devuelve la respuesta
	 * numérica. Utiliza un Scanner para leer la entrada del usuario desde la
	 * consola.
	 *
	 * @param pregunta La pregunta que se le hará al usuario.
	 * @return La respuesta numérica proporcionada por el usuario.
	 * @since 1.0
	 */
	public static int pideDatoNumerico(String pregunta) {
		int dato = 0;
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextInt();

		//calculaAnioNacimiento(28);
		
		return dato;
	}

	
	public static int calculaAnioNacimiento(int edad) {
		
		return 2024-edad;
	}
	/**
	 * Este método solicita al usuario una pregunta y devuelve la respuesta de
	 * cadena de texto. Utiliza un Scanner para leer la entrada del usuario desde la
	 * consola.
	 *
	 * @param pregunta La pregunta que se le hará al usuario.
	 * @return La respuesta de cadena de texto proporcionada por el usuario.
	 */
	public static String pideDatoString(String pregunta) {
		String texto = "";
		System.out.println(pregunta);
		// Crea un nuevo objeto Scanner que lee desde la entrada estándar
		Scanner scan = new Scanner(System.in);

	
		// Utiliza el objeto Scanner para leer la siguiente línea de entrada del usuario
		// y la almacena en la variable 'texto'
		texto = scan.nextLine();

		return texto;
	}
	
	
	
	public static boolean validarEmail(String email) {
		boolean esValido = false;
		
		
		return esValido;
	}
	
	public static void pintarMenu (String[] opcionesMenu, boolean pintaNumeros) {
		 
		
		if (pintaNumeros) {
			for (int i=0; i<opcionesMenu.length    ;  i++ ) {
				System.out.println(i+1 + ".-" + opcionesMenu[i]);
			}
		}else {
			for ( String opcion : opcionesMenu ) {
				System.out.println(opcion);
				
			}
		}
		
	}
	
	
	
}
