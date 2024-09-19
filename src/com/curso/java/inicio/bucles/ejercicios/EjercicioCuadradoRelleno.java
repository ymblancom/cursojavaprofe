package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCuadradoRelleno {

	public static void main(String[] args) {
		System.out.println("Escribe tamaño del cuadrado");
		Scanner scan = new Scanner(System.in);
		int tamanio = scan.nextInt();
		
		int fila =0;
		while(tamanio>fila) {
			int columna = 0;
			while (tamanio>columna) {
				System.out.print("* ");
				columna++;
			}
			fila++;
			System.out.println();
		}
		
		System.out.println();
	}
}