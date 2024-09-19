package com.curso.java.inicio.funciones.ejercicios;

public class Funciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pintarTexto(5, "Hola");
//		pintarTexto(3, "Adios");
		
		for (String color : args) {
            System.out.println(color);
        }
		
		int numRepeticiones = contarNumerosIguales(3,3,5);
		System.out.println(numRepeticiones);
		double dolares = convertirEurosADolares(8.5);
		System.out.println(dolares);
	}

	// Funcion que recibe un numero y un texto y me va a pintar el texto que le pasemos el numéro de veces indicado por el parámetro numérico
	public static void pintarTexto(int numero, String texto) {
		for (int i = 0; i < numero; i++) {
			System.out.println(texto);
		}
	}
	
	// Funcion que recibe tres numeros y te diga cuantos numeros son iguales
	public static int contarNumerosIguales(int num1, int num2, int num3) {
		int contador = 0;
		if (num1 == num2) {
			contador++;
		}
		if (num1 == num3) {
			contador++;
		}
		if (num2 == num3) {
			contador++;
		}

		return contador;
	}
	
	
	public static int contarNumerosIguales(int num1, int num2) {
		
		return contarNumerosIguales(num1, num2, 0);
		
	}
	
	
	/**
	 * This method converts a given amount of euros to dollars.
	 *
	 * @param euros The amount of euros to be converted.
	 * @return The equivalent amount in dollars.
	 */
	public static double convertirEurosADolares(double euros) {
		// The current exchange rate from euros to dollars.
		double dolar = 1.10;

		// Returns the converted amount in dollars.
		return euros * dolar;
	}
	
}
