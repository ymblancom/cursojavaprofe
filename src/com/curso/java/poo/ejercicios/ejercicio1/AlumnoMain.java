package com.curso.java.poo.ejercicios.ejercicio1;

import com.curso.java.utils.Utilidades;

public class AlumnoMain {

	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		
		
		Utilidades.pideDatoNumerico("dime tu edad");
		
		Alumno alumno1 = new Alumno();
		alumno1.setDni("1A");
		alumno1.setNombre("N1");
		alumno1.setApellidos("A1");
		alumno1.setNota(6.5);
		alumno1.setMayorEdad(true);
		alumno1.contador= 3;
		
		//Alumno.contador = 7;
		
		Alumno alumno2 = new Alumno("2B","N2","A2");
		alumno2.setNota(7);
		alumno2.setMayorEdad(false);
		
		System.out.println("contador: " + alumno2.contador);
		
		Alumno alumno3 = new Alumno("3C","N3","A3",4.75);
		alumno3.setMayorEdad(true);
		
		
		Alumno alumno4 = new Alumno("4D","N4","A4",true,2.25);
		
		System.out.println(alumno4.getNombre());
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		alumno4.verNota();
		
		
		String[] colores = {"Azul","Verde","Amarillo"};
		Alumno[] alumnos = {alumno1,alumno2,alumno3,alumno4}; 
		
		Alumno alumnoPos0 = alumnos[0];
		System.out.println(alumnoPos0.getNombre());
		
		AlumnoMain alumnoMain = new AlumnoMain();
		alumnoMain.mostrarInfoAlumno(alumnos);
		
		//Alumno.verNota();
		
		Utilidades.pideDatoNumerico("");
	}
	
	
	public void mostrarInfoAlumno(Alumno[] alumnos) {
		System.out.println("Alumnos aprobados");
		for (Alumno alumno : alumnos) {
			double nota = alumno.getNota();
			if(nota>=5) {
				System.out.println(alumno.getNombre() +" " +alumno.getApellidos() +": "+ nota);
			}
		}
		metodo1();
	}
	
	public static void metodo1() {
		System.out.println("Metodo1");
	}

}





