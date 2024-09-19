package com.curso.java.inicio.arrays.ejercicios;

/*
+ Definir array bidimensional de enteros de 2x3
+ Dar los valores de cada posición de una en una
+ Mostrar todos los datos en formato matriz con dos for anidados
+ Hacer los mismo con 2 foreach
 */
public class EjercicioArrays4 {

	public static void main(String[] args) {
		//Definir array bidimensional de enteros de 2x3
		int[][] numeros = new int[2][3];
		//Dar los valores de cada posición de una en una
		numeros[0][0]=1;
		numeros[0][1]=2;
		numeros[0][2]=3;
		
		numeros[1][0]=4;
		numeros[1][1]=5;
		numeros[1][2]=6;
		
		//Mostrar todos los datos en formato matriz con dos for anidados
		for(int i=0;i<numeros.length;i++) {//Filas
			for(int j=0;j<numeros[i].length   ; j++) {//Columnas
//				int [] numerosFila = numeros[i];
//				System.out.print(numerosFila[j]);
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		System.out.println("============================");
		//Hacer los mismo con 2 foreach
		for (  int[] filas   :  numeros ) {
			for ( int num : filas ) {
				System.out.print(num);
			}
			System.out.println();
		}

	}

}
