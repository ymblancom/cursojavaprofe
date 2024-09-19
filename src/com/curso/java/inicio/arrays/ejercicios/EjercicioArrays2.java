package com.curso.java.inicio.arrays.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Definir un array de nombres de alumnos de longitud (se pregunta). 
 * Mostrar solo aquellos alumnos que contengan una a en el nombre
Longitud de un array se puede saber con length
 */
public class EjercicioArrays2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce número de alumnos");
		int numAlumnos = scan.nextInt();
		String[] nombresAlumnos = new String[numAlumnos];

	
		nombresAlumnos[0] = "Luz";

		for (int i = 0; i < nombresAlumnos.length; i++) {
			System.out.println("Introduce nombre del alumno "+i);
			scan = new Scanner (System.in);
			String nombre = scan.nextLine();
			
			nombresAlumnos[i] = nombre;
			
		}
		
		for (String nombre : nombresAlumnos) {
			
			if(nombre.toLowerCase().contains("a")) {
				System.out.println(nombre);	
			}
		}

		
		
		
	
	}

}
