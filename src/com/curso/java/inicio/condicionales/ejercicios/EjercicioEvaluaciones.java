package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioEvaluaciones {

	public static void main(String[] args) {
		double calificacionFinal = 0;
		
		//Solicite las calificaciones de los exámenes, 
		//los proyectos y la participación de tres estudiantes.
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nombre del alumno 1");
		String nombreAlumno1 = scan.nextLine();
		
		System.out.println("Introduce la nota del examen 1 del alumno 1");
		scan = new Scanner(System.in);
		double notaExamen1Alumno1 = scan.nextDouble();
		
		System.out.println("Introduce la nota del examen 2 del alumno 1");
		scan = new Scanner(System.in);
		double notaExamen2Alumno1 = scan.nextDouble();
		
		System.out.println("Introduce la nota del proyecto 1 del alumno 1");
		scan = new Scanner(System.in);
		double notaProyecto1Alumno1 = scan.nextDouble();
		
		System.out.println("Introduce la nota del proyecto 2 del alumno 1");
		scan = new Scanner(System.in);
		double notaProyecto2Alumno1 = scan.nextDouble();
		
		System.out.println("Introduce la nota de participación 1 del alumno 1");
		scan = new Scanner(System.in);
		double notaParticipacionAlumno1 = scan.nextDouble();
		
		
		
		//Calculo la media de los dos exámenes
		double notaMediaExamenAlumno1 = (notaExamen1Alumno1+notaExamen2Alumno1)/2;
		
		if (notaMediaExamenAlumno1<50) {
			System.out.println("El alumno "+ nombreAlumno1 + " está supenso");
		}else {
			double notaMediaProyectosAlumno1 = (notaProyecto1Alumno1+notaProyecto2Alumno1)/2;
			calificacionFinal = (notaMediaExamenAlumno1 * 0.5) + (notaMediaProyectosAlumno1*0.4) + 
					(notaParticipacionAlumno1*0.1);
			
			System.out.println("Calificacion final antes de criterios "+calificacionFinal);
			
			if (notaMediaProyectosAlumno1>90 && notaParticipacionAlumno1>70) {
				calificacionFinal += calificacionFinal*0.05;
				//calificacionFinal = calificacionFinal + (calificacionFinal*0.05);
			}else if(notaParticipacionAlumno1<30) {
				calificacionFinal -= calificacionFinal*0.1;
			}
			
			System.out.println("La calificación final después de los criterios es "+ calificacionFinal);
			
			if(calificacionFinal>=50) {
				System.out.println("Alumno aprobado con un "+calificacionFinal);
			}else {
				System.out.println("Alumno suspenso con un "+calificacionFinal);
			}
			
		}
		

	}

}
