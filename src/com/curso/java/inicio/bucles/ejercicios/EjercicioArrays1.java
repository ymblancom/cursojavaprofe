package com.curso.java.inicio.bucles.ejercicios;


/*
 * Definir un array de enteros de longitud 3
Vais a dar los valores de cada posición de una  en una
Mostrar 
	+ Uno por uno
	+ Desde un bucle

+ Media de todos los numeros que hay en el array
 */
public class EjercicioArrays1 {

	public static void main(String[] args) {
		int [] numeros = new int [3];
		numeros[0] = 12;
		numeros[1] = 16;
		numeros[2] = 4;
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println("=====================");
		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			System.out.println(num);
		}
		
		System.out.println("===== Calculo de la media ======");
		//Bucle foreach
		double suma = 0;
		for ( int num  : numeros ) {
			//System.out.println(num);
			//suma = suma + num;
			suma += num;
		}
		System.out.println(suma/numeros.length);
	}

}






