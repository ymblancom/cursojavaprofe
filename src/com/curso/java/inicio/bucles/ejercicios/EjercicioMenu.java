package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;

public class EjercicioMenu {

	public static void main(String[] args) {
		int opcion=0;
		do {
			System.out.println("1. Pintar cuadrado");
			System.out.println("2. Validar email");
			System.out.println("3. Crear alumno");
			System.out.println("4. Salir");
			
//			System.out.println("Selecciona una opción");
			Scanner scan = new Scanner(System.in);
//			opcion = scan.nextInt();
			
			opcion = Utilidades.pideDatoNumerico("Selecciona una opción");
			
			System.out.println(opcion);
			
			
			switch(opcion) {
				case 1: 
					System.out.println("Escribe tamaño del cuadrado");
					scan = new Scanner(System.in);
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

					break;
				case 2: System.out.println("Vas a validar un email");break;
				case 3: System.out.println("Vas a crear un alumno");break;
				case 4: System.out.println("Adios!!!");break;
				default: System.out.println("Opción incorrecta!!");break;	
			}
			
			
		}while(opcion!=4);
		
	
		
	}

}

