package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class IntroArrays {

	public static void main(String[] args) {
		
//		double notaAlumno1 = 7.5;
//		double notaAlumno2 = 5.5;
//		double notaAlumno3 = 8.5;
//		double notaAlumno4 = 3.5;
		
		double [] notaAlumnos = new double[4]; 
		notaAlumnos[1] = 5.5;
		System.out.println(notaAlumnos[3
		                               ]);
		
		Alumno alumno = new Alumno();
		alumno.nombre = "Juan";
		System.out.println(alumno.nombre);
		System.out.println(alumno);
		
		
	}

}

class Alumno{
	String nombre;
}
