package com.curso.java.excepciones;

import com.curso.java.poo.ejercicios.ejercicio1.Alumno;
import com.curso.java.utils.Utilidades;

public class EjemploExcepciones {

	public static void main(String[] args) {
		System.out.println("Empieza");
		int[] numeros = {1,2,3,4};
		Alumno alumno = null;
		
		int edad = Utilidades.pideDatoNumerico("Introduce tu edad");
		
		try {
			
			Thread.sleep(10000);
			System.out.println("Hola Mundo");
			//"Hola".charAt(7);
//			System.out.println(7/0);
			pintaNombre(alumno);
			//System.out.println(numeros[4]);
			
		}catch(ArithmeticException ae){
			System.out.println("No puedes dividir entre 0");
		}catch(NullPointerException npe){
			System.out.println("Accediendo a un objeto que no existe: " + npe.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Se ha accedido a una posición de un array que no existe: "+ aiobe.getMessage());
		}catch(Exception e) {
			System.out.println("Error desconocido: "+ e.getMessage());
		}finally {
			System.out.println("Se ejecuta siempre");
		}
		
		
		try {
			metodo1();
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fin");
	}
	
	public static void metodo1() throws MiExcepcion{
		
		if(Math.random()>0.99) {
			MiExcepcion me = new MiExcepcion("Esto es un error propio");
			throw me;

		}else {
			NullPointerException npe = new NullPointerException("NullPointer creado por mi"); 
			throw npe;
		}

	}
	
	public static void pintaNombre (Alumno alumno) {
		
		if (alumno!=null) {
			System.out.println(alumno.getNombre());
		}else {
			NullPointerException npe = new NullPointerException("El alumno no exsite"); 
			throw npe;
		}
		
	}
	
	
	
	

}
