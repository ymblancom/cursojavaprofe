package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForCoches {

	public static void main(String[] args) {
		
		double velocidadMaxima = 0;
		
		System.out.println("Introduce número de coches");
		Scanner scan = new Scanner(System.in);
		int numeroCoches = scan.nextInt();
		
		for (int i=0; i<numeroCoches ; i++) {
			System.out.println("Introduce velocidad del coche " + (i+1));
			scan = new Scanner(System.in);
			double velocidadCoche = scan.nextDouble();
			System.out.println("La velocidad es "+velocidadCoche +" km/h");
			
			if (velocidadCoche>velocidadMaxima) {
				velocidadMaxima = velocidadCoche;
			}
			
		}
		System.out.println("El coche más rápido va a "+ velocidadMaxima + " km/h");

	}

}
