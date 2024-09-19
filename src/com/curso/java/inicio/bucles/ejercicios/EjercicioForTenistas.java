package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 Comentario 
 de 
 Bloque
 */

//Comentario de Línea

/**
 * Pedir número de tenistas, por cada tenista pedir su nombre y la posición que ocupa en el ranking. 
	Indicar cuantos tenistas hay entre los 10 primeros y el nombre del mejor tenista
 * @version 1.0
 * @author Jose Luis
 * @since 1.0
 */
public class EjercicioForTenistas {

	public static void main(String[] args) {
		System.out.println("Introduce número de tenistas");
		Scanner scan = new Scanner(System.in);
		int numeroTenistas = scan.nextInt();
		int contadorTenistas = 0;
		int rankingMayor = Integer.MAX_VALUE;
		String nombreMejorTenista = "";
		
		for (int i=0; i<numeroTenistas ; i++) {
			
			System.out.println("Introduce nombre del tenista " + (i+1));
			scan = new Scanner(System.in);
			String nombreTenista = scan.nextLine();
			
			System.out.println("Introduce posición del ranking del tenista " + (i+1));
			scan = new Scanner(System.in);
			int ranking = scan.nextInt();
		
			System.out.println("El tenista "+ nombreTenista + " está en la posición "+ ranking);
		
			if(ranking<=10) {
				contadorTenistas++;
			}
			
			if (ranking<rankingMayor) {
				rankingMayor = ranking;
				nombreMejorTenista = nombreTenista;
			}
			
			
		}
		
		System.out.println("Hay "+ contadorTenistas + " entre los 10 pimeros");
		System.out.println("Mejor tenista "+ nombreMejorTenista + " en la posición "+rankingMayor);
		
	}

}

	
	
	
	
	
	
	