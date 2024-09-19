package com.curso.java.inicio.arrays.ejercicios;

import java.util.Scanner;
/*
De una matriz 4x4
Pedir los datos de la matriz
Sacar los números de la diagonal
Invertir la diagonal y mostrar la matriz
 */
public class EjercicioArrays5 {

	public static void main(String[] args) {
		
		int[][] numeros = new int[4][4];

		for(int i=0;i<numeros.length;i++) {//Filas
			for(int j=0;j<numeros[i].length   ; j++) {//Columnas
				Scanner scan = new Scanner(System.in);
				System.out.println("Escribe un número para la posicion ["+i+"]["+j+"]");
				numeros[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<numeros.length;i++) {//Filas
			for(int j=0;j<numeros[i].length   ; j++) {//Columnas
				if (i==j) {
					System.out.print(numeros[i][j]+"\t");
				}
			}
		}
		System.out.println("=====================================");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i][i]+"\t");
		}
		
	}

}
