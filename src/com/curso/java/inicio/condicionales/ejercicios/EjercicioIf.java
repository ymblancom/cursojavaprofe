package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioIf {

	public static void main(String[] args) {
		
		String asignatura = "Historia";
		String nombreAlumno = "Eva";
		int notaAlumno = 15;
		String notaStr = "";
		
		if (notaAlumno>=0 && notaAlumno<5) {
			notaStr = "suspenso";
		}else if (notaAlumno>=5 && notaAlumno<7) {
			notaStr = "aprobado";
		}else if (notaAlumno>=7 && notaAlumno<9) {
			notaStr = "notable";
		}else if (notaAlumno>=9 && notaAlumno<=10) {
			notaStr = "sobresaliente";
		}

		if(!notaStr.equals("")) {
			System.out.println("El alumno " + nombreAlumno +" en la asignatura "+ asignatura +" tiene un "+notaStr);
		}else {
			System.out.println("La nota "+ notaAlumno + " no es correcta");
		}
	}

}
